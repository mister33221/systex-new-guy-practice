import { Task } from './../task-list/model/task';
import { TaskService } from './service/task.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-task-operation',
  templateUrl: './task-operation.component.html',
  styleUrls: ['./task-operation.component.css'],
})
export class TaskOperationComponent implements OnInit {
  taskForm: FormGroup = new FormGroup({
    id: new FormControl(null),
    name: new FormControl('', [Validators.required]),
    description: new FormControl('', [Validators.required]),
  });

  // the data pass to task-list component
  testTask: Task = {
    id: 1,
    name: 'Test task',
    description: 'Test task description',
  };

  // get the data from task-list component
  taskSelected: any;

  // operation type
  operation: string = 'add';

  constructor(private router: Router, private taskService: TaskService) {}

  ngOnInit(): void {
    this.getTasks();
  }

  logout() {
    localStorage.removeItem('currentUser');
    this.router.navigate(['/login']);
  }

  save() {
    if (this.taskForm.valid) {
      let task: Task = this.taskForm.value;
      switch (this.operation) {
        case 'add':
          this.taskService.addTask(task).subscribe(() => {
            this.taskForm.reset();
          });
          break;
        case 'update':
          this.taskService.updateTask(task).subscribe(() => {
            this.taskForm.reset();
            this.operation = 'add';
          });
          break;
      }
    } else {
      alert('Please enter valid task name and description');
    }
  }

  onEdit($event: Task) {
    // different between set value and patch value ? : https://stackoverflow.com/questions/43040721/what-is-the-difference-between-setvalue-and-patchvalue-in-angular-2
    this.taskForm.setValue($event);
    this.operation = 'update';
  }

  getTasks() {
    this.taskService.getTasks().subscribe();
  }
}

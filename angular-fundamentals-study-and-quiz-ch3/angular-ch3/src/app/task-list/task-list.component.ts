import { Observable } from 'rxjs';
import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { TaskService } from '../task-operation/service/task.service';
import { Task } from './model/task';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css'],
})
export class TaskListComponent implements OnInit {

  tasks$: Observable<Task[]> = this.taskService.taskList$;

  // @Input() 表示這個屬性是從外部(父)傳入的
  @Input() inputTask: any;
  // @Output() 表示這個屬性是要傳出去給外部(父)使用的
  @Output() edit = new EventEmitter<Task>();

  constructor(
    private taskService: TaskService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
  }

  deleteTask(selectedTask: Task) {
    this.taskService.deleteTask(selectedTask.id).subscribe((data) => {
      this.taskService.getTasks().subscribe();
    });
  }

  editTask(selectedTask: Task) {
    this.edit.emit(selectedTask);
  }
}

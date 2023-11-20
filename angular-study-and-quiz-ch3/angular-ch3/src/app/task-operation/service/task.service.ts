import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, tap } from 'rxjs';
// import the Task model from the task.ts file
import { Task } from '../../task-list/model/task';

@Injectable({
  providedIn: 'root',
})
export class TaskService {
  url = 'http://localhost:8080/api/v1/';

  taskList$ = new BehaviorSubject<Task[]>([]);

  constructor(private http: HttpClient) {}

  /**
   * getTasks() method will return the list of tasks from the server
   * @returns Observable<Task[]>
   */
  getTasks() {
    return this.http
      .get<Task[]>(this.url + 'tasks')
      .pipe(tap((tasks) => this.taskList$.next(tasks)));
  }

  /**
   * updateTask() method will update the task to the server
   * @param task
   */
  updateTask(task: Task) {
    return this.http
      .put(this.url + 'updateTask', task)
      .pipe(tap((data) => this.getTasks().subscribe()));
  }

  /**
   * addTask() method will add the task to the server
   * @param task
   */
  addTask(task: Task) {
    return this.http
      .post(this.url + 'addTask', task)
      .pipe(tap((data) => this.getTasks().subscribe()));
  }

  /**
   * deleteTask() method will delete the task from the server
   */
  deleteTask(id: number) {
    return this.http.delete(this.url + 'deleteTask/' + id);
  }


  // pipe()是用來將多個operators串接成一個function的。

  // Rxjs
  // map(): 將來源Observable的每個值轉換成另一個值
  // ex: map(x => x * x) 將來源Observable的每個值平方
  // filter(): 將來源Observable的每個值過濾掉不符合條件的值
  // ex: filter(x => x % 2 === 0) 將來源Observable的每個值過濾掉奇數
  // tap(): 對來源Observable的每個值進行一個side effect，但是返回的Observable與來源相同
  // ex: tap(x => console.log(x)) 將來源Observable的每個值輸出到console
  // reduce(): 將來源Observable的每個值累加起來
  // ex: reduce((acc, x) => acc + x) 將來源Observable的每個值累加起來
  // concat(): 將多個Observable串接起來
  // ex: concat(Observable.of(1, 2, 3), Observable.of(4, 5, 6)) 將1, 2, 3, 4, 5, 6發射出來
  // merge(): 將多個Observable合併起來
  // ex: merge(Observable.of(1, 2, 3), Observable.of(4, 5, 6)) 將1, 4, 2, 5, 3, 6發射出來
  // combineLatest(): 將多個Observable合併起來，但是只有當每個Observable都有值時才會發射
  // ex: combineLatest(Observable.of(1, 2, 3), Observable.of(4, 5, 6)) 將1, 4, 2, 5, 3, 6發射出來
  // zip(): 將多個Observable合併起來，但是只有當每個Observable都有值時才會發射，並且會等到每個Observable都有值時才會發射
  // ex: zip(Observable.of(1, 2, 3), Observable.of(4, 5, 6)) 將1, 4, 2, 5, 3, 6發射出來
  // forkJoin(): 將多個Observable合併起來，但是只有當每個Observable都有值時才會發射，並且會等到每個Observable都有值時才會發射，並且會等到每個Observable都完成時才會發射
  // ex: forkJoin(Observable.of(1, 2, 3), Observable.of(4, 5, 6)) 將1, 4, 2, 5, 3, 6發射出來
  // startWith(): 在來源Observable的每個值前面加上一個值
  // ex: startWith(0) 在來源Observable的每個值前面加上0
  // endWith(): 在來源Observable的每個值後面加上一個值
  // ex: endWith(0) 在來源Observable的每個值後面加上0
  // delay(): 在來源Observable的每個值前面加上一個延遲
  // ex: delay(1000) 在來源Observable的每個值前面加上1秒的延遲
  // debounceTime(): 在來源Observable的每個值前面加上一個延遲，並且會等到延遲結束時才會發射
  // ex: debounceTime(1000) 在來源Observable的每個值前面加上1秒的延遲，並且會等到延遲結束時才會發射

}

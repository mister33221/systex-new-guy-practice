import { LoginService } from './service/login.service';
import { User } from './model/user';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  loginForm = new FormGroup({
    email: new FormControl('', [Validators.required]),
    password: new FormControl('', [Validators.required]),
  });

  constructor(
    private loginService: LoginService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {}

  login(): void {
    if (this.loginForm.valid) {
      localStorage.setItem('currentUser', this.loginForm.value.email!);
      this.router.navigate(['/task-operation']);
    } else {
      alert('Please enter valid email and password');
    }
  }
}

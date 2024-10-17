import { Component } from '@angular/core';

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.css']
})
export class LogInComponent {
  email: string = '';
  password: string = '';

  onSubmit(form: any){
    if(form.valid){
      console.log('Form Submitted', form.value);
    }
  }

}

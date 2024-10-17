import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css'],
})
export class ReservationComponent implements OnInit {
  reservationForm!: FormGroup;

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
    this.reservationForm = this.fb.group({
      name: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      guests: ['', [Validators.required]],
      phone: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      date: ['', [Validators.required]],
      time: ['', [Validators.required]],
      note: [''],
    });
  }

  onSubmit() {
    if (this.reservationForm.valid) {
      console.log(this.reservationForm.value);
    }
  }
}

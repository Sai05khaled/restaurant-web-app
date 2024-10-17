import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { BannerComponent } from './components/banner/banner.component';
import { BlogComponent } from './components/blog/blog.component';
import { ChefsComponent } from './components/chefs/chefs.component';
import { ContactComponent } from './components/contact/contact.component';
import { FooterComponent } from './components/footer/footer.component';
import { HeaderComponent } from './components/header/header.component';
import { ItemsComponent } from './components/items/items.component';
import { MenuComponent } from './components/menu/menu.component';
import { ReservationComponent } from './components/reservation/reservation.component';
import { ReviewComponent } from './components/review/review.component';
import { VideoBgComponent } from './components/video-bg/video-bg.component';
import { LogInComponent } from './components/log-in/log-in.component';
import { SignupComponent } from './components/signup/signup.component';

const routes: Routes = [
  {path:"", component : HomeComponent},
  {path:"about", component : AboutComponent},
  {path:"banner", component :BannerComponent},
  {path:"blog", component :BlogComponent},
  {path:"chefs", component :ChefsComponent},
  {path:"contact", component :ContactComponent},
  {path:"footer", component :FooterComponent},
  {path:"header", component :HeaderComponent},
  {path:"items", component :ItemsComponent},
  {path:"menu", component :MenuComponent},
  {path:"reservation", component :ReservationComponent},
  {path:"review", component :ReviewComponent},
  {path:"video-bg", component : VideoBgComponent},
  {path:"log-in", component : LogInComponent},
  {path: "signup", component : SignupComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

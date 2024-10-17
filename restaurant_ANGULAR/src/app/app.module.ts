import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { BannerComponent } from './components/banner/banner.component';
import { ItemsComponent } from './components/items/items.component';
import { AboutComponent } from './components/about/about.component';
import { VideoBgComponent } from './components/video-bg/video-bg.component';
import { MenuComponent } from './components/menu/menu.component';
import { ChefsComponent } from './components/chefs/chefs.component';
import { ReservationComponent } from './components/reservation/reservation.component';
import { ReviewComponent } from './components/review/review.component';
import { BlogComponent } from './components/blog/blog.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { ContactComponent } from './components/contact/contact.component';
import { LogInComponent } from './components/log-in/log-in.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SignupComponent } from './components/signup/signup.component';
import { ElementsComponent } from './components/elements/elements.component';
import { SingleBlogComponent } from './components/single-blog/single-blog.component';

@NgModule({
  declarations: [
    AppComponent,
    ReviewComponent,
    HeaderComponent,
    BannerComponent,
    ItemsComponent,
    AboutComponent,
    VideoBgComponent,
    MenuComponent,
    ChefsComponent,
    ReservationComponent,
    BlogComponent,
    FooterComponent,
    HomeComponent,
    ContactComponent,
    LogInComponent,
    SignupComponent,
    ElementsComponent,
    SingleBlogComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule, ReactiveFormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}

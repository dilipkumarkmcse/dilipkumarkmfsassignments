import { Component, NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProjectComponent } from './project/project.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { CalculatorService } from './calculator.service';
import { FinderService } from './finder.service';

const Route : Routes = [
  { path : 'home', component : HomeComponent},
  { path : 'about', component : AboutComponent},
  { path : 'contact', component : ContactComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    ProjectComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(Route)
  ],
  providers: [
    provideClientHydration(),
    CalculatorService,
    FinderService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

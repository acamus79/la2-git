import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AuthRoutingModule } from './auth-routing.module';
import { AuthComponent } from './auth.component';

import { LoginComponent, RegisterComponent } from '@gdp/auth/views';

import { ComponentsModule, MaterialModule } from '@gdp/shared/modules';

const views = [LoginComponent, RegisterComponent];

@NgModule({
  declarations: [AuthComponent, ...views],
  imports: [CommonModule, AuthRoutingModule, ComponentsModule, MaterialModule],
})
export class AuthModule {}

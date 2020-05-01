import { Routes } from "@angular/router";

import { DashboardComponent } from "../../pages/dashboard/dashboard.component";
import { UserComponent } from "../../pages/user/user.component";
import { TablesComponent } from "../../pages/tables/tables.component";

import { LoginComponent } from 'src/app/pages/login/login.component';
import { StaffComponent } from 'src/app/pages/staff/staff.component';

export const AdminLayoutRoutes: Routes = [
  { path: "dashboard", component: DashboardComponent },
  { path: "user", component: UserComponent },
  { path: "equipe", component: TablesComponent },
  { path: "login" , component:LoginComponent},
  { path: "staff" , component: StaffComponent}
  

];

import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Staff } from 'src/app/staff';
import { StaffService } from 'src/app/staff.service';
import { Router } from '@angular/router';
import { Equipe } from 'src/app/equipe';
import { EquipeService } from 'src/app/equipe.service';

@Component({
  selector: 'app-staff',
  templateUrl: './staff.component.html'

})
export class StaffComponent implements OnInit {

  staffs : Observable<Staff[]>
  staff :Staff=new Staff()
  submitted=false; 
  equipes :Observable<Equipe[]>;

  constructor(private equipeService :EquipeService,private staffService: StaffService ,private router: Router) { }
  
  ngOnInit(): void {
    this.reloadData();
    this.equipes=this.equipeService.getEquipesList();
  }
  reloadData() {
    this.staffs = this.staffService.getStaffsList();
  }
  deleteStaff(id: number) {
    this.staffService .deleteStaff(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }
  save() {
    this.staffService.createStaff(this.staff)
    .subscribe(data => console.log(data), error => console.log(error));
    this.staff = new Staff();
      window.location.reload();
    }
  onSubmit() {
    this.submitted = true;
    this.save();    
  }
     /* joueurDetails(id: number){
      this.router.navigate(['details', id]);
  }*/
  

}

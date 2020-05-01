import { Component, OnInit } from "@angular/core";
import { Equipe } from 'src/app/equipe';
import { EquipeService } from 'src/app/equipe.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: "app-tables",
  templateUrl: "tables.component.html"
})
export class TablesComponent implements OnInit {
  equipes : Observable<Equipe[]>
  equipe :Equipe=new Equipe()
  submitted=false; 
  constructor(private equipeService: EquipeService,private router: Router) { }
  
newEquipe():void{
  this.submitted=false;
  this.equipe=new Equipe();
}
  
ngOnInit(): void {
  this.reloadData();
}
reloadData() {
  this.equipes = this.equipeService.getEquipesList();
}
  save() {
    this.equipeService.createEquipe(this.equipe)
      .subscribe(data => console.log(data), error => console.log(error));
    this.equipe = new Equipe();
    window.location.reload();

   
  } 
  deleteEquipe(id: number) {
    this.equipeService .deleteEquipe(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }
  onSubmit() {
    this.submitted = true;
    this.save();    
  }

}

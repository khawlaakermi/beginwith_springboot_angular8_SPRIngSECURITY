import { Component, OnInit } from "@angular/core";
import Chart from 'chart.js';
import { Joueur } from 'src/app/joueur';
import { Observable } from 'rxjs';
import { JoueurService } from 'src/app/joueur.service';
import { Router } from '@angular/router';
import { Equipe } from 'src/app/equipe';
import { EquipeService } from 'src/app/equipe.service';

@Component({
  selector: "app-dashboard",
  templateUrl: "dashboard.component.html"
})
export class DashboardComponent implements OnInit {

  joueur :Joueur=new Joueur()
  submitted=false; 
  equipes :Observable<Equipe[]>
  joueurs:Observable<Joueur[]>
  constructor(private joueurService: JoueurService,private equipeService : EquipeService ,private router:Router) { }
  
  newJoueur():void{
    this.submitted=false;
    this.joueur=new Joueur();
    this.joueur.equipe=new Equipe();
  }

  ngOnInit(): void {
    this.reloadData();
    this.equipes=this.equipeService.getEquipesList();
  }
  reloadData() {
    this.joueurs = this.joueurService.getJoueursList();
  }
  deleteJoueur(id: number) {
    this.joueurService .deleteJoueur(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }
  save() {
      this.joueurService.createJoueur(this.joueur)
      .subscribe(data => console.log(data), error => console.log(error));
      this.joueur = new Joueur();
       window.location.reload();


  
  } 
  onSubmit() {
    this.submitted = true;
    this.save();    
  }
}

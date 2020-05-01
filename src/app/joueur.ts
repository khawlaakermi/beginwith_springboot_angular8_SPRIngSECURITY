import { Equipe } from './equipe'

export class Joueur{
    id:number
    nom:string
    email:string
    prenom:string
    numero:number
    equipe:Equipe
constructor(){}
//netstat -ano | findstr :4200   / taskkill /PID 15940 /F (probleme de port)
}
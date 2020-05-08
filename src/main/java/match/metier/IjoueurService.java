package match.metier;

import java.util.List;

import match.entities.Joueur;

public interface IjoueurService {
	List<Joueur> findAllJoueur();
	Joueur saveJoueur(Joueur pro);
	Joueur editJoueurNumero(int num,int id);
	void deleteJoueur(int id);
	void affecterJequipe(int ide , int idj);
	Joueur getjoueur(int id);

}

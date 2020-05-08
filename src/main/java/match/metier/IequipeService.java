package match.metier;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import match.entities.Equipe;
import match.entities.Joueur;
import match.entities.Staff;
public interface IequipeService {	
	List<Equipe> findAllEquipe();
	Equipe saveEquipe(Equipe equipe);
	void deleteEquipe(int id);
	Equipe getEquipe(int id);
	Set<Joueur>getJoueurEquipe (int id);
	Set<Staff>getstaffEquipe(int id);

}

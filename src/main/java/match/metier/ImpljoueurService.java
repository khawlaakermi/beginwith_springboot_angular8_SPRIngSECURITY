package match.metier;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import match.entities.Joueur;
import match.metier.IjoueurService;
import match.repository.equipeRepository;
import match.repository.joueurRepository;
@Service
public class ImpljoueurService implements IjoueurService{
	@Autowired
	private joueurRepository rep;
	@Autowired
	private equipeRepository repe;
	@Override
	public List<Joueur> findAllJoueur() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}
	@Override
	public Joueur saveJoueur(Joueur pro) {
		// TODO Auto-generated method stub
		return rep.save(pro);
	}

	@Override
	public Joueur editJoueurNumero(int num,int id) {
		Joueur j=rep.findById(id).get();
		if (j!= null)
		{
		j.setNumero(num);
		}
		return rep.save(j);		
	}
	@Override
	public void deleteJoueur(int id) {
		// TODO Auto-generated method stub
		Joueur j=rep.findById(id).get();
		rep.delete(j);		
	}

	@Override
	public void affecterJequipe(int ide, int idj) {
		// TODO Auto-generated method stub
		Joueur j=rep.findById(idj).get();
		j.setEquipe(repe.findById(ide).get());
		rep.save(j);		
	}

	@Override
	public Joueur getjoueur(int id) {
		// TODO Auto-generated method stub
		Joueur j=rep.findById(id).get();
		return j;
	}

}
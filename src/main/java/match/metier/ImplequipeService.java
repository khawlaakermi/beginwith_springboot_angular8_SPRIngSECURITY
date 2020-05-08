package match.metier;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import match.entities.Equipe;
import match.entities.Joueur;
import match.entities.Staff;
import match.metier.IequipeService;
import match.repository.equipeRepository;

@Service
public class ImplequipeService implements IequipeService {
    @Autowired
    private equipeRepository rep;
	@Override
	public List<Equipe> findAllEquipe() {
		// TODO Auto-generated method stub
		System.out.println("find all");
		return rep.findAll();
	}
	@Override
	public Equipe saveEquipe(Equipe equipe) {
		// TODO Auto-generated method stub
		return rep.save(equipe);
	}
	@Override
	public void deleteEquipe(int id) {
		// TODO Auto-generated method stub
		rep.deleteById(id);
		
	}
	@Override
	public Equipe getEquipe(int id) {
		// TODO Auto-generated method stub
		return rep.findById(id).get();
	}
	
	@Override
	public Set<Joueur>getJoueurEquipe(int id) {
		// TODO Auto-generated method stub
		Equipe e=rep.findById(id).get();
		
		return (Set<Joueur> ) e.getJoueurs();
	}
	@Override
	public Set<Staff> getstaffEquipe(int id) {
		// TODO Auto-generated method stub
	  Equipe e=rep.findById(id).get();
		
		return (Set<Staff> )e.getStaffs();
	}
	

}
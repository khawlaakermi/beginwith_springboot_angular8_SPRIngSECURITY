package match.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import match.entities.Equipe;
import match.entities.Staff;
import match.metier.IstaffService;
import match.repository.equipeRepository;
import match.repository.staffRepository;

@Service
public class ImplstaffService implements IstaffService {
	@Autowired
	private staffRepository rep;
	@Autowired
	private equipeRepository repe;
	@Override
	public List<Staff> findAllStaff() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}

	@Override
	public Staff saveStaff(Staff pro) {
		// TODO Auto-generated method stub
		return rep.save(pro);
	}

	@Override
	public Staff affecterEquipeStaff(int idstaff, int idequipe) {
		// TODO Auto-generated method stub
		Staff s=rep.findById(idstaff).get();
		Equipe e=repe.findById(idequipe).get();
		s.setEquipe(e);
		return rep.save(s);
	}

	@Override
	public void deleteStaff(int id) {
		// TODO Auto-generated method stub
		rep.delete(rep.findById(id).get());
		
	}

	@Override
	public Staff getStaff(int id) {
		// TODO Auto-generated method stub
		return rep.findById(id).get();
	}

}

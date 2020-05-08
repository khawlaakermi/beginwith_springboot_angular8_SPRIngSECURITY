package match.metier;

import java.util.List;

import match.entities.Staff;

public interface IstaffService {
	List<Staff> findAllStaff();
	Staff saveStaff(Staff pro);
	Staff affecterEquipeStaff(int idstaff,int idequipe);
	void deleteStaff(int id);
	Staff getStaff(int id);
}

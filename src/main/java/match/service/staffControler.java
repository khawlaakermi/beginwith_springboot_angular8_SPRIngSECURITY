package match.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import match.entities.Staff;
import match.metier.IstaffService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/staff")
public class staffControler {
	@Autowired
	private IstaffService sserv;
	@GetMapping(value="")
	public List<Staff> findAllStaff() 
	{		
		List<Staff> stafffs = sserv.findAllStaff();
        return stafffs;    
	}	
	@PostMapping(value="")
	public Staff savestaff(@Valid @RequestBody Staff pro)
	{
		return sserv.saveStaff(pro);
	}
	@PutMapping(value="/editstaffequipe/{ide}/{ids}")
	public Staff editstaffequipe(@PathVariable int ide , @PathVariable int ids)
	{
		return sserv.affecterEquipeStaff(ids, ide);
	}

	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable int id)
	{
		 sserv.deleteStaff(id);
	}
	@GetMapping(value="/{id}")
    public Staff getstaff(@PathVariable int id)
    {		
		return sserv.getStaff(id);
    }
	
    }

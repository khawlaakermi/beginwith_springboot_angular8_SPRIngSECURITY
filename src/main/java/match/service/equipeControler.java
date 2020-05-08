package match.service;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import match.entities.Equipe;
import match.entities.Joueur;
import match.entities.Staff;
import match.metier.IequipeService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/equipe")
// c'est un service rest
public class equipeControler {
	@Autowired // injection des dependances
	private IequipeService eserv; // appel au couche metier
	@GetMapping
	public List<Equipe> findAllEquipe() 
	{
		List<Equipe> equipes =eserv.findAllEquipe();
		return equipes;
	}
	@PostMapping(value="")
	public Equipe saveEquipe( @Valid @RequestBody Equipe equipe)
	{//requestbody cad les données sont dans la requetes
		return eserv.saveEquipe(equipe);
	}
	@GetMapping(value="/{id}")
	public Equipe getEquipe(@PathVariable int id)
	{
		return eserv.getEquipe(id);
	}
	@GetMapping(value="/joueurs/{id}")
	public Set<Joueur> getJoueurs(@PathVariable int id)
	{
		return eserv.getJoueurEquipe(id);
	}
	@GetMapping(value="/staffs/{id}")
	public Set<Staff> getStaffs(@PathVariable int id)
	{
		return eserv.getstaffEquipe(id);
	}
	 @DeleteMapping("/{id}")
	 public void deleteStaffs(@PathVariable int id)
	 {
		 eserv.deleteEquipe(id);
	 }
}
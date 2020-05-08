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
import match.entities.Joueur;
import match.metier.IjoueurService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/joueur")
public class joueurControler {

	@Autowired 
	private IjoueurService jserv;
	@GetMapping(value="")
	public List<Joueur> findAllJoueur() {
		List<Joueur> joueurs =jserv.findAllJoueur();
		return joueurs;
	}
	@PostMapping(value="")
	public Joueur saveJoueur(@Valid @RequestBody Joueur pro) {
		return jserv.saveJoueur(pro);
	}
	@PutMapping(value="/{id}/{num}")
	public Joueur EditnumEquipe( @PathVariable("num") int num , @PathVariable("id") int id )
	{
		return jserv.editJoueurNumero(num, id);
	}	
	@DeleteMapping("/{id}")
	public void DeleteJoueur(@PathVariable("id") int id)
	{
		jserv.deleteJoueur(id);
	}
	@PutMapping(value="/affecterjoueur/{ide}/{idj}")
	public void affecterJoueurEquipe(@PathVariable("ide") int ide,@PathVariable("idj") int idj)
	{
		jserv.affecterJequipe(ide, idj);
		
	}
	@GetMapping(value="/{id}")
   public Joueur getJoueur(@PathVariable int id)
   {
		return jserv.getjoueur(id);
   }
}

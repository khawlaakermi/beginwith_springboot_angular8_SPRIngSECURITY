package match.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Equipe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int id;
    private String nom;
    private Date date_creation;
    @JsonIgnore
    @OneToMany(mappedBy="equipe",cascade = CascadeType.ALL)
    private Set<Joueur> joueurs;
    @JsonIgnore
    @OneToMany(mappedBy="equipe",cascade = CascadeType.ALL)
    private Set<Staff> staffs;
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipe(int id, String nom, Set<Joueur> joueurs, Set<Staff> staffs,Date date_creation) {
		super();
		this.id = id;
		this.nom = nom;
		this.joueurs = joueurs;
		this.staffs = staffs;
		this.date_creation=date_creation;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Set<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(Set<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	public Set<Staff> getStaffs() {
		return staffs;
	}
	public void setStaffs(Set<Staff> staffs) {
		this.staffs = staffs;
	}
    
    
    

}


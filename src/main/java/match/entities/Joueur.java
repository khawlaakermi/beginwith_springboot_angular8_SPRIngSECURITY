package match.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Joueur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private int numero;

    @ManyToOne
	private Equipe equipe;

	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joueur(int id, String nom, String prenom, String email,int numero, Equipe equipe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.numero = numero;
		this.equipe = equipe;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	//@JsonIgnore // permet d'ignorer l'affichage json de l'equipe (objet vers json)
	public Equipe getEquipe() {
		return equipe;
	}
	//@JsonSetter // permet d'annuler l'ignore sur le set
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	

}

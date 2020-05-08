package match.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Staff implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private int id;
	private String designation;
	private int nombre_membre;
	@ManyToOne
	private Equipe equipe;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(int id, String designation, int nombre_membre, Equipe equipe) {
		super();
		this.id = id;
		this.designation = designation;
		this.nombre_membre = nombre_membre;
		this.equipe = equipe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getNombre_membre() {
		return nombre_membre;
	}
	public void setNombre_membre(int nombre_membre) {
		this.nombre_membre = nombre_membre;
	}
	//@JsonIgnore 
	public Equipe getEquipe() {
		return equipe;
	}
	//@JsonSetter
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	

}

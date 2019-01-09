package com.certificatic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
	@NamedQuery(name = "Partido.findAll", query = "SELECT p FROM Partido p ORDER BY p.idPartido")
})
@Table(name="partidos")
public class Partido {
	
	private static final long serialVersionUID = -7678811113801147817L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_partido")
	private int idPartido;
	private String siglas;
	private String nombre;
	@Column(name="fecha_registro")
	private String fechaRegistro;
	
	public Partido() {
		
	}
	
	//public Partido(int idPartido, String siglas, String nombre, String fechaRegistro) {
	public Partido(int idPartido, String siglas, String nombre, String fechaRegistro) {
		this.idPartido = idPartido;
		this.siglas = siglas;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
	}
	
	public int getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	public String getSiglas() {
		return siglas;
	}
	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "Partido [idPartido=" + idPartido + ", siglas=" + siglas + ", nombre=" + nombre + ", fechaRegistro="
				+ fechaRegistro + "]";
	}
	
	
	

}

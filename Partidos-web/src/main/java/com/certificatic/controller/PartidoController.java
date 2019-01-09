package com.certificatic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.certificatic.dao.PartidoDAO;
import com.certificatic.entity.Partido;

@Named
@RequestScoped
public class PartidoController {
	
	private Partido partido;
	
	@Inject
	PartidoDAO partidoDAO;
	
	private static List<Partido> partidos = new ArrayList();
	

	public PartidoController() {
		
		partido = new Partido();
	}
	
	
	public void guardar() {
		System.out.println("Partido: " + partido);
		partidos.add(partido);
		partido=  new Partido();
	}

	
	public void eliminar(Partido partido) {
		System.out.println("::Eliminado.." + partido);
		partidos.remove(partido);
		System.out.println("::Partido Eliminado::");
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
	public PartidoDAO getPartidoDAO() {
		return partidoDAO;
	}

	public void setPartidoDAO(PartidoDAO partidoDAO) {
		this.partidoDAO = partidoDAO;
	}

	/*
	 * se quito el estatic en el getter y setter de la lista de partidos
	 */
	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		PartidoController.partidos = partidos;
	}

}

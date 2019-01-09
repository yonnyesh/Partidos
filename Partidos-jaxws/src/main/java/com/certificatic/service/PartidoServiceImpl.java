package com.certificatic.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.jws.WebService;

import com.certificatic.dao.PartidoDAO;

//import com.certificatic.bean.Partido;

import com.certificatic.entity.Partido;

@WebService(endpointInterface="com.certificatic.service.PartidoServiceWS")

public class PartidoServiceImpl implements PartidoServiceWS{
	
	@Inject
	PartidoDAO partidoDAO;

	@Override
	public List<Partido> findAllPartido() {
		// TODO Auto-generated method stub
		return partidoDAO.findAllPartido();
	}

	@Override
	public void insertPartido(Partido partido) {
		partidoDAO.insertPartido(partido);
		
	}

	@Override
	public Partido findPartidoById(int idPartido) {
		return partidoDAO.findPartidoById(idPartido);
	}

	@Override
	public void deletePartido(int idPartido) {
		// TODO Auto-generated method stub
		partidoDAO.deletePartido(idPartido);
		
	}

	@Override
	public void updatePartido(Partido partido) {
		partidoDAO.updatePartido(partido);
		
	}

	
	//private static List<Partido> partidos= new ArrayList<>();

/*
	@Override
	public Partido create(Partido partido) {
		
		partidos.add(partido);
		return partido;
	}

	@Override
	public Partido readPartido(int idPartido) {
		return partidos.get(idPartido);
	}

	@Override
	public Partido updatePartido(Partido partido) {
		partidos.set(partido.getIdPartido(), partido);
		return partido;
	}

	@Override
	public Partido deletePartido(int idPartido) {
		
		Partido partido = partidos.get(idPartido);
		return partido;
		
		return partidos.remove(idPartido);
	}

	@Override
	public List<Partido> getAll() {
		return partidos;
	}
*/
}

package com.certificatic.service;

import java.util.List;

import javax.jws.WebService;

//import com.certificatic.bean.Partido;
import com.certificatic.entity.Partido;

@WebService
public interface PartidoServiceWS {
/*
	public Partido create(Partido partido);
	
	public Partido readPartido(int idPartido);
	
	public Partido updatePartido(Partido partido);
	
	public Partido deletePartido(int idPartido);
	
	public List<Partido> getAll();
*/	
	

	public List<Partido> findAllPartido();
	void insertPartido(Partido partido);
	Partido findPartidoById(int idPartido);
	void deletePartido(int idPartido);
	void updatePartido(Partido partido);

}

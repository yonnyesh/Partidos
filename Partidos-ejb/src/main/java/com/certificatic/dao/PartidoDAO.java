package com.certificatic.dao;

import java.util.List;

import javax.ejb.Local;

import com.certificatic.entity.Partido;

@Local
public interface PartidoDAO {
	
	public List<Partido> findAllPartido();
	void insertPartido(Partido partido);
	Partido findPartidoById(int idPartido);
	void deletePartido(int idPartido);
	void updatePartido(Partido partido);
/*
	public Partido create(Partido partido);
	
	public Partido readPartido(int idPartido);
	
	public Partido updatePartido(Partido partido);
	
	public Partido deletePartido(int idPartido);
	
	public List<Partido> findAllPartido();
*/

}

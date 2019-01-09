package com.certificatic.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.certificatic.entity.Partido;

@Stateless
public class PartidoDAOImpl implements PartidoDAO{
	
	@PersistenceContext(unitName="PartidoPU")
	EntityManager em;

	@Override
	public List<Partido> findAllPartido() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Partido.findAll").getResultList();
	}

	@Override
	public void insertPartido(Partido partido) {
		em.persist(partido);
		
	}

	@Override
	public Partido findPartidoById(int idPartido) {
		return em.find(Partido.class, idPartido);
	}

	@Override
	public void deletePartido(int idPartido) {
		Partido partido = em.find(Partido.class, idPartido);
		em.remove(partido);
		
	}

	@Override
	public void updatePartido(Partido partido) {
		em.merge(partido);
		
	}


}

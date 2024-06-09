package com.modelado.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.modelado.model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{
	
	@PersistenceContext
	private EntityManager entityM;
	
	@Override
	@Transactional
	public List<Usuario> ObtenerUsuario() {
		String query="From Usuario";
		List<Usuario> resultado=  entityM.createQuery(query).getResultList();
		return resultado;
	}
}

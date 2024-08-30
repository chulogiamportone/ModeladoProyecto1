package com.modelado.Dao;

import java.util.List;

import com.modelado.model.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {
	List<Usuario> ObtenerUsuario();

	void eliminar(Long id);

	void registrar(Usuario usuario);

}

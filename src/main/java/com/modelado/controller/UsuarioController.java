package com.modelado.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelado.Dao.UsuarioDao;
import com.modelado.model.Usuario;



@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDao usuarioD;
	
	@RequestMapping(value="inyeccionD")
	public List<Usuario> InyD() {
		return usuarioD.ObtenerUsuario();
		
	}
	
	@RequestMapping(value="prueba")
	public String prueba() {
		return "pete";
	}
	
	@RequestMapping(value="persona")
	public List<String> mostrarP(){
		return List.of("putin","pepe","papo");
	}
	
	
	
	
	
	
	
	
}

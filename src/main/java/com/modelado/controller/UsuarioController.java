package com.modelado.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.modelado.Dao.UsuarioDao;
import com.modelado.model.Usuario;



@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDao usuarioD;
	
	@RequestMapping(value="api/usuarios")
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
	
	@RequestMapping(value="api/usuarios/{id}",method=RequestMethod.DELETE)
	public void eliminar(@PathVariable Long id){
		usuarioD.eliminar(id);
			
	}
		
	@RequestMapping(value="api/usuarios",method=RequestMethod.POST)
	public void registarUsuario(@RequestBody Usuario usuario){
		usuarioD.registrar(usuario);
			
	}
		
	
	
	
	
	
	
}

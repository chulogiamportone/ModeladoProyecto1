
$(document).ready(function() {
	cargarUsuarios();
  $('#usuarios').DataTable();
});



async function cargarUsuarios() {
 
    const response = await fetch('api/usuarios', {
      method: 'GET',
      headers: { 'Accept': 'application/json','Content-Type': 'application/json' },
     
    });
    const usuarios = await response.json();
    
    let listadoHtml='';
    for(let usuario of usuarios){
		
		let botoneliminar='<a href="#" class="btn btn-circle btn-sm"><i class="fas fa-trash"></i></a>'
		let usuarioHtml='<tr><td>'+usuario.id+'</td><td>'+usuario.nombre+'</td><td>'+usuario.apellido+'</td><td>'+
		usuario.email+'</td><td>'+usuario.telefono+'</td><td>'+botoneliminar+'</td></tr>'
		
		listadoHtml+=usuarioHtml;
	}
	
    document.querySelector('#usuariotbody').outerHTML=listadoHtml;
  
}
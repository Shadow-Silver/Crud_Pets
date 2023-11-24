// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios() {

  const request = await fetch("usuario/234", {
    method: "GET",
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
});
  const usuarios = await request.json();

  let ListadoHtml='';

  for (let usuario of usuarios) {

    console.log(usuarios);
    let usuarioHtml = '<tr><td>'+usuario.id+'</td><td>' + usuario.nombre + '' + usuario.nombre + '</td><td>' + usuario.email + '</td> <td>' + usuario.telefono + '</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"> <i class="fas fa-trash"></i></a> </td> </tr>'

  ListadoHtml+= usuarioHtml;
  }
document.querySelector('#usuarios tbody').outerHTML= ListadoHtmlS;
}
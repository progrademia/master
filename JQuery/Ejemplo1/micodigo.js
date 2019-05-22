$(document).ready(function(){
	//$("h1").css({"background-color":"black", "color": "white"})
	var i=3; 

	$('#botonFinal').click(function(){
		var contenido = $('.miTexto').val();
		$("ul").append("<li id='elemento"+i+"' class='list-group-item'>"+i+"."+contenido+"</li>");
		i++;
	});

	$('#botonPrincipio').click(function(){
		var contenido = $('.miTexto').val();
		$("ul").prepend("<li id='elemento"+i+"' class='list-group-item'>"+i+"."+contenido+"</li>");
		i++;
	});

	$('#botonEliminar').click(function(){
		var contenido = $('.miTexto').val();
		$('#elemento'+contenido).remove();
	});

	$('#mostrarOcultar').click(function(){
		$('.lista').toggleClass('ocultarLista');
	});

	$(document).on('click', 'li', function(){
		$(this).toggleClass("seleccionado");
	});

	$('#eliminarSeleccionados').click(function(){
		$('.seleccionado').remove();
	})
});

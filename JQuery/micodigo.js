$(document).ready(function(){

	//$('p').html('párrafos cambiados');	
	$('#parrafo1').html('mi párrafo 1 ha cambiado');
	$('.micambio').html('Cambiando desde clase');

	$('div p').html('Párrafos del div');
	$('div').addClass('miclase');
	$('h1').removeClass('micambio');
	$('#parrafo1').removeClass('micambio');
	$('p').addClass('nuevaClase');
	$('p').addClass('otraClase');

})
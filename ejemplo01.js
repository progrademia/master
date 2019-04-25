

 var miNombre = document.getElementById("nombre");
 miNombre.innerHTML="Alex";
 document.getElementById("ejemplo").innerHTML = " Pérez";
 console.log("Hola mundo");




window.addEventListener("load", function(){
    document.getElementById("ejemplo").innerHTML = " Zapata";
    console.log("Ya se ha cargado la página");
    
   var boton = document.getElementById("entradaBoton");
   boton.addEventListener("click", function(){
         var edadCampoTexto = document.getElementById("entradaTexto");
         var  salidaTexto = document.getElementById("salidaTexto");
         var valorTexto = edadCampoTexto.value;
         var edad = parseInt(valorTexto);
         //console.log(edad);
         var resultado = "";
         if (isNaN(edad)){
             resultado = "Introduce un valor numérico";
         } else if (isFinite(edad)){
              resultado =( 60 - edad)  + " años para llegar a los 60.";
         }
        else{ resultado = "No podemos dividir por cero";
        
     }
       var miCadena= "Esto es na cadena. ";
       var miCadena2 = new String("esto es una cadena. ");
       miCadena2 = miCadena2 + miCadena;
       
       console.log(miCadena2);
       var formato = new Intl.NumberFormat("es-ES", {style : "currency", currency:"EUR", maximumFractionDigits:2});
         salidaTexto.innerHTML = miCadena2.split(" ");
         console.log(miCadena2.split(" "));
         var miTabla = miCadena2.split(" ");
         
         console.log(miTabla[2]);
       
   }, false);
    
    

}, false);


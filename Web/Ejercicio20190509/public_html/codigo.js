window.addEventListener("load",
        function(){
         var listaElementos = document.getElementById("listaPersona");
         document.getElementById("addViajero")
                 .addEventListener("click",
                 function() {
                     var nuevoElemento= listaElementos.getElementsByTagName("li")[0]
                             .cloneNode(true);
                     var botonEliminar = document.createElement("input");
                     botonEliminar.setAttribute("type", "button");
                     botonEliminar.setAttribute("value", "Eliminar");
                     botonEliminar.addEventListener("click", 
                       function(){
                        listaElementos.removeChild(nuevoElemento);   
                       });
                     nuevoElemento.appendChild(botonEliminar)  ;
                     listaElementos.appendChild(nuevoElemento);             
                 }
            );
         document.getElementById("botonCalculadora")
                 .addEventListener("click",
                 function() {
                      
                      var salidaElemento = document.getElementById("salida");
                      var resultado = [];
                      var elementoPersona=listaElementos.getElementsByTagName("li");
                      var totalEdad = 0;
                      var ahora = new Date();
                      for(i=0; i < elementoPersona.length; i++){
                          var inputElementos = elementoPersona[i].getElementsByTagName("input");
                          var persona = new Persona();
                          for(j=0; j<inputElementos.length; j++){
                              if(inputElementos[j].name === "nombre"){
                                  persona.nombre =inputElementos[j].value; 
                              }
                              if(inputElementos[j].name === "edad"){
                                  persona.edad = parseInt(inputElementos[j].value); 
                                  totalEdad += persona.edad;
                              }
                          }
                          resultado.push(persona);
                      }
                      var totalViaje = parseFloat(document.getElementById("totalCobrar").value);
                      var porcentajeViaje = parseInt(document.getElementById("viaje").value);
                      var total = totalViaje + (totalViaje * (porcentajeViaje/100));
                      var pagoParcial = total/totalEdad;
                      for(i=0;i<resultado.length;i++){
                          resultado[i].factura = pagoParcial*resultado[i].edad;
                      }
                      salidaElemento.innerHTML = resultado.join("<br/>");
                 });
        });

function Persona(){
   this.nombre ="";
   this.edad = 1;
   this.factura = 0;
}

Persona.prototype.toString = function() {
    
    var facturaCadena = this.factura.toLocaleString("es-ES",{style:"currency",
    currency:"EUR", maximumFractionDigits:2});
    return this.nombre + "[" + this.edad + "] paga " + facturaCadena;
};

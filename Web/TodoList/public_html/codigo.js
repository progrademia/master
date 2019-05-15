function Tarea(titulo){
    this.titulo = titulo;
    this.realizada = false;
    this.id = 0;
}

var todasTareas = [];
var ultimoId = 0;

window.addEventListener("load",
        function(){
           // obtener información del Local Storage
           var tareasCargadas = JSON.parse(localStorage.getItem("tareas"));
           if(!tareasCargadas) {
               tareasCargadas = [];
           }
           for(i=0; i<tareasCargadas.length; i++){
               addTareas(tareasCargadas[i]);
           }
           var addBotonNuevo = document.getElementById("addTarea");
           addBotonNuevo.addEventListener(
                   "click", function () {
                      var entradaTitulo = document.getElementById("tituloTarea");
                      var tarea = new Tarea(entradaTitulo.value);
                      addTareas(tarea);
                       entradaTitulo.value = "";
                       
                   });
            
            
        });

function addTareas(tarea){
    todasTareas.push(tarea);
    tarea.id = ultimoId++;
    var contenedorListaTareas = document.getElementById("listaTareas");
    var nodoTarea = document.createElement("li");
    nodoTarea.setAttribute("id", "tarea"+tarea.id);
    
    var checkbox = document.createElement("input");
    checkbox.setAttribute("type", "checkbox");
    if(tarea.realizada) {
        checkbox.setAttribute("checked", "checked");
    }
    checkbox.addEventListener("change", function(){
       tarea.realizada = !tarea.realizada;
       if(tarea.realizada) {
        checkbox.setAttribute("checked", "checked");
       } else {
           checkbox.removeAttribute("checked");
       }
       guardar();
    });
    
    nodoTarea.appendChild(checkbox);
    
    var texto = document.createTextNode(tarea.titulo);
    nodoTarea.appendChild(texto);
    /* Boton eliminar*/
    contenedorListaTareas.appendChild(nodoTarea);
    guardar();
}


function removeTareas(tarea){
    
}

function guardar(){
    localStorage.setItem("tareas", JSON.stringify(todasTareas));
}
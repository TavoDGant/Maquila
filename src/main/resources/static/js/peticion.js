const tabla = document.querySelector("#list-products tbody");
const allTable = document.getElementById("list-products");

function traerDatos() {
    //cleanBody();
    fetch('http://localhost:8080/empleado')
        .then(response => response.json())
        .then(empleados => {
            console.log(empleados);
            empleados.forEach(empleado=>{
                console.log(empleado.nombre)
                for (let i = 0; i < empleado.tareas.length; i++) {
                   console.log(empleado.tareas[i].cortes);   
                   console.log(empleado.tareas[i].fechaCorte); 
                   console.log(empleado.tareas[i].sueldo); 
                }
            })
            getEmpleados(empleados);
        })
}
traerDatos();

function getEmpleados(empleados) {
    empleados.forEach(empleado => {
        const row = document.createElement('tr');
        var id = empleado.id_empleado;
        var nombre = empleado.nombre;
        var fecha = empleado.nacimiento;
        var recorte = fecha.slice(0,10);
        row.innerHTML += `
            <td>${id}</td>
            <td>${nombre}</td>
            <td>${recorte}</td>
            <td><a href="">Detalles</a></td>
        `;
        tabla.appendChild(row);
    });
}
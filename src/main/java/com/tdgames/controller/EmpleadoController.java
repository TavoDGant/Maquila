package com.tdgames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tdgames.entity.Empleado;
import com.tdgames.service.EmpleadoService;

@CrossOrigin
@RestController
public class EmpleadoController {

	@Autowired
	EmpleadoService service;
	
	@GetMapping("empleado/lista")
	public List<Empleado> listarEmpleados(){
		return service.listaEmpleados();
	}
	
	@PostMapping("empleado/agregar")
	public ResponseEntity<String> addEmpleado(@RequestBody Empleado empleado){
		return service.agregarEmpleado(empleado);
	}
	
	@PutMapping("empleado/actualizar")
	public ResponseEntity<String> updateEmpleado(@RequestBody Empleado empleado){
		return service.actualizarEmpleado(empleado);
	}
	
	@DeleteMapping("empleado/eliminar/{id}")
	public ResponseEntity<String> deleteEmpleado(@PathVariable Integer id){
		return service.eliminarEmpleado(id);
	}
	
	@GetMapping("empleado/{id}")
	public Optional<Empleado> findPorID(@PathVariable Integer id){
		return service.buscarEmpleadoID(id);
	}
}

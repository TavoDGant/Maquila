package com.tdgames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tdgames.entity.Empleado;
import com.tdgames.service.EmpleadoService;

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
}

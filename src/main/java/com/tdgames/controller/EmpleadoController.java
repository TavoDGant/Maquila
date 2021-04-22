package com.tdgames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdgames.entity.Empleado;
import com.tdgames.service.EmpleadoService;

@RestController
public class EmpleadoController {

	@Autowired
	EmpleadoService service;
	
	@GetMapping("/Empleados")
	public List<Empleado> listarEmpleados(){
		return service.listaEmpleados();
	}
}

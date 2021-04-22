package com.tdgames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tdgames.dao.EmpleadoDAO;
import com.tdgames.entity.Empleado;

@Service
public class EmpleadoService {

	@Autowired
	EmpleadoDAO dao;
	
	public List<Empleado> listaEmpleados(){
		return dao.findAll();
	}
	
	public ResponseEntity<String> agregarEmpleado(Empleado empleado){
		try {
			dao.save(empleado);
			return new ResponseEntity<>("Empleado '"+ empleado.getNombre()+"' ingresado correctamente." , HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al ingresar empleado.\n" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<String> actualizarEmpleado(Empleado empleado){
		try {
			dao.save(empleado);
			return new ResponseEntity<>("Empleado '"+ empleado.getNombre()+"' actualizado correctamente." , HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al actualizar empleado.\n" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

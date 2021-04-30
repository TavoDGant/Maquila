package com.tdgames.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tdgames.dao.EmpleadoDAO;
import com.tdgames.entity.Empleado;
import com.tdgames.entity.Tareas;

@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoDAO dao;
	
	public List<Empleado> listaEmpleados(){
		return dao.findAll();
	}
	
	public ResponseEntity<String> agregarEmpleado(Empleado empleado){
		List<Tareas> tarea = empleado.getTareas();
		for (Tareas tar : tarea) {
			int t = tar.getCortes();
			double sueldo = t * 0.25;
			tar.setSueldo(sueldo);
		}
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
	
	public ResponseEntity<String> eliminarEmpleado(Integer id){
		try {
			dao.deleteById(id);
			return new ResponseEntity<>("Empleado con el id: "+ id +". Ha sido eliminado correctamente." , HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al eliminar empleado.\n" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public Optional<Empleado> buscarEmpleadoID(Integer id){
		return dao.findById(id);
	}
	
	public List<Empleado> buscarSiContiene(String nombre){
		return dao.findByNombreContaining(nombre);
	}
}

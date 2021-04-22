package com.tdgames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}

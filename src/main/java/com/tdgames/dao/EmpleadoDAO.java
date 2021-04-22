package com.tdgames.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdgames.entity.Empleado;

@Repository
public interface EmpleadoDAO extends JpaRepository<Empleado, Integer>{

	List<Empleado> findByNombre(String nombre);
	List<Empleado> findByNombreContaining(String nombre);
}

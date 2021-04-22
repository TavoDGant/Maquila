package com.tdgames.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private Integer id_empleado;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "nacimiento")
	private Calendar nacimiento;
	
	@OneToMany(targetEntity = Tareas.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "et_fk", referencedColumnName = "id_empleado")
	private List<Tareas> tareas;

	public Integer getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(Integer id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Calendar getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Calendar nacimiento) {
		this.nacimiento = nacimiento;
	}

	public List<Tareas> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tareas> tareas) {
		this.tareas = tareas;
	}

	public Empleado(Integer id_empleado, String nombre, String apellidos, Calendar nacimiento, List<Tareas> tareas) {
		super();
		this.id_empleado = id_empleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacimiento = nacimiento;
		this.tareas = tareas;
	}

	public Empleado() {
		super();
	}

}
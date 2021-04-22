package com.tdgames.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tareas")
public class Tareas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tarea")
	private Integer id_tarea;
	
	@Column(name = "cortes", table = "tareas")
	private Integer cortes;
	
	@Column(name = "fechaCorte", table = "tareas")
	private Calendar fechaCorte;
	
	@Column(name = "sueldo" , table = "tareas")
	private Double sueldo;

	public Integer getId_tarea() {
		return id_tarea;
	}

	public void setId_tarea(Integer id_tarea) {
		this.id_tarea = id_tarea;
	}

	public Integer getCortes() {
		return cortes;
	}

	public void setCortes(Integer cortes) {
		this.cortes = cortes;
	}

	public Calendar getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(Calendar fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Tareas(Integer id_tarea, Integer cortes, Calendar fechaCorte, Double sueldo) {
		this.id_tarea = id_tarea;
		this.cortes = cortes;
		this.fechaCorte = fechaCorte;
		this.sueldo = sueldo;
	}

	public Tareas() {
		super();
	}
	
}

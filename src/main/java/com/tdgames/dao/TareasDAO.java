package com.tdgames.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdgames.entity.Tareas;

@Repository
public interface TareasDAO extends JpaRepository<Tareas, Integer>{

}

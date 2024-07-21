package com.ProyectoAdopciones.dao;

import com.ProyectoAdopciones.domain.Perrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerritoDao extends JpaRepository <Perrito, Long> {

}

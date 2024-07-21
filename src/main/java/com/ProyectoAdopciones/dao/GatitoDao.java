package com.ProyectoAdopciones.dao;

import com.ProyectoAdopciones.domain.Gatito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GatitoDao extends JpaRepository <Gatito, Long> {

}
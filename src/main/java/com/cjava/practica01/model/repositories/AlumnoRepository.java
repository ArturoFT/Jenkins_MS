package com.cjava.practica01.model.repositories;

import com.cjava.practica01.model.entities.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
}

package com.cjava.practica01.service;

import com.cjava.practica01.model.entities.Alumno;

import java.util.List;

public interface AlumnoService {
    public String registrarAlumno(Alumno alumno);
    public String actualizarAlumno(Alumno alumno);
    public String eliminarAlumno(Integer id);
    public List<Alumno> listarAlumno();
    public Alumno buscarAlumno(Integer id);
}

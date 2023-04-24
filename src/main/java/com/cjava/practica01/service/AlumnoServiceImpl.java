package com.cjava.practica01.service;

import com.cjava.practica01.model.entities.Alumno;
import com.cjava.practica01.model.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    AlumnoRepository alumnoRepository;
    @Override
    public String registrarAlumno(Alumno alumno) {
        String resultado="";
        try {
            Alumno newAlumno=alumnoRepository.save(alumno);
            if(newAlumno != null) {
                resultado= "Se registro los datos del Alumno";
            }else{
                resultado=  "No se registro los datos del  Alumno";
            }
        }catch (Exception e){
            resultado=  "No se registro los datos del  Alumno - Error : "+e.getMessage();
        }
        return resultado;
    }

    @Override
    public String actualizarAlumno(Alumno alumno) {
        String resultado="";
        try {
            Alumno existe =  alumnoRepository.findById(alumno.getId()).orElse(null);
            if(existe != null) {
                Alumno updateAlumno=alumnoRepository.save(alumno);
                if(updateAlumno != null) {
                    resultado= "Se actualizo los datos del Alumno";
                }else{
                    resultado=  "No se actualizo los datos del  Alumno";
                }
            }else {
                resultado=  "No existe datos del Alumno";
            }
        }catch (Exception e){
            resultado=  "No se actualizo los datos del Alumno - Error : "+e.getMessage();
        }
        return resultado;
    }

    @Override
    public String eliminarAlumno(Integer id) {
        String resultado="";
        try {
            Alumno alumno = buscarAlumno(id);
            if(alumno != null) {
                alumnoRepository.deleteById(id);
                resultado= "Se elimino los datos del Alumno";
            }else{
                resultado=  "No existe datos del Alumno";
            }
        }catch (Exception e){
            resultado=  "No se elimino los datos del Alumno - Error : "+e.getMessage();
        }
        return resultado;
    }

    @Override
    public List<Alumno> listarAlumno() {
        return (List<Alumno>)alumnoRepository.findAll();
    }

    @Override
    public Alumno buscarAlumno(Integer id) {
        return alumnoRepository.findById(id).orElse(null);
    }
}

package com.cjava.practica01.ws;

import com.cjava.practica01.model.entities.Alumno;
import com.cjava.practica01.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AlumnoRestController {

    @Autowired
    AlumnoService alumnoService;
    @GetMapping("/alumnos")
    public List<Alumno> getAlumnos(){
        List<Alumno> lista = alumnoService.listarAlumno();
        return lista;
    }

    @GetMapping("/alumno/{id}")
    public Alumno getAlumno(@PathVariable Integer id) {
        Alumno alumno = alumnoService.buscarAlumno(id);
        return alumno;
    }

    @PostMapping("/alumno")
    public String addAlumno(@RequestBody Alumno newAlumno){
        return alumnoService.registrarAlumno(newAlumno);
    }

    @PutMapping("/alumno")
    public String updateAlumno(@RequestBody Alumno alumno){
        return alumnoService.actualizarAlumno(alumno);
    }

    @DeleteMapping("/alumno/{id}")
    public String deleteAlumno(@PathVariable Integer id){
        return alumnoService.eliminarAlumno(id);
    }
}

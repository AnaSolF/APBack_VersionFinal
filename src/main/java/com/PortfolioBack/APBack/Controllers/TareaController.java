/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBack.APBack.Controllers;

import com.PortfolioBack.APBack.Models.Tarea;
import com.PortfolioBack.APBack.Services.TareaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    //listar
    @GetMapping("/tareas")
    public List<Tarea> listar() {
        return tareaService.findAll();
    }

    //guardar
    @PostMapping("/tareas")
    public Tarea guardar(@RequestBody Tarea tarea) {
        return tareaService.save(tarea);
    }

    ;
    
    //get Una Tarea
    @GetMapping("/tareas/{id}")
    public Tarea getUnaTarea(@PathVariable Integer id) {
        return tareaService.findById(id);
    }

    ;
    
    //Modificar
    @PutMapping("/tareas/{id}")
    public Tarea modificar(@RequestBody Tarea tarea, @PathVariable Integer id) {
        Tarea tareaActual = tareaService.findById(id);
        tareaActual.setTarea(tarea.getTarea());
        tareaActual.setPorcentaje(tarea.getPorcentaje());
        return tareaService.save(tareaActual);
    }

    ;
    
    //Eliminar
    @DeleteMapping("/tareas/{id}")
    public void eliminar(@PathVariable Integer id) {
        tareaService.delete(id);
    }
;
}


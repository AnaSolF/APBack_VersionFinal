/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBack.APBack.Controllers;

import com.PortfolioBack.APBack.Models.Proyecto;
import com.PortfolioBack.APBack.Services.ProyectoService;
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

public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;

//listar
    @GetMapping("/proyectos")
    public List<Proyecto> listar() {
        return proyectoService.findAll();
    }

    //guardar
    @PostMapping("/proyectos")
    public Proyecto guardar(@RequestBody Proyecto proyecto) {
        return proyectoService.save(proyecto);
    }

    //get un poyecto
    @GetMapping("/proyectos/{id}")
    public Proyecto GetProyecto(@PathVariable Integer id) {
        return proyectoService.findById(id);
    }

//Modificar
    @PutMapping("/proyectos/{id}")
    public Proyecto modificar(@RequestBody Proyecto proyecto, @PathVariable Integer id) {
        Proyecto proyectoActual = proyectoService.findById(id);
        proyectoActual.setTitulo(proyecto.getTitulo());
        proyectoActual.setTexto(proyecto.getTexto());
        return proyectoService.save(proyectoActual);
    }

//Eliminar
    @DeleteMapping("/proyectos/{id}")
    public void eliminar(@PathVariable Integer id) {
        proyectoService.delete(id);
    }

}

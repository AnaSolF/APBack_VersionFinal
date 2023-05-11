/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBack.APBack.Controllers;

import com.PortfolioBack.APBack.Models.Formacion;
import com.PortfolioBack.APBack.Services.FormacionService;
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

public class FormacionController {
@Autowired
private FormacionService formacionService;

//listar
    @GetMapping("/formacion")
    public List<Formacion> listar(){
    return formacionService.findAll();
    }
    
//guardar
    @PostMapping("/formacion") 
    public Formacion Guardar(@RequestBody Formacion formacion){
    return formacionService.save(formacion);
    }
 
//get Un dato
    @GetMapping("/formacion/{id}")
    public Formacion getUnDato(@PathVariable Integer id){
    return formacionService.findById(id);
    }
    
//Modificar
    @PutMapping ("/formacion/{id}")
     public  Formacion Modificar(@RequestBody Formacion formacion, @PathVariable Integer id){
    Formacion formacionActual = formacionService.findById(id);
    formacionActual.setTitulo(formacion.getTitulo());
    formacionActual.setDescripcion(formacion.getDescripcion());
    return formacionService.save(formacionActual);
    }
     
 //Eliminar
    @DeleteMapping("/formacion/{id}")
    public void eliminar(@PathVariable Integer id){ 
    formacionService.delete(id);
    }
    
}


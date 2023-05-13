/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBack.APBack.Controllers;

import com.PortfolioBack.APBack.Models.UsuarioDatosP;
import com.PortfolioBack.APBack.Services.UsuarioDatosPService;
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

public class UsuariosDatosPController {

    @Autowired
    private UsuarioDatosPService usuarioDatosPService;

    //listar
    @GetMapping("/SobreMi")
    public List<UsuarioDatosP> listar() {
        return usuarioDatosPService.findAll();
    }

    //guardar
    @PostMapping("/SobreMi")

    public UsuarioDatosP guardar(@RequestBody UsuarioDatosP datos) {
        return usuarioDatosPService.save(datos);
    }

    //get Un dato
    @GetMapping("/SobreMi/{id}")
    public UsuarioDatosP getUnDato(@PathVariable Integer id) {
        return usuarioDatosPService.findById(id);
    }

    //Modificar
    @PutMapping("/SobreMi/{id}")
    public UsuarioDatosP Modificar(@RequestBody UsuarioDatosP datos, @PathVariable Integer id) {
        UsuarioDatosP DatosActuales = usuarioDatosPService.findById(id);
        DatosActuales.setNombre(datos.getNombre());
        DatosActuales.setTelefono(datos.getTelefono());
        DatosActuales.setCiudad(datos.getCiudad());
        DatosActuales.setPais(datos.getPais());
        DatosActuales.setParrafo(datos.getParrafo());
        return usuarioDatosPService.save(DatosActuales);
    }

    //Eliminar
    @DeleteMapping("/SobreMi/{id}")
    public void eliminar(@PathVariable Integer id) {
        usuarioDatosPService.delete(id);
    }
}

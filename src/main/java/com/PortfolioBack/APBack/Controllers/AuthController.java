/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBack.APBack.Controllers;

import com.PortfolioBack.APBack.Models.Auth;
import com.PortfolioBack.APBack.Services.AuthService;
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
public class AuthController {

    @Autowired
    private AuthService authService;

//listar
    @GetMapping("/authenticate")
    public List<Auth> listar() {
        return authService.findAll();
    }

//guardar
    @PostMapping("/authenticate")
    public boolean guardar(@RequestBody Auth auth) {
        if (authService.comprobacion(auth)) {
            //si no registra devuelve false
            return false;
        } else {
            //si registra devuelve true
            authService.save(auth);
            return true;
        }
    }

//guardar 
    @PostMapping("/login")
    public int[] ingresar(@RequestBody Auth auth) {
        //comprueba si el usuario esta logueado
        //si esta logueado devuelve true, sino devuelve false
        return authService.login(auth);
    }

    //get Un 
    @GetMapping("/authenticate/{id}")
    public Auth getOneAuth(@PathVariable Integer id) {
        return authService.findById(id);
    }

//Modificar
    @PutMapping("/authenticate/{id}")
    public Auth modificar(@RequestBody Auth auth, @PathVariable Integer id) {
        Auth Authentic = authService.findById(id);
        Authentic.setEmail(auth.getEmail());
        Authentic.setPassword(auth.getPassword());
        return authService.save(Authentic);
    }

    ;
    
//Delete
    @DeleteMapping("/authenticate/{id}")
    public void eliminar(@PathVariable Integer id) {
        authService.delete(id);
    }

}

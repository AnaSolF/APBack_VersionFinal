/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBack.APBack.Services;

import com.PortfolioBack.APBack.DAO.AuthDAO;
import com.PortfolioBack.APBack.Models.Auth;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author usuario
 */
@Service
public class AuthServiceImplement implements AuthService {

    @Autowired
    private AuthDAO authDao;

    //Listar
    @Override
    @Transactional(readOnly = true)
    public List<Auth> findAll() {
        return (List<Auth>) authDao.findAll();
    }

    //Guardar
    @Override
    @Transactional(readOnly = false)
    public Auth save(Auth auth) {
        return authDao.save(auth);
    }

    //Traer   
    @Override
    @Transactional(readOnly = true)
    public Auth findById(Integer id) {
        return authDao.findById(id).orElse(null);
    }

    //Eliminar
    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        authDao.deleteById(id);
    }

    ;
    
 //Login   
    @Transactional(readOnly = false)
    @Override
    public int[] login(Auth auth) {
        List<Auth> Todos = (List<Auth>) authDao.findAll();
        int[] datos = new int[2];
        for (Auth usuario : Todos) {
            if (usuario.getEmail().equals(auth.getEmail())
                    && usuario.getPassword().equals(auth.getPassword())) {
                usuario.setToken(generarToken());
                //authDao.save(auth);
                datos[0] = usuario.getId();
                datos[1] = usuario.getToken();
                break;// usuario autenticado encontrado
            }
        }

        return datos;
    }

    //Generar token
    @Transactional(readOnly = false)
    @Override
    public int generarToken() {
        int token = (int) (Math.random() * 10000);
        return token;
    }

    //Comprobación registro
    @Transactional(readOnly = true)
    @Override
    //toDo cambiar nombre a comprobacionRegistro
    public boolean comprobacion(Auth auth) {
        List<Auth> Todos = (List<Auth>) authDao.findAll();
        boolean registrado = false;

        for (Auth usuario : Todos) {
            if (usuario.getEmail().equals(auth.getEmail())) {
                registrado = true;
                break;// usuario autenticado encontrado
            }
        }
        return registrado;
    }
}


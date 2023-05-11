/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBack.APBack.Services;

import com.PortfolioBack.APBack.DAO.UsuariosDatosPDAO;
import com.PortfolioBack.APBack.Models.UsuarioDatosP;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author usuario
 */
@Service
public class UsuarioDatosPServiceImplement implements UsuarioDatosPService {

    @Autowired
    private UsuariosDatosPDAO UsuarioDPDAO;

    @Override
    @Transactional(readOnly = true)
    public List<UsuarioDatosP> findAll() {
        return (List<UsuarioDatosP>) UsuarioDPDAO.findAll();
    }

    ;
    
    @Override
    @Transactional(readOnly = false)
    public UsuarioDatosP save(UsuarioDatosP datos) {
        return UsuarioDPDAO.save(datos);
    }

    ;
    
    @Override
    @Transactional(readOnly = true)
    public UsuarioDatosP findById(Integer id) {
        return UsuarioDPDAO.findById(id).orElse(null);
    }

    ;
    
    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        UsuarioDPDAO.deleteById(id);
    }
;

}

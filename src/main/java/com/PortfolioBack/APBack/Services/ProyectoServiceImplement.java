/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBack.APBack.Services;

import com.PortfolioBack.APBack.DAO.ProyectoDAO;
import com.PortfolioBack.APBack.Models.Proyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author usuario
 */
@Service
public class ProyectoServiceImplement implements ProyectoService {

    @Autowired
    private ProyectoDAO proyectoDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Proyecto> findAll() {
        return (List<Proyecto>) proyectoDAO.findAll();
    }

    ;
  
@Override
    @Transactional(readOnly = false)
    public Proyecto save(Proyecto proyecto) {
        return proyectoDAO.save(proyecto);
    }

    @Override
    @Transactional(readOnly = true)
    public Proyecto findById(Integer id) {
        return proyectoDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        proyectoDAO.deleteById(id);
    }

}


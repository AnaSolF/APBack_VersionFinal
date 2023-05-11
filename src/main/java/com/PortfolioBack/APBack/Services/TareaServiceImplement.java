/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBack.APBack.Services;

import com.PortfolioBack.APBack.DAO.TareaDAO;
import com.PortfolioBack.APBack.Models.Tarea;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author usuario
 */
@Service
public class TareaServiceImplement implements TareaService {

    @Autowired
    private TareaDAO tareaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Tarea> findAll() {
        return (List<Tarea>) tareaDAO.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Tarea save(Tarea tarea) {
        return tareaDAO.save(tarea);
    }

    @Override
    @Transactional(readOnly = true)
    public Tarea findById(Integer id) {
        return tareaDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        tareaDAO.deleteById(id);
    }
}


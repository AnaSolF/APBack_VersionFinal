/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBack.APBack.Services;

import com.PortfolioBack.APBack.DAO.FormacionDAO;
import com.PortfolioBack.APBack.Models.Formacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author usuario
 */
@Service
public class FormacionServiceImplement implements FormacionService {

    @Autowired
    private FormacionDAO formacionDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Formacion> findAll() {
        return (List<Formacion>) formacionDAO.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Formacion save(Formacion formacion) {
        return formacionDAO.save(formacion);
    }

    @Override
    @Transactional(readOnly = true)
    public Formacion findById(Integer id) {
        return formacionDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        formacionDAO.deleteById(id);
    }

}


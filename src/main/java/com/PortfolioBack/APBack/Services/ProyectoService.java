/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBack.APBack.Services;

import com.PortfolioBack.APBack.Models.Proyecto;
import java.util.List;

/**
 *
 * @author usuario
 */
    public interface ProyectoService {

    public List<Proyecto> findAll();

    public Proyecto save(Proyecto proyecto);

    public Proyecto findById(Integer id);

    public void delete(Integer id);
}


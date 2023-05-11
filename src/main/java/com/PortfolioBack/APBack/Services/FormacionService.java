/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBack.APBack.Services;

import com.PortfolioBack.APBack.Models.Formacion;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface FormacionService {

    public List<Formacion> findAll();

    public Formacion save(Formacion formacion);

    public Formacion findById(Integer id);

    public void delete(Integer id);
}

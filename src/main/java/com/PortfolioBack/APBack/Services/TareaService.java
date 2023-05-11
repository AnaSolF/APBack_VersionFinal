/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBack.APBack.Services;

import com.PortfolioBack.APBack.Models.Tarea;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface TareaService {

    public List<Tarea> findAll();

    public Tarea save(Tarea tarea);

    public Tarea findById(Integer id);

    public void delete(Integer id);
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBack.APBack.DAO;

import com.PortfolioBack.APBack.Models.Formacion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author usuario
 */
public interface FormacionDAO extends CrudRepository <Formacion, Integer> {
    
}
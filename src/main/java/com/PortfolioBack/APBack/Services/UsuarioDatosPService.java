/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBack.APBack.Services;

import com.PortfolioBack.APBack.Models.UsuarioDatosP;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface UsuarioDatosPService {

    public List<UsuarioDatosP> findAll();

    public UsuarioDatosP save(UsuarioDatosP usuarioDatosP);

    public UsuarioDatosP findById(Integer id);

    public void delete(Integer id);

}

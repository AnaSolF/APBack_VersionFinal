/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBack.APBack.Services;

import com.PortfolioBack.APBack.Models.Auth;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface AuthService {

    public List<Auth> findAll();

    public Auth save(Auth auth);

    public Auth findById(Integer id);

    public void delete(Integer id);

    public int[] login(Auth auth);

    public boolean comprobacion(Auth auth);

    public int generarToken();
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.ejb;

import java.util.List;
import javax.ejb.Remote;
/**
 *
 * @author EAYALA
 */
@Remote
public interface ProductoBeanInterface {
    public String consumirWS(List<String>data);
}

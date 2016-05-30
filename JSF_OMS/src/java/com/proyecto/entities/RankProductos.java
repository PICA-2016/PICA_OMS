/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entities;

import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author luu
 */
public class RankProductos implements Serializable{
    private BigInteger cantidadOrdenes;
    private BigInteger productId;

    public RankProductos() {
    }

    public BigInteger getCantidadOrdenes() {
        return cantidadOrdenes;
    }

    public void setCantidadOrdenes(BigInteger cantidadOrdenes) {
        this.cantidadOrdenes = cantidadOrdenes;
    }

    public BigInteger getProductId() {
        return productId;
    }

    public void setProductId(BigInteger productId) {
        this.productId = productId;
    }
    
}

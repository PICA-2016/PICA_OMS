
package com.pica.dss.productos;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RankingCategoria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RankingCategoria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CANTIDADORDENES" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PRODUCTCATEGORIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RankingCategoria", propOrder = {
    "cantidadordenes",
    "productcategoria"
})
public class RankingCategoria {

    @XmlElement(name = "CANTIDADORDENES", required = true, nillable = true)
    protected BigInteger cantidadordenes;
    @XmlElement(name = "PRODUCTCATEGORIA", required = true, nillable = true)
    protected String productcategoria;

    /**
     * Obtiene el valor de la propiedad cantidadordenes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCANTIDADORDENES() {
        return cantidadordenes;
    }

    /**
     * Define el valor de la propiedad cantidadordenes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCANTIDADORDENES(BigInteger value) {
        this.cantidadordenes = value;
    }

    /**
     * Obtiene el valor de la propiedad productcategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTCATEGORIA() {
        return productcategoria;
    }

    /**
     * Define el valor de la propiedad productcategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTCATEGORIA(String value) {
        this.productcategoria = value;
    }

}

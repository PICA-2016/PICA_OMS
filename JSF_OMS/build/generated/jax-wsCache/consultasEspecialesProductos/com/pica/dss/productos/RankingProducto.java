
package com.pica.dss.productos;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RankingProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RankingProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CANTIDADORDENES" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PRODID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RankingProducto", propOrder = {
    "cantidadordenes",
    "prodid"
})
public class RankingProducto {

    @XmlElement(name = "CANTIDADORDENES", required = true, nillable = true)
    protected BigInteger cantidadordenes;
    @XmlElement(name = "PRODID", required = true, nillable = true)
    protected BigInteger prodid;

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
     * Obtiene el valor de la propiedad prodid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRODID() {
        return prodid;
    }

    /**
     * Define el valor de la propiedad prodid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRODID(BigInteger value) {
        this.prodid = value;
    }

}

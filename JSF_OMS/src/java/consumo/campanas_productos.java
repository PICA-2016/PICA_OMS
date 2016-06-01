/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumo;
import com.pica.dss.campanas.AdministrarCampanas;
import com.pica.dss.campanas.CampanaCons;
import com.pica.dss.campanas.CampanaInsert;
import com.pica.dss.campanas.DataServiceFault;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author GermanO
 */
@ManagedBean
@RequestScoped
public class campanas_productos 
{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/10.85.0.100_9766/services/administrarCampanas.wsdl")
    private AdministrarCampanas service;
    
}

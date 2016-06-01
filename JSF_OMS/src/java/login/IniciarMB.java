package login;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import ldap.ldapAuth;

/**
 *
 * @author GermanO
 */
@ManagedBean
@RequestScoped
public class IniciarMB 
{

    private String usuario, pass;
    private String respuesta;

    public String getRespuesta() 
    {
        return respuesta;
    }

    public void setRespuesta(String respuesta) 
    {
        this.respuesta = respuesta;
    }
    
    ldap.ldapAuth lda;
    public String getUsuario() 
    {
        return usuario;
    }

    public void setUsuario(String usuario) 
    {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public IniciarMB(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    /**
     * Creates a new instance of IniciarMB
     */
    public IniciarMB() {
    }
    
    //public final void Login() throws NamingException 
    public String Login() throws NamingException 
    {
        System.out.println("Iniciando Autenticacion");
        //String server="ldap://132.147.156.143:389"; // servidor de LDAP
        //String server="ldap://192.168.0.7:389"; // servidor de LDAP
        String server="ldap://10.85.0.108:389"; // servidor de LDAP
        //String usuario="usuario"; // Usuario de Autenticacion
        //pass = this.encripta(pass);
        String dn="uid=" + usuario + ",ou=People,dc=maxcrc,dc=com"; // Ruta del Arbol LDAP
        String tipoAth="simple";//tipo de autentuicacion simple o por SSL
        //String clave="clave";
        System.out.println(String.format("Usuario: %s con Password: %s",usuario,pass));
        lda =new ldap.ldapAuth(server,dn,tipoAth,usuario,pass);
        
        if(lda.isAutenticado())
        {
            System.out.println(String.format("Usuario %s Autenticado Correctamente",lda.getUsuario()));
            
            /* obtenemos una Propiedad de la autenticacion
             *
             * Algunas Propiedades Disponibles
             * mailLocalAddress,displayName,givenName,objectClass,userPassword,sambaLogonTime,mail
             * uid,uidNumber,cn,loginShell,gidNumber,gecos,sambaSID,homeDirectory
             */
            Attribute atr=lda.cargarPropiedadConexion("cn");
            System.out.println("1. Atributo "+atr.getID());
            System.out.println("1. Valor "+atr.get().toString());
            //respuesta = String.format(String.format("Usuario %s Autenticado Correctamente",lda.getUsuario()));
            
            respuesta=atr.getID();//lda.getUsuario();
            return "menu";
        }
        else
        {
            System.out.println("Usuario "+lda.getUsuario()+" No se Puedo Autenticar");
            respuesta = "Error al Autenticar al usuario "+lda.getUsuario();
        }
        return "index";
       
    }
    
    private String encripta (String contr){
        String ret = "";
        MessageDigest md = null;
	String password = "password D:";
        try {
            
            //SHA-512
            md= MessageDigest.getInstance("SHA-512");
            md.update(password.getBytes());
            byte[] mb = md.digest();
            System.out.println("Valor: "+Arrays.toString(mb));
            
            //SHA-1
            md= MessageDigest.getInstance("SHA-1");
            md.update(password.getBytes());
            mb = md.digest();
            System.out.println("Valor: "+Arrays.toString(mb));
            
            //MD5
            md= MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            mb = md.digest();
            System.out.println("Valor: "+Arrays.toString(mb));
            
        } catch (NoSuchAlgorithmException e) {
            //Error
            System.out.println("Valor: "+e.getMessage());
        }
        return ret;
    }

}

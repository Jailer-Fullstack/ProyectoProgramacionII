import java.util.ArrayList;
import java.util.List;

public class Clientes {
    String id;
    String nombre;
    String direccion;
    String telefono;
    private  List<Ciudades> ciudad;
    double saldo_puntos=0;


  
   




    public Clientes(String id, String nombre, String direccion, String telefono, List<Ciudades> ciudad,
            double saldo_puntos) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.saldo_puntos = saldo_puntos;
    }


    public List<Ciudades> getCiudad() {
        return ciudad;
    }


    public void setCiudad(List<Ciudades> ciudad) {
        this.ciudad = ciudad;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public double getSaldo_puntos() {
        return saldo_puntos;
    }


    public void setSaldo_puntos(double saldo_puntos) {
        this.saldo_puntos = saldo_puntos;
    }
    
    @Override
    public String toString() {
        return "\n"+"id: "+id+
                "\n"+"nombre: "+nombre+
                "\n"+"ciudad: "+ciudad+
                "\n"+"direccion: "+ direccion+
                "\n"+"telefono: "+telefono+ 
                "\n"+"Saldo de puntos: "+saldo_puntos;

        
        
      
    }


    
    
   
}

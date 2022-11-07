
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Controlciudades {
    static ArrayList<Ciudades>listaciudades= new ArrayList<Ciudades>();

    static public void crearciudad(){
        String ciudadcliente;
       
        ciudadcliente = JOptionPane.showInputDialog("ingrese ciudad ");
    


        Ciudades CiudadesAdd = new Ciudades(ciudadcliente);
        listaciudades.add(CiudadesAdd);
        
    }

    static public void listarciudad(){
        String textoListado="Listado de ciudades \n---------------------------------------------------------\n";
        for(int i=0; i<listaciudades.size(); i++){
         textoListado=textoListado + "<" +
         (i+1) +">"+ listaciudades.get(i).toString() + "\n";
        }
    JOptionPane.showMessageDialog(null, textoListado);
    }


}

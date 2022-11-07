import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ControlClientes {
    static ArrayList<Clientes> listaclientes = new ArrayList<Clientes>();

    static public void CrearCliente(){
        String id;
        String nombre;
        String direccion;
        String telefono;
        int ciu;
        ArrayList<Ciudades>ciudadesprovisionales= new ArrayList<Ciudades>();


        id = JOptionPane.showInputDialog("Ingrese el id del cliente");
        nombre = JOptionPane.showInputDialog("Ingrese el Nombre:");
        direccion =JOptionPane.showInputDialog("Ingrese la direccion:");
        telefono=JOptionPane.showInputDialog("Ingrese el telefono:");
    
        Controlciudades.listarciudad();
        ciu=Integer.parseInt(JOptionPane.showInputDialog("seleccione index de la ciudad: "));
        ciudadesprovisionales.add(Controlciudades.listaciudades.get(ciu-1));


        Clientes clientesAdd = new Clientes(id, nombre,direccion,telefono, ciudadesprovisionales,ciu);
        listaclientes.add(clientesAdd);
        
    }

static public void Listarcliente(){
    String textoListado="Listado de clientes \n\n Id  nombre  direccion  telefono \n---------------------------------------------------------\n";
    for(int i=0; i<listaclientes.size(); i++){
     textoListado=textoListado + "<" +
     (i+1) +">"+ listaclientes.get(i).toString() + "\n";
    }
JOptionPane.showMessageDialog(null, textoListado);
}


static public void Modificarcliente(){
    String id;
    String nombre;
    String direccion;
    String telefono;
    int id2;

    ControlClientes.Listarcliente();
    id2= Integer.parseInt(JOptionPane.showInputDialog("Seleccione el index: "));
   
    id = JOptionPane.showInputDialog("Ingrese el Codigo",listaclientes.get(id2-1).getId());

    nombre = JOptionPane.showInputDialog("Ingrese el Nombre:",listaclientes.get(id2-1).getNombre());
    
    direccion =JOptionPane.showInputDialog("Ingrese la direccion",listaclientes.get(id2-1).getDireccion());
    
    telefono=JOptionPane.showInputDialog("ingrese el telefono", listaclientes.get(id2-1).getTelefono());

        
    listaclientes.get(id2-1).setId(id);
    listaclientes.get(id2-1).setNombre(nombre);
    listaclientes.get(id2-1).setDireccion(direccion);
    listaclientes.get(id2-1).setTelefono(telefono);

  

}

static public void Eliminarcliente(){

    int idcliente;
   
    ControlArticulos.ListarArticulos();
    idcliente = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Articulo "));
    
    listaclientes.remove(idcliente-1);

} 
}

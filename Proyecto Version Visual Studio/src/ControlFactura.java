import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;


    public class ControlFactura {
        
        static ArrayList<Facturar> listaFacturas = new ArrayList<Facturar>();
        
        static public void CrearFactura(){
            int pregunta;
            int indice;
            int cantidad;
            String fecha;
            String numero;
            int totalcanti=0;
            double valor2=0;
            int clien;
            double resumencuenta=0;
            
            List<Integer> cantprovisional = new ArrayList<Integer>();
            List<Articulos> artprovisionales = new ArrayList<Articulos>();
            List<Clientes> clienprovisional=new ArrayList<Clientes>();


            fecha = JOptionPane.showInputDialog("Ingrese la Fecha");
            numero = JOptionPane.showInputDialog("Ingrese el numero");
            ControlClientes.Listarcliente();

            clien=Integer.parseInt(JOptionPane.showInputDialog("seleccione index de cliente para generar factura: "));
            clienprovisional.add(ControlClientes.listaclientes.get(clien-1));
            pregunta=1; 
            while (pregunta==1){
                ControlArticulos.ListarArticulos();
                indice=Integer.parseInt(JOptionPane.showInputDialog("Seleccione un Articulos"));
                System.out.println(ControlArticulos.listaArticulo.get(indice-1));
                artprovisionales.add(ControlArticulos.listaArticulo.get(indice-1));

                cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cantidad"));
                cantprovisional.add(cantidad);
               
               
                 totalcanti=totalcanti+cantidad;

                valor2=cantidad*ControlArticulos.listaArticulo.get(indice-1).valor;
                 resumencuenta=resumencuenta+valor2;

                 System.out.println(totalcanti);

                 System.out.println(resumencuenta);
                ControlClientes.listaclientes.get(clien-1).saldo_puntos=resumencuenta/100;
               
                pregunta = Integer.parseInt(JOptionPane.showInputDialog("1-> Continuar 0-> Salir"));
                
                
            }
            Facturar FacturaAdd = new Facturar(numero, numero, cantprovisional, artprovisionales, clienprovisional,resumencuenta, resumencuenta, clienprovisional, cantprovisional,artprovisionales,clien,valor2,totalcanti,fecha,numero);
            listaFacturas.add(FacturaAdd);
            
            
            
            
        }
    
    static public void ListarFacturas(){
        String textoListado="Listado de Facturas \n\n\n---------------------------------------------------------\n";
        for(int i=0; i<listaFacturas.size(); i++){
         textoListado=textoListado + "<" +
         (i+1) +">"+ listaFacturas.get(i).toString() + "\n";
        }
    JOptionPane.showMessageDialog(null, textoListado);
    }
    
    static public void ModificarFactura(){
       int id2;
    String fecha;
    String  numero;
    int clien2;
    int indice;
    double cantidad;
    double  totalcanti=0;
    double valor2;
    double resumencuenta=0;
  
    List<Integer> cantprovisional = new ArrayList<Integer>();
    List<Articulos> artprovisionales = new ArrayList<Articulos>();
    List<Clientes> clienprovisional=new ArrayList<Clientes>();

        ControlFactura.ListarFacturas();
        id2=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero de factura"));

        fecha = JOptionPane.showInputDialog("Ingrese la Fecha nueva");
        numero = JOptionPane.showInputDialog("Ingrese el numero nuevo");

        ControlClientes.Listarcliente();
        clien2=Integer.parseInt(JOptionPane.showInputDialog("seleccione index de cliente para generar factura: "));
        clienprovisional.add(ControlClientes.listaclientes.get(clien2-1));

        int pregunta=1; 
            while (pregunta==1){
                ControlArticulos.ListarArticulos();
                indice=Integer.parseInt(JOptionPane.showInputDialog("Seleccione un Articulos"));
                System.out.println(ControlArticulos.listaArticulo.get(indice-1));
                artprovisionales.add(ControlArticulos.listaArticulo.get(indice-1));

                cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cantidad"));
                cantprovisional.add((int) cantidad);
              

                totalcanti=totalcanti+cantidad;

               
                valor2=cantidad*ControlArticulos.listaArticulo.get(indice-1).valor;
                 resumencuenta=resumencuenta+valor2;
                

                pregunta = Integer.parseInt(JOptionPane.showInputDialog("1-> Continuar 0-> Salir"));
            }


        listaFacturas.get(id2-1).setFecha(fecha);
        listaFacturas.get(id2-1).setNum(numero);
        listaFacturas.get(id2-1).setClientess(clienprovisional);
        listaFacturas.get(id2-1).setArticulos(artprovisionales);
        listaFacturas.get(id2-1).setCant(cantprovisional);
        listaFacturas.get(id2-1).setResumencuenta(resumencuenta);
    }





    static public void EliminarFactura(){

        int id2;
       
        ControlFactura.ListarFacturas();
        id2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la factura a eliminar "));
        
        listaFacturas.remove(id2-1);
    
    } 
}

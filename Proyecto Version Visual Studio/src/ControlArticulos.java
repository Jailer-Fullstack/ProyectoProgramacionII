import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlArticulos {
    static ArrayList<Articulos> listaArticulo = new ArrayList<Articulos>();
    static ArrayList<celular> lista = new ArrayList<celular>();
    static ArrayList<electronicos> lista2 = new ArrayList<electronicos>();

    static String categoria;
    static String  subcategoria;
    static String codigo;
    static String detalle;
    static double valor;


    static public void CrearArticulo(){
        
        int prueba1;
        int  prueba2;


        codigo = JOptionPane.showInputDialog("Ingrese el Codigo");
        detalle = JOptionPane.showInputDialog("Ingrese el Nombre:");
        valor =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor"));
        prueba1 = JOptionPane.showOptionDialog(null, "Seleccione una Categoria", "Categoria", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "electronicos", "comida", "aseo", "deporte" }, "1");
        System.out.println(prueba1);
        switch (prueba1) {
            case 0:
            
            prueba2 = JOptionPane.showOptionDialog(null, "Seleccione una Subategoria", "Categoria", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { " Telefono", "computador ", " televisor"}, "1");
            categoria="electronicos";
            switch (prueba2) {
                case 0:
                subcategoria="Telefono";
                String sistema_operativo=JOptionPane.showInputDialog("Ingrese el Sistema Operativo");
                String marca=JOptionPane.showInputDialog("Ingrese la Marca");
                String modelo=JOptionPane.showInputDialog("Ingrese el Modelo");
                String  gama=JOptionPane.showInputDialog("Ingrese la gama ");

                System.out.println(codigo);
                System.out.println(detalle);
                System.out.println(valor);
                System.out.println(categoria);
                System.out.println(subcategoria);
                System.out.println(sistema_operativo);
                System.out.println(marca);
                System.out.println(modelo);
                System.out.println(gama);

                celular celularAdd = new celular( codigo,  detalle,  valor,  categoria,  subcategoria,  marca,
                modelo,  gama,  sistema_operativo );
                lista2.add(celularAdd);
                break;
                case 1:
                subcategoria="computador";
                break;
                case 2:
                subcategoria="televisor";
                break;
            }
            break;
        
        default:
            break;

        }

    /*Articulos articuloAdd = new Articulos(codigo, detalle, valor, categoria, subcategoria);
        listaArticulo.add(articuloAdd);*/
        
    }

static public void ListarArticulos(){
    String textoListado="Listado de Articulos \n\n Id  Codigo  Detalle  Valor \n---------------------------------------------------------\n";
    for(int i=0; i<lista2.size(); i++){
     textoListado=textoListado + "<" +
     (i+1) +">"+ lista2.get(i).toString() + "\n";
    }
JOptionPane.showMessageDialog(null, textoListado);
}


static public void ModificarArticulo(){
    int idarticulo;
    String codigo;
    String detalle;
    double valor;

    ControlArticulos.ListarArticulos();
    idarticulo = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Codigo: "));
   
    //codigo = JOptionPane.showInputDialog("Ingrese el Codigo",listaArticulo.get(idarticulo-1).getCodigo());

    //detalle = JOptionPane.showInputDialog("Ingrese el Nombre:",listaArticulo.get(idarticulo-1).getDetalle());
    
    //valor =Double.parseDouble(JOptionPane.showInputDialog("Ingrese El Valor",listaArticulo.get(idarticulo-1).getValor()));

        
   // listaArticulo.get(idarticulo-1).setCodigo(codigo);
   // listaArticulo.get(idarticulo-1).setDetalle(detalle);
    //listaArticulo.get(idarticulo-1).setValor(valor);
  

}

static public void EliminarArticulo(){

    int idarticulo;
   
    ControlArticulos.ListarArticulos();
    idarticulo = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el Articulo "));
    
    listaArticulo.remove(idarticulo-1);

} 
}

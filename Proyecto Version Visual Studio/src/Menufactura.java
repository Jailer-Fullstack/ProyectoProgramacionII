import javax.swing.JOptionPane;

public class Menufactura {

    public static void opciones() {
        int idMenu = 0;
        boolean salir = false;
        String textoMenu = "Menu de facturacion \n";
        String[] listaMenu = { "1. Crear factura", "2. Listar factura", "3. Modificar ",
                "4. Eliminar ","5. Regresar" };
        for (int i = 0; i < listaMenu.length; i++) {
            textoMenu = textoMenu + listaMenu[i] + "\n";
        }

        do {
            idMenu = 0;
            idMenu = Integer.parseInt(JOptionPane.showInputDialog(textoMenu + "Seleccione Una Opcion: "));
            switch (idMenu) {
                case 1:
                ControlFactura.CrearFactura();
                break;
                case 2:
                ControlFactura.ListarFacturas();
                    break;
                case 3:
                ControlFactura.ModificarFactura();
                    break;
                case 4:
                ControlFactura.EliminarFactura();
                     break;    
              
                case 5:

                salir=true;
                    break;    

                default:
                    break;
            }

        } while (!salir);

    }

}

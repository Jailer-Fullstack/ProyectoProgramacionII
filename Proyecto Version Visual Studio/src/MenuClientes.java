import javax.swing.JOptionPane;

public class MenuClientes {

    public static void opciones() {
        int idMenu = 0;
        boolean salir = false;
        String textoMenu = "Menu de clientes \n";
        String[] listaMenu = { "1. Crear cliente", "2. Listar cliente", "3. Modificar cliente",
                "4. Eliminar cliente","5. Regresar" };
        for (int i = 0; i < listaMenu.length; i++) {
            textoMenu = textoMenu + listaMenu[i] + "\n";
        }

        do {
            idMenu = 0;
            idMenu = Integer.parseInt(JOptionPane.showInputDialog(textoMenu + "Seleccione Una Opcion: "));
            switch (idMenu) {
                case 1:
                ControlClientes.CrearCliente();
                break;
                case 2:
                ControlClientes.Listarcliente();
                    break;
                case 3:
                ControlClientes.Modificarcliente();
                    break;
                case 4:
                ControlClientes.Eliminarcliente();
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

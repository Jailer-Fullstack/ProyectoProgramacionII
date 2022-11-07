import javax.swing.JOptionPane;

public class MenuArticulos {

    public static void opciones() {
        int idMenu = 0;
        boolean salir = false;
        String textoMenu = "Menu de Articulos \n";
        String[] listaMenu = { "1. Crear Articulo", "2. Listar Articulo", "3. Modificar",
                "4. Eliminar","5. Regresar" };
        for (int i = 0; i < listaMenu.length; i++) {
            textoMenu = textoMenu + listaMenu[i] + "\n";
        }

        do {
            idMenu = 0;
            idMenu = Integer.parseInt(JOptionPane.showInputDialog(textoMenu + "Seleccione Una Opcion: "));
            switch (idMenu) {
                case 1:
                ControlArticulos.CrearArticulo();
                break;
                case 2:
                ControlArticulos.ListarArticulos();
                    break;
                case 3:
                ControlArticulos.ModificarArticulo();
                    break;
                case 4:
                ControlArticulos.EliminarArticulo();
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

import javax.swing.JOptionPane;


public class Menu {

    public static void opciones() {
        int idMenu = 0;
        boolean salir = false;
        String textoMenu = "Menu de Opciones \n";
        String[] listaMenu = { "1. Crear Articulos", "2. Crear Cliente", "3. Facturar","4. ciudades",
               "5. Salir" };
        for (int i = 0; i < listaMenu.length; i++) {
            textoMenu = textoMenu + listaMenu[i] + "\n";
        }

        do {
            idMenu = 0;
            idMenu = Integer.parseInt(JOptionPane.showInputDialog(textoMenu + "Seleccione Una Opcion: "));
            switch (idMenu) {
                case 1:
                MenuArticulos.opciones();

                    break;
                case 2:
                MenuClientes.opciones();
                    break;
                case 3:
                Menufactura.opciones();
                    break;
                case 4:
               
                MenuCiudades.opciones();
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

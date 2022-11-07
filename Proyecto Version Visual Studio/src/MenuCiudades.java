import javax.swing.JOptionPane;

public class MenuCiudades {

    public static void opciones() {
        int idMenu = 0;
        boolean salir = false;
        String textoMenu = "Menu de Articulos \n";
        String[] listaMenu = { "1. Crear ciudad", "2. Listar ciudades", "3. Modificar ciudad",
                "4. Eliminar","5. Regresar" };
        for (int i = 0; i < listaMenu.length; i++) {
            textoMenu = textoMenu + listaMenu[i] + "\n";
        }

        do {
            idMenu = 0;
            idMenu = Integer.parseInt(JOptionPane.showInputDialog(textoMenu + "Seleccione Una Opcion: "));
            switch (idMenu) {
                case 1:
                Controlciudades.crearciudad();
                break;
                case 2:
                Controlciudades.listarciudad();

                    break;
                case 3:
                    break;
                case 4:
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

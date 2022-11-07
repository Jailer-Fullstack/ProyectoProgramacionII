
public class celular extends electronicos {
    
        String sistema_operativo;

       


   
    public celular(String codigo, String detalle, double valor, String categoria, String subcategoria, String marca,
                String modelo, String gama, String sistema_operativo) {
            super(codigo, detalle, valor, categoria, subcategoria, marca, modelo, gama);
            this.sistema_operativo = sistema_operativo;
        }





    //override
    public String toString() {
        return  codigo+ " "+detalle +" "+valor+" "+categoria+" "+subcategoria +" "+marca+" "+modelo+" " +gama + " " + sistema_operativo ;    

    }
}

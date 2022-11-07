public abstract class electronicos implements Articulos {

    public electronicos(String codigo, String detalle, double valor, String categoria, String subcategoria,
            String marca, String modelo, String gama) {
    }

    String marca;
    String modelo;
    String gama;

    // override
    public String toString() {
        return codigo + " " + detalle + " " + valor + " " + categoria + " " + subcategoria + " " + marca + " " + modelo
                + " " + gama;
    }

}

import java.util.List;


public class  Facturar {
    private String Fecha;
    private String num;
    private List<Integer> cant;
    private List<Articulos> articulos;
    private List<Clientes>clientess;
    private double resumencuenta;
    private double resumencuenta2;
  

    
    public Facturar(String fecha, String num, List<Integer> cant, List<Articulos> articulos, List<Clientes> clientess,
            double resumencuenta, double resumencuenta2,List<Clientes> clienprovisional, List<Integer> cantprovisional, List<Articulos> artprovisionales,
            int clien, double valor2, int totalcanti, String fecha2, String numero) {
        Fecha = fecha;
        this.num = num;
        this.cant = cant;
        this.articulos = articulos;
        this.clientess = clientess;
        this.resumencuenta = resumencuenta;
        this.resumencuenta2 = resumencuenta2;
    }
    
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public List<Integer> getCant() {
        return cant;
    }
    public void setCant(List<Integer> cantidad) {
        this.cant = cantidad;
    }
    public List<Articulos> getArticulos() {
        return articulos;
    }
    public void setArticulos(List<Articulos> articulos) {
        this.articulos = articulos;
    }
    public List<Clientes> getClientess() {
        return clientess;
    }
    public void setClientess(List<Clientes> clientess) {
        this.clientess = clientess;
    }
    public double getResumencuenta() {
        return resumencuenta;
    }
    public void setResumencuenta(double resumencuenta) {
        this.resumencuenta = resumencuenta;
    }
     

    public double getResumencuenta2() {
        return resumencuenta2;
    }
    public void setResumencuenta2(double resumencuenta2) {
        this.resumencuenta2 = resumencuenta2;
    }
    

    public int prueba1(){
    int totalcantinue=0;

    for(int i=0;i<cant.size();i++){
        totalcantinue+=cant.get(i);


    }
    return totalcantinue;
    }
    
    @Override
    public String toString() {
        return 

          " \n"+"Fecha: "+Fecha+"                  #factura: "+num+
                " \n"+clientess+
                "\n"+articulos+
                "\n"+cant+
                "\n"+"productos totales:"+prueba1()+
                "\n"+"valor total de la compra: "+resumencuenta+" pesos";
        
       
        
        
    }
   

    
}

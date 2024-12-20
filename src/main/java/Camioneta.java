package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;
    public static int totalCamionetas;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Camioneta.totalCamionetas++;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
    public boolean isVolco() {
        return this.volco;
    }
    
    public static int getTotalCamionetas() {
        return totalCamionetas;
    }
}

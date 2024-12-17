package vehiculos;
import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private  static ArrayList<Fabricante> fabricas = new ArrayList<>();
    private int vehiculosVendidos; 

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        fabricas.add(this);
    }
    public Fabricante(){
        fabricas.add(this);
    }

    public static Fabricante fabricaMayorVentas(){
        int valMax = 0;
        Fabricante fabricaMax = null;
        for(Fabricante fabrica : fabricas){
            if(fabrica.getVehiculosVendidos() > valMax){
                valMax = fabrica.getVehiculosVendidos();
                fabricaMax = fabrica;
            }
        }
        return fabricaMax; 
    }


    public int getVehiculosVendidos(){
        return this.vehiculosVendidos;
    }

    public void incrementarVehiculosVendidos(){
        this.vehiculosVendidos++;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Pais getPais(){
        return this.pais;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }
}

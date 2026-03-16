package pubHerencia;
//
import java.util.ArrayList;

public class Coctel extends Bebida{
    private static double decoracionCoctel = 2.0;
    private ArrayList<Bebida> ingredientes = new ArrayList<>();

    @Override
    public double getPrecioVenta(){
        double precioCoctel = 0.0;
        for (Bebida b : ingredientes) {
            precioCoctel+=b.getPrecioVenta();
        }
        return precioCoctel+decoracionCoctel;
    }

    public Coctel(String nombre, String marca, double precioBase, Double calorias) {
        super(nombre, marca, precioBase, calorias);
    }
    public Coctel() {
        super();
    }
    public ArrayList<Bebida> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(ArrayList<Bebida> ingredientes) {
        this.ingredientes = ingredientes;
    }
    @Override
    public String toString() {
        return "Coctel{" + "ingredientes=" + ingredientes + '}';
    }

}

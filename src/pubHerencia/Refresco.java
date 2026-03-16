package pubHerencia;

public class Refresco extends Bebida{
    private Double nivelCafeina;

    public Refresco(String nombre, String marca, double precioBase, Double calorias, Double nivelCafeina) {
        super(nombre, marca, precioBase, calorias);
        this.nivelCafeina = nivelCafeina;
    }
    public Refresco() {
        super();
    }
    /*public Refresco(String nombre, String marca, double precioBase){
        super();
    }*/

    public Double getNivelCafeina() {
        return nivelCafeina;
    }

    public void setNivelCafeina(Double nivelCafeina) {
        this.nivelCafeina = nivelCafeina;
    }

    @Override
    public String toString() {
        return "Refresco{" + "nivelCafeina=" + nivelCafeina + '}';
    }


}

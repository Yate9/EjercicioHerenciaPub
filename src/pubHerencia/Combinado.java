package pubHerencia;

public class Combinado extends Bebida{
    private Bebida alcohol;
    private Bebida mezclador;



    @Override
    public double getPrecioVenta(){
        return (alcohol.getPrecioVenta() + mezclador.getPrecioVenta())*1.10;
    }

    public Combinado(Bebida alcohol, Bebida mezclador) {
        super();
        this.alcohol = alcohol;
        this.mezclador = mezclador;
    }
    public Combinado() {
        super();
    }


    public Bebida getMezclador() {
        return mezclador;
    }

    public void setMezclador(Bebida mezclador) {
        this.mezclador = mezclador;
    }

    public Bebida getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Bebida alcohol) {
        this.alcohol = alcohol;
    }
    @Override
    public String toString() {
        return "Combinado{" + "alcohol=" + alcohol + ", mezclador=" + mezclador + '}';
    }
}

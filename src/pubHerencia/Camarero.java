package pubHerencia;
//
public class Camarero extends Trabajador{
    private double propinasAcumuladas = 0.0;

    public Camarero(String nombre, String fechaDeNacimiento, double salarioBase, double propinasAcumuladas) {
        super();
        this.propinasAcumuladas = propinasAcumuladas;

    }

    public Camarero() {
        super();
    }
    public void servir(Bebida b){
        if (b instanceof Coctel){
            System.out.printf("Lo siento, soy un camarero estándar y no sé preparar cócteles");
        }else {
            Bebida.setTotalBebidasServidas(Bebida.getTotalBebidasServidas()+1);
            Bebida.setRecaudacionTotalBar(Bebida.getRecaudacionTotalBar()+b.getPrecioVenta());
            setPropinasAcumuladas(getPropinasAcumuladas()+(b.getPrecioVenta()*0.05));
            System.out.print("Soy "+getNombre()+" y te he servido "+b.getNombre()+" por "+b.getPrecioVenta()+"€");
        }
    }

    public double getPropinasAcumuladas() {
        return propinasAcumuladas;
    }

    public void setPropinasAcumuladas(double propinasAcumuladas) {
        this.propinasAcumuladas = propinasAcumuladas;
    }

    @Override
    public String toString() {
        return "Camarero{" +
                "propinasAcumuladas=" + propinasAcumuladas +
                '}';
    }
}

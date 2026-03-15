package pubHerencia;

import java.util.ArrayList;

public class Mixologo extends Camarero{
    private ArrayList<Coctel> cartaEspecialidades = new ArrayList<>();


    @Override
    public void servir(Bebida b){
        if (b instanceof Coctel){
            Bebida.setTotalBebidasServidas(Bebida.getTotalBebidasServidas()+1);
            Bebida.setRecaudacionTotalBar(Bebida.getRecaudacionTotalBar() + b.getPrecioVenta());
            setPropinasAcumuladas(getPropinasAcumuladas()+(b.getPrecioVenta()*0.1));
            System.out.print("Soy "+getNombre()+" y te he servido "+b.getNombre()+" por "+b.getPrecioVenta()+"€");
        }else {
            super.servir(b);
        }
    }

    public Mixologo() {
        super();
    }
    public Mixologo(String nombre, String fechaDeNacimiento, Double salarioBase, ArrayList<Coctel> cartaEspecialidades) {
        super();
        this.cartaEspecialidades = cartaEspecialidades;
    }

    public ArrayList<Coctel> getCartaEspecialidades() {
        return cartaEspecialidades;
    }

    public void setCartaEspecialidades(ArrayList<Coctel> cartaEspecialidades) {
        this.cartaEspecialidades = cartaEspecialidades;
    }
    @Override
    public String toString() {
        return "Mixologo{" + "cartaEspecialidades=" + cartaEspecialidades + '}';
    }
}

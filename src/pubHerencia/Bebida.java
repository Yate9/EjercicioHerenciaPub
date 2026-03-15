package pubHerencia;

public class Bebida {
    private static int totalBebidasServidas;
    private static double recaudacionTotalBar;
    private String nombre;
    private String marca;
    private double precioBase;
    private Double calorias;
    Sabor sabor;
    private enum Sabor{
        DULCE, CITRICO, AMARGO, NEUTRO;
    }

    public double getPrecioVenta(){
        return precioBase;
    }




    public Bebida() {
    }
    public Bebida(String nombre, String marca, double precioBase, Double calorias) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioBase = precioBase;
        this.calorias = calorias;
    }

    public static int getTotalBebidasServidas() {
        return totalBebidasServidas;
    }

    public static double getRecaudacionTotalBar() {
        return recaudacionTotalBar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Double getCalorias() {
        return calorias;
    }

    public static void setTotalBebidasServidas(int totalBebidasServidas) {
        Bebida.totalBebidasServidas = totalBebidasServidas;
    }

    public static void setRecaudacionTotalBar(double recaudacionTotalBar) {
        Bebida.recaudacionTotalBar = recaudacionTotalBar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precioBase=" + precioBase +
                ", calorias=" + calorias +
                '}';
    }
}

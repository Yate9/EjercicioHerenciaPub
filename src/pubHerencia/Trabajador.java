package pubHerencia;
//
public abstract class Trabajador {
    private String nombre;
    private String fechaDeNacimiento;
    private double salarioBase;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    @Override
    public String toString() {
        return "Trabajador{" + "nombre='" + nombre + '\'' + ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' + ", salarioBase=" + salarioBase + '}';
    }
}

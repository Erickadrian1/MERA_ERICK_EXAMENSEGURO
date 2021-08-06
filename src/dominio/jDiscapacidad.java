
package dominio;

public class jDiscapacidad extends Persona {
    protected float porcentajeDiscapacidad;

    public jDiscapacidad(float porcentajeDiscapacidad) {
        this.porcentajeDiscapacidad = porcentajeDiscapacidad;
    }

    public jDiscapacidad(float porcentajeDiscapacidad, String cedula, String nombres, float salarioBase, int aniosAporte) {
        super(cedula, nombres, salarioBase, aniosAporte);
        this.porcentajeDiscapacidad = porcentajeDiscapacidad;
    }

    @Override
    public float calcularJubilacion() {
        float total;
        total = (float)(super.calcularJubilacion()+(super.getSalarioBase()*(this.porcentajeDiscapacidad/100)));
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nPorcentaje de discapacidad=" + porcentajeDiscapacidad +"\nJubilacion: "+this.calcularJubilacion();
    }
    
}



package dominio;

public class jVejez extends Persona{

    public jVejez() {
    }

    public jVejez(String cedula, String nombres, float salarioBase, int aniosAporte) {
        super(cedula, nombres, salarioBase, aniosAporte);
    }
    
    public float calcularJubilacion( ) {
        float total;
        total = (float)(super.calcularJubilacion()+(super.getSalarioBase()*0.15));
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+"\nJubilacion: "+this.calcularJubilacion();
    }
    
    
}

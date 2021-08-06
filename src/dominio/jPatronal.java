
package dominio;

public class jPatronal extends Persona{
     protected float porcetanjeInflacion;
     protected String tipoEmpresa;

    public jPatronal(float porcetanjeInflacion, String tipoEmpresa) {
        this.porcetanjeInflacion = porcetanjeInflacion;
        this.tipoEmpresa = tipoEmpresa;
    }

    public jPatronal(float porcetanjeInflacion, String tipoEmpresa, String cedula, String nombres, float salarioBase, int aniosAporte) {
        super(cedula, nombres, salarioBase, aniosAporte);
        this.porcetanjeInflacion = porcetanjeInflacion;
        this.tipoEmpresa = tipoEmpresa;
    }
    
    @Override
    public float calcularJubilacion() {
        float aumento=1;
        float total;
        if(this.tipoEmpresa.toLowerCase().equals("publica")){
            aumento = (float) 1.05;
        }else if(this.tipoEmpresa.toLowerCase().equals("privada")){
            aumento = (float) 1.1;            
        }
        total = (float)(super.calcularJubilacion()+(super.getSalarioBase()*(this.porcetanjeInflacion/100)))*aumento;
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nPorcetanje de Inflacion=" + porcetanjeInflacion + ", \nTipo de Empresa=" + tipoEmpresa +" \nJubilacion: "+this.calcularJubilacion();
    }
    
    
}


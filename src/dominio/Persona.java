
package dominio;

public abstract class Persona implements Jubilacion{
    protected String cedula;
    protected String nombres;
    protected float salarioBase;
    protected int aniosAporte;
    
    public Persona() {
    }

    public Persona(String cedula, String nombres, float salarioBase, int aniosAporte) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.salarioBase = salarioBase;
        this.aniosAporte = aniosAporte;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAniosAporte() {
        return aniosAporte;
    }

    public void setAniosAporte(int aniosAporte) {
        this.aniosAporte = aniosAporte;
    }

    @Override
    public float calcularJubilacion( ) {
        float total;
        if(this.getAniosAporte()<=10){
            total = (float)(this.getSalarioBase()*0.5);
        }else if(this.getAniosAporte()>=11&&this.getAniosAporte()<=20){
            total = (float)(this.getSalarioBase()*0.6);
        }else if(this.getAniosAporte()>=21&&this.getAniosAporte()<=30){
            total = (float)(this.getSalarioBase()*0.7);
        }else if(this.getAniosAporte()>=31&&this.getAniosAporte()<=35){
            total = (float)(this.getSalarioBase()*0.8);
        }else if(this.getAniosAporte()>=36&&this.getAniosAporte()<=39){
            total = (float)(this.getSalarioBase()*0.9);
        }else{
            total = (float)(this.getSalarioBase());
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCedula=").append(cedula);
        sb.append("\nNombres=").append(nombres);
        sb.append("\nSalario Base=").append(salarioBase);
        sb.append("\nAnios de Aporte=").append(aniosAporte);
        return sb.toString();
    }
    
    
}


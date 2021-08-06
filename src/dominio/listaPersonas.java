
package dominio;

import java.util.ArrayList;
import java.util.Iterator;

public class listaPersonas {
    ArrayList <Persona> listaP;

    public listaPersonas() {
        listaP = new ArrayList <Persona> ();
    }
    
    public void adicionarPersona(Persona at)
    {
        listaP.add(at);
    }
    
    public int definirTamanioLista()
    {
        return listaP.size();
    }
    
    public Persona obtenerPersona(int indice)
    {
        return listaP.get(indice);
    }
    
    public void borrarPersona(Persona at)
    {
        listaP.remove(at);
    }
    
    public void mostrarLista()
    {
        Iterator <Persona> it = listaP.iterator();
        while (it.hasNext())
        {
            Persona at = it.next();
            System.out.println(at);
        }
    }
}


package Package;

/**
 *
 * @author River
 */
public class Mensaje implements IDato{

    private String dato;
    
    @Override
    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String getDato() {
       return this.dato;
    }
    
}

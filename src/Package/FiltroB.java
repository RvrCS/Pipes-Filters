package Package;

/**
 *
 * @author River
 */
public class FiltroB implements IFilter<IDato>{

    @Override
    public IDato Execute(IDato mensaje) {
        String mensajeModificado = mensaje.getDato();
        System.out.println("Filter 2 passed");
        mensajeModificado = mensajeModificado + " y adios niños heroes.";
        
        mensaje.setDato(mensajeModificado);
        
        return mensaje;
    }
    
    
}

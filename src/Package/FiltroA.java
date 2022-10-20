package Package;

/**
 *
 * @author River
 */
public class FiltroA implements IFilter<IDato>{

    @Override
    public IDato Execute(IDato mensaje) {
        String mensajeModificado = mensaje.getDato();
        System.out.println("Filter 1 passed");
        mensajeModificado = mensajeModificado + " México";
        
        mensaje.setDato(mensajeModificado);
        
        return mensaje;
    }

  
}

package Package;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author River
 */
public abstract class PipeBase<T> {
    
    private List<IFilter<T>> filtros = new ArrayList<IFilter<T>>();
    
    
    public void registrarFiltro(IFilter<T> filtro){
        filtros.add(filtro);
    }
    
    public void procesarFiltros(T mensaje){
        
        for (IFilter<T> filtro : filtros) {
            filtro.Execute(mensaje);
        }
    }
}

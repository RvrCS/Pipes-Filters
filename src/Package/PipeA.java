package Package;

import java.util.List;

/**
 *
 * @author River
 */
public class PipeA extends PipeBase<IDato>{
    
    public PipeA(List<IFilter<IDato>> filtros){
        for (IFilter filtro : filtros) {
            this.registrarFiltro(filtro);
        }
    }   

    public PipeA() {
    }
    
}
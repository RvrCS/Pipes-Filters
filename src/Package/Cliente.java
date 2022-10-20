package Package;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public static void main(String[] args) {
        List<IFilter<IDato>> filtros = new ArrayList<IFilter<IDato>>();
        
        IDato mensaje = new Mensaje();
        
        mensaje.setDato("Hola");
        
        filtros.add(new FiltroA());
        filtros.add(new FiltroB());
        
        PipeBase<IDato> tuberia = new PipeA(filtros);
        
        tuberia.procesarFiltros(mensaje);
        System.out.println(mensaje.getDato());
    }
    
}

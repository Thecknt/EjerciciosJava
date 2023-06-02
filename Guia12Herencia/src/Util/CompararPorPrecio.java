
package Util;

import Entidades.Hoteles;
import java.util.Comparator;

public class CompararPorPrecio implements Comparator<Hoteles>{

    @Override
    public int compare(Hoteles t, Hoteles t1) {
       return  t.getPrecioHabitacion().compareTo( t1.getPrecioHabitacion());
    }
    
}

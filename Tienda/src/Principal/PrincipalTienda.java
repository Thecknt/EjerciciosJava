
package Principal;

import tienda.servicios.ProductoService;


public class PrincipalTienda {

    public static void main(String[] args) throws Exception {
 
        ProductoService ps =new ProductoService();
          ps.consultas();
    }
    
}

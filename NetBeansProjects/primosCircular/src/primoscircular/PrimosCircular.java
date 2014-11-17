package primoscircular;

import java.util.*;

/**
 *
 * @author jmgijon
 */
public class PrimosCircular {
    public static void main(String[] args) {
        int i=0;
        verificaPrimos prm = new verificaPrimos();

        ArrayList<Integer> primos = new ArrayList<Integer>();
        
        for (i=10; i<1000000; i++){ // Inicio en i=10, ya que con numero de 1 digitos no se pueden hacer rotaciones de digitos.        
            if (prm.esPrimo(i))
                primos.add(i);
        }
        
        for (i=0; i<primos.size(); i++){
            verificarCircular crc = new verificarCircular(primos.get(i));
            crc.start();
        }
    }
}
package primoscircular;

/**
 *
 * @author jmgijon
 */
public class verificarCircular extends Thread{
    int numero = 0;

    public verificarCircular(int numero) {
        this.numero = numero;
    }
    
    @Override
    public void run (){
        if (esCircular())
            System.out.println(numero);
    }
    
    public boolean esCircular (){
             int i=0;
             String digitos = new String ();
             verificaPrimos prm = new verificaPrimos();

             digitos = Integer.toString(numero);
         
            for (i=0; i<digitos.length(); i++){
                digitos = digitos.substring(1) + digitos.substring(0,1);
                if(!prm.esPrimo(Integer.parseInt(digitos)))
                     return false;
             }
             return true;
    }
}

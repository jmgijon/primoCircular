package primoscircular;

import java.util.*;

/**
 *
 * @author jmgijon
 */

// Algoritno para determinar si un numero es primo http://www.conoce3000.com/html/espaniol/Libros/Matematica01/Cap07-03-AlgoritmoDeterminarNumeroPrimo.php
public class verificaPrimos {
    ArrayList<Integer> primosMenores = new ArrayList<Integer>(Arrays.asList(2,3,5));
    public boolean esPrimo (int numero){
        double raiz = 0;
        raiz = Math.sqrt(numero);
        
        ArrayList<Integer> primosMenoresRaiz = new ArrayList<Integer>();
        
        if (!division (numero, primosMenores))
            return false;

        if (raiz % 1 == 0)
            return false;

        primosMenoresRaiz = primosRaiz((int) raiz);
        if (!division (numero, primosMenoresRaiz))
            return false;
        return true;
    }
    
    public boolean division (int numero, ArrayList<Integer> divisores){
        int count = divisores.size() - 1;
        
        while (count > -1){
            if (numero % divisores.get(count) == 0)
                return false;
            count --;
        }
        return true;
    }
    
    public ArrayList<Integer> primosRaiz (int raiz){
        int i=0;
        ArrayList<Integer> primosMenoresRaiz = new ArrayList<Integer>();

        for (i=7; i<=raiz; i++){
            if (esPrimo(i))
                primosMenoresRaiz.add(i);
        }
        return primosMenoresRaiz;
    }
}

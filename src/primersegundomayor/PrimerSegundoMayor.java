package primersegundomayor;

import java.io.PrintStream;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar Ramirez ID 378938
 */


public class PrimerSegundoMayor {

    public static int Maximo(int[] a){
        return Maximo(a, 0 , a.length - 1);
    }
    static int Maximo(int[] a, int inf, int sup ){
        
        if ( inf == sup ) return a [inf];
        
        int medio = (inf + sup ) / 2 ;
        int maxIzq = Maximo(a, inf, medio);
        int maxDer = Maximo (a, medio + 1, sup);
        
        if (maxIzq > maxDer ){
            
            return maxIzq;
        }else{                    
            return maxDer;   
            }
        }    
    
    /////***** funcion para elevar a la 2 los numeros del array ***********
    
        public static int[] multiplicar (int [] enteros){
            
        int [] r = new int [enteros.length ];
        
 
        for ( int i = 0; i < enteros.length ; i++){
                int mul = enteros[i] * enteros[i];
                r[i] = mul ;   
                       
            }
           return r ;
        }
    
    
    
    
    
    public static void main(String[] args) {
     
        int[]enteros ={1,4,8,3,5,1,7,9};
        
        
        System.out.println("Primer numero mayor = " + Maximo(enteros));        
        System.out.println("Numero elevados a la 2 = " + Arrays.toString(multiplicar(enteros)));

    }

    
    
}


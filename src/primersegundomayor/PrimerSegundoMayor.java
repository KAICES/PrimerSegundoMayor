package primersegundomayor;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
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
        return Math.max(maxIzq, maxDer);

        }    
  
    public static int Minimo(int[] a){
        return Minimo(a, 0 , a.length - 1);
    }
    static int Minimo(int[] a, int inf, int sup ){
        
        if ( inf == sup ) return a [inf];
        
        int medio = (inf + sup ) / 2 ;
        int maxIzq = Maximo(a, inf, medio);
        int maxDer = Maximo (a, medio + 1, sup);        
        return Math.min(maxIzq, maxDer);  
        
    }
    
    public static void main(String[] args) {
     
        
        int num, nEnteros;
	Scanner leer = new Scanner(System.in);	
        System.out.print("Cuantos numeros quiere ingresar ? : ");
        nEnteros = leer.nextInt();        
             
        
        int[]enteros =new int [nEnteros];
        for (int i = 0; i < enteros.length ; i++){    
                System.out.print("Digite el numero a ingresar \n");
                enteros[i] =leer.nextInt();         
            }
            
        int[]enteros2 = new int [enteros.length ];
        for ( int j = 0; j < enteros.length ; j++){
                int mul = enteros[j] * enteros[j];
                enteros2[j] = mul ;   
                       
            } 
        System.out.println("************************************************************************");
        System.out.println("Numeros del array = " + Arrays.toString(enteros));
        System.out.println("Primer numero mayor = " + Maximo(enteros)); 
        System.out.println("Segundo numero mayor = " + Minimo(enteros));
        System.out.println("************************************************************************");
        System.out.println("Numero elevados a la 2 = " + Arrays.toString(enteros2));
        System.out.println("Primer numero elevado a la 2 = " + Maximo(enteros2));
        System.out.println("Segundo numero mayor elevado a la 2 = " + Minimo(enteros2));

    }
}
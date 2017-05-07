package primersegundomayor;
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
    
    
    public static void main(String[] args) {
     
        int[]enteros ={1,4,8,3,5,1,7,9};
        
        
        int[]enterosDos = {1,4,8,3,5,1,7,9};
        
        System.out.println("Primer numero mayor = " + Maximo(enteros));

    }
    
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_varios;

/**
 *
 * @author Alvaro
 */
public class FuncionCompararCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena1 = "hola fondo sur";
        String cadena2 = "hola fondo norte";
        String cadena3 = "apple mola";
        String cadena4 = "apple mola";
        
        if (iguales(cadena1, cadena2))System.out.printf("-%s- y -%s- Son iguales.\n",cadena1,cadena2);
        else System.out.printf("-%s- y -%s- No son iguales.\n",cadena1,cadena2);
        
        if(iguales(cadena3, cadena4))System.out.printf("-%s- y -%s- Son iguales.\n",cadena3,cadena4);
        else System.out.printf("-%s- y -%s- No son iguales.\n",cadena3,cadena4);
        
                
                
    }
    
    public static boolean iguales(String cadena1, String cadena2){
        
        boolean esIgual = false;
        
        if (cadena1.length() == cadena2.length()){
            for (int i = 0;i<cadena1.length()-1;i++){
                if (cadena1.charAt(i) == cadena2.charAt(i)){
                    esIgual = true;
                }    
            }
        }
        return esIgual;
        
        
    }
    
}

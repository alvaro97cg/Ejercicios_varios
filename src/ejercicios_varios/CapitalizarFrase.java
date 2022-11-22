/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_varios;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class CapitalizarFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        String frase;
        
        System.out.println("Dime una frase: ");
        frase = teclado.nextLine();

        System.out.println(capitalizar(frase));
        
    }
    
    public static String capitalizar (String frase){
        char letra;
        
        
        String fraseNueva = "";
        
        for (int i = 1; i < frase.length();i++){
            
            if (frase.charAt(i-1) == ' '){
                letra = frase.charAt(i);
                letra = Character.toUpperCase(letra);
                fraseNueva = fraseNueva + letra;
                
            }else{
                letra = frase.charAt(i);
                fraseNueva = fraseNueva + letra;
            }
            
        }
        letra = frase.charAt(0);
        letra = Character.toUpperCase(letra);
        fraseNueva = letra+fraseNueva;
        
        return fraseNueva;
        
    }
    
}

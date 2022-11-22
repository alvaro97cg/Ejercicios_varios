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
public class Intercambiar_letras_en_palabras_en_frases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        int palabras;
        String []frase;
        char []iniciales;
        char []finales;
        
        System.out.print("Cuantas palabras tendrá la frase: ");
        palabras = Integer.parseInt(teclado.nextLine());
        
        frase = new String [palabras];
        iniciales = new char [palabras];
        finales = new char [palabras];
                
        
        for (int i = 0;i<palabras;i++){
            System.out.print("Dime la "+(i+1)+" palabra: ");
            frase[i] = teclado.nextLine();
        }
        
        System.out.println("");
        for (int i = 0;i<palabras;i++){
            iniciales[i] = frase[i].charAt(0);
            finales[i] = frase[i].charAt(frase[i].length()-1);
        }
        
        for (int i = 0; i<frase.length;i++){
            System.out.print(frase[i] + " ");
        }
        System.out.println("");      
        System.out.print(iniciales);
        System.out.println(" <-- Iniciales");
        System.out.print(finales);
        System.out.println(" <-- Finales");
        
        for (int i = 0; i<frase.length;i++){
            System.out.print(finales[i]);
            for (int j=1;j<frase[i].length();j++){
                System.out.print(frase[i].substring(j,frase[i].length()-1));
                break;
            }
            System.out.print(iniciales[i]);
            System.out.print(" ");
        }
        System.out.println("");
        
        
    }
    
}

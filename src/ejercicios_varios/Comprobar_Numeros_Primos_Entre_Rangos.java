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
public class Comprobar_Numeros_Primos_Entre_Rangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        int min;
        int max;
        int i = 2;
        int contador = 0;
        
        System.out.print("Dime el número mínimo: ");
        min = Integer.parseInt(teclado.nextLine());
        System.out.print("Dime el número máximo: ");
        max = Integer.parseInt(teclado.nextLine());
        
        while (min<max){
            while(i<min){
                if(min % i == 0){
                    contador++;
                }
                i++;
            }
            
            min++;
            i = 2;
            
            if(contador == 0)System.out.printf("El %d es un número primo\n",min-1);      
            contador = 0;
        }
        
        
        
    }
    
}

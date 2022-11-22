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
public class Comprobador_Numeros_Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        int numero;
        boolean esPrimo = false;
        
        System.out.print("Dime el número que quieres comprobar: ");
        numero = Integer.parseInt(teclado.nextLine());
        
        
        for (int i = 2;i<numero;i++){      
            if (numero % i == 0){
                esPrimo = true;
                break;
            }
               
        }
      
        if(esPrimo) System.out.println("El número no es primo");
        else System.out.println("El número es primo");
        
    }
    
}

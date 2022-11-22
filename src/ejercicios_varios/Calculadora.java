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
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        double num;
        double num2;
        int opcion;
        double resultado = 0;
        
        
        System.out.println("\033[32m** CALCULADORA **\033[30m\n"
                + "1. Sumar\n2. Restar\n3. Multiplicar\n"
                + "4. Dividir\n5. Salir.");
        
        System.out.print("\nElige una opción --> ");
        opcion = Integer.parseInt(teclado.nextLine());
        
        
        System.out.print("Número 1: ");
        num = Double.parseDouble(teclado.nextLine());
        System.out.print("Número 2: ");
        num2 = Double.parseDouble(teclado.nextLine());
        
        
        
        switch(opcion){
            
            case 1:
                resultado = num + num2;
                break;
                
            case 2:
                resultado = num - num2;
                break;
                    
            case 3:
                resultado = num * num2;
                break;
                
            case 4:
                resultado = num / num2;
                break;
                
            case 5:
                break;
            
        }
        
        System.out.printf("El resultado es: %.2f\n",resultado);
        
        
    }
    
}

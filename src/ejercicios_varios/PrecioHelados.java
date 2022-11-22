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
public class PrecioHelados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String tamaño;
        String topping;
        int precio = 0;
        
        System.out.print("Dime el tamaño del helado: ");
        tamaño = teclado.nextLine();
        
        if (tamaño.equals("pequeño")) precio = precio + 3;
        else precio = precio+4;
        
        System.out.print("Dime el topping: ");
        topping = teclado.nextLine();
        
        if(topping.equals("chocolate")) precio = precio + 1;
        else if(topping.equals("fresas")) precio = precio + 2;
        else precio = precio + 1;
        
        System.out.printf("El helado %s con %s cuesta euros %d.\n",tamaño,topping,precio);
        
            
        
        
        
        
    }
    
}

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
public class PruebaFuncionesNumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
                int opcion;
              
                
            do{    
                System.out.println(menu());
                opcion = opcion();
                       
                System.out.println(casos(opcion));
                
            }while(opcion == 1 || opcion == 2);
                
                
    }
    
    public static String casos(int opcion){ 
        switch (opcion){
                    case 1:
                        System.out.println(caso1());
                    break;
                
                    case 2:
                        System.out.println(caso2());
                        break;
                        
                    case 3:
                        break;
                        
        }
        return "";
        
    }
    
    public static String caso1 (){
        
        Scanner teclado = new Scanner (System.in);
        int numero;
        System.out.println("== Comprobar número primo ==");
        System.out.print("Dime el número que quieres comprobar: ");
        numero = Integer.parseInt(teclado.nextLine());
        if (esPrimo(numero) == false) System.out.printf("El número -%d- es primo.\n\n",numero);
        else System.out.printf("El número -%d- no es primo.\n",numero);
        return "";
    }
    
    public static String caso2 (){
        Scanner teclado = new Scanner (System.in);
        int min;
        int max;
        
        System.out.println("== Comprobar primos entre rangos ==");
        System.out.print("Dime el mínimo: ");
        min = Integer.parseInt(teclado.nextLine());
        System.out.print("Dime el máximo: ");
        max = Integer.parseInt(teclado.nextLine());  
        System.out.println(numerosPrimos(min, max));
        return "";
        
    }
    
    public static int opcion (){
        Scanner teclado = new Scanner (System.in);
        int num;
        System.out.println("Elige una opción: ");
        num = Integer.parseInt(teclado.nextLine());
        return num;
    }
            
    public static String menu (){
        
        String fin = "";
        System.out.println("*** NÚMEROS PRIMOS ***");
                System.out.println("1.- Comprobar si un número es primo.");
                System.out.println("2.- Comprobar números primos en un rango entre dos números");
                System.out.println("3.- Salir");
        return fin;      
    }
    
    public static String numerosPrimos (int min, int max){
        
        String fin = "";
        int i = 2;
        int contador = 0;
        
        
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
        return fin;
    }
    
    public static boolean esPrimo (int num){
        
        boolean esPrimo = false;
        
        
        for (int i = 2;i<num;i++){      
            if (num % i == 0){
                esPrimo = true;
                break;
            }
               
        }
        return esPrimo;
        
    }

}
    


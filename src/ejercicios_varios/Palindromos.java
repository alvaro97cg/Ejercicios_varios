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
public class Palindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        String palabra = ""; // Palabra que voy a comprobar
        char letra;  // Lo utilizo para poder meter los carácteres al array1 en el bucle.
        char letra2; //Lo utilizo para poder meter los carácteres al array2 en el bucle.
        int aux = 0;  //Lo utilizo para el conteo de [] en el array2. (Sistema para rellenarlo a la inversa de la palabra)
        boolean esPalindromo = true; //Inicializo en true y cuando hago las comparaciones si alguna no coincide pasa a false.
        
        System.out.print("Introduce una palabra: ");  //Pido la palabra a comprobar.
        palabra = teclado.nextLine();
        char []array1 = new char [palabra.length()]; //Creo los dos arrays con el tamaño de la palabra.
        char []array2 = new char [palabra.length()]; 
        
        for (int i = palabra.length()-1; i>=0;i--){  //Relleno el array2 de derecha a izquierda.
            letra2 = palabra.charAt(i);  //Asigno a letra2 el caracter de (i). El valor de i empieza en tamaño palabra y va descendiendo.
            array2[aux] = letra2;  //Meto el ultimo caracter de la palabra en la posición 1 del array2
            aux++; 
        }
        
        for (int i = 0;i<palabra.length();i++){  //Relleno el array1 de izquierda a derecha.
            letra = palabra.charAt(i);
            array1[i] = letra;          
        }
        
        
        for (int i = 0; i<array1.length;i++){
            if (array1[i] != array2[i]){
                esPalindromo = false;
            }
        }
        
        if(esPalindromo) System.out.printf("La palabra '%s' es palíndromo\n",palabra);
        else System.out.printf("La palabra '%s' no es palíndromo\n",palabra);
        
    }
    
}

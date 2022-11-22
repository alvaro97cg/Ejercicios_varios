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
public class PPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        String []atributos = {"Piedra","Papel","Tijera"};
        int jugador1 = 0;
        int jugador2 = 0;
        int random;
        int contador1 = 0;
        int contador2 = 0;
        int empate = 0;
        
        
        for (int i = 0; i<10000;i++){
            random = (int)(Math.random()*3);
            jugador1 = random;
            random = (int)(Math.random()*3);
            jugador2 = random;
            System.out.println("Jugador 1: "+atributos[jugador1]);
            System.out.println("Jugador 2: "+atributos[jugador2]);
            
        
        
            switch(jugador1){

                case 0: 
                    if(jugador2 == 0){
                        empate++;
                        break;
                    }else if(jugador2 == 1){
                        contador2++;
                        System.out.println("\033[31mJugador 2 gana.\033[30m");
                        break;
                    }else{
                        contador1++;
                        System.out.println("\033[34mJugador 1 gana.\033[30m");
                        break;
                    }

                case 1:
                    if(jugador2 == 0){
                        contador1++;
                        System.out.println("\033[34mJugador 1 gana.\033[30m");
                        break;
                    }else if(jugador2 == 1){
                        empate++;
                        System.out.println("\033[31mJugador 2 gana.\033[30m");
                        break;
                    }else{
                        contador2++;
                        break;
                    }

                case 2:
                    if (jugador2 == 0){                   
                        contador2++;
                        System.out.println("\033[31mJugador 2 gana.\033[30m");
                        break;
                    }else if(jugador2 == 1){
                        System.out.println("\033[34mJugador 1 gana.\033[30m");
                        contador1++;
                        break;
                    }else{
                        empate++;
                        break;

                    }
            }  
            System.out.println("");
        }
        
        System.out.println("Empates: "+empate);
        System.out.println("Victorias jugador 1: "+contador1);
        System.out.println("Victorias jugador 2: "+contador2);
        
        
        
        
    }
    
}

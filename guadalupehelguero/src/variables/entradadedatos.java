/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;
import java.util.Scanner;
public class entradadedatos {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String nombre;
        System.out.println("ingresa tu nombre");
        nombre=leer.nextLine();
        Scanner leerEdad = new Scanner (System.in);
        System.out.println("ingresa tu edad :");
        int edad =leerEdad.nextInt();
        
        
        System.out.println("hola tu nombre es "+nombre);
        System.out.println("tu edad es "+edad );
        
        
        
    }
}
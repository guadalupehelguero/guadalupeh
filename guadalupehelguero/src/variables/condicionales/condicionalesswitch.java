/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

/**
 *
 * @author LABO B
 */
public class condicionalesswitch {
    
   public static void main(String[] args) {
        int opcion = 2; // Valor fijo asignado

        // Evaluamos la opción con switch
        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste la opción 1.");
                break;
            case 2:
                System.out.println("Seleccionaste la opción 2.");
                break;
            case 3:
                System.out.println("Seleccionaste la opción 3.");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Fin del programa.");
    }}
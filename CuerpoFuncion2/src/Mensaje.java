/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Mensaje {

    public static void Imprimir(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) { // Cuerpo de la función
            System.out.println(mensaje);
        }
    }
    
    public static void main(String[] args) {
        String saludo = "¡Hola, mundo!";
        int n = 3;
        
        Imprimir(saludo, n); // Llamada a la función
    }
}

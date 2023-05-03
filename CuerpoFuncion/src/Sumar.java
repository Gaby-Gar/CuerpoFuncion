/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Sumar {

    public static int Calcular(int a, int b) {
        int suma = a + b; // Cuerpo de la función
        return suma;
    }
    
    public static void main(String[] args) {
        int x = 5, y = 3, resultado;
        
        resultado = Calcular(x, y); // Llamada a la función
        
        System.out.println("La suma es " + resultado);
    }
}
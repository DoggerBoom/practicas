/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulo;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamaño del lado: ");
        
        int filas = scanner.nextInt();
        int[][] triangulo = new int[filas][filas];

        // Generar el Triángulo de Pascal
        for (int i = 0; i < filas; i++) {
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }

        for (int i = 0; i < filas; i++) {

            for (int k = 0; k < filas - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j] + " ");
            }

            System.out.println();
        }
    }
}
//hecho por lalo con MUCHA ayuda de algunos videos
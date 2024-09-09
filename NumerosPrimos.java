/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;
import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Intoduce un numero: ");
     int primo = scanner.nextInt();
    
     
     if(nPrimo(primo) ){
         System.out.println("El " + primo + " si es primo");
     }else{
         System.out.println("El "+ primo + " no es primo");
     }
     
     
     for(int i=1; i<=100; i++){
         if (nPrimo(i)){
             System.out.println(i);
         }
     }
     
  }
    
    
    public static boolean nPrimo(int numero){
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
     }
    
    
     
}
//lo mismo que los otros codigos

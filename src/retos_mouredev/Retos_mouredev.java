/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
package retos_mouredev;

/**
 *
 * @author Inspiron
 */
public class Retos_mouredev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("EL FAMOSO \"FIZZ BUZZ\"");
        
        int num1 =0;
        for (int i = 1; i < 101; i++) {
            num1= i;
          
            if (num1 % 3 == 0 && num1 % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            else if (num1 % 3 == 0) {
                System.out.println("fizz");
            }
            else if (num1 % 5 == 0) {
                System.out.println("buzz");
            }
            else{
                System.out.println(num1);
            }
            
           
        }
        
        }
       
        
    }
    


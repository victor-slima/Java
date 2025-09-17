package entradadedados;

import java.util.Scanner;

/*
 * Entrada e saída de dados em Java.
 */
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int valorDigitado = scanner.nextInt(); // ler um inteiro;
        System.out.println(valorDigitado);
        scanner.close(); // tem que fechar, por causa de vazamento de recurso.
    }
}

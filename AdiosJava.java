import java.util.Scanner;

public class AdiosJava {
    public static void main (String[] args){
        int numero1, numero2, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el segundo numero");
        numero2 = scanner.nextInt();

        resultado = numero1 + numero2;

        System.out.println("El resultado de la suma es:"+ resultado);

        scanner.close();
    }
}
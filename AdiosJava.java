import java.util.Scanner;

public class AdiosJava {
    public static Scanner scanner = new Scanner(System.in);

    public static int ResultadoResta(){
        int numero_resta1, numero_resta2, resta;

        System.out.println("\nOperación aritmetica -Resta-");

        System.out.println("Escribe el primer número de la resta: ");
        numero_resta1 = scanner.nextInt();
        System.out.println("Escribe el número que restara al primero: ");
        numero_resta2 = scanner.nextInt();

        resta = numero_resta1 - numero_resta2;

        return resta;
    }
    
    public static void main (String[] args){
        int numero1, numero2, suma;

        System.out.println("Operación aritmética -Suma-");
        
        System.out.println("Escribe el primer número");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el segundo número");
        numero2 = scanner.nextInt();

        suma = numero1 + numero2;

        System.out.println("El resultado de la suma es:"+ suma);
        System.out.println("El resultado de la resta es:"+ ResultadoResta());

        scanner.close();
    }
    
}

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        double numero1 = teclat.nextDouble();
        System.out.print("Introduce otro: ");
        double numero2 = teclat.nextDouble();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("--------------");
        System.out.print("Elige la operación: ");
        int opcion = teclat.nextInt();
        switch (opcion){
            case 1:
                System.out.println(numero1 + numero2);
                break;
                case 2:
                System.out.println(numero1 - numero2);
                break;
                case 3:
                System.out.println(numero1 * numero2);
                break;
                case 4:
                System.out.println(numero1 / numero2);
                break;
        }
    }

}

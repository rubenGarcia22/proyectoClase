
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introduce una nota: ");
        double nota = teclat.nextInt();
        if (nota < 5) {
            System.out.println("Suspendido");
        } else if (nota >= 5 && nota <6) {
            System.out.println("Aprobado");
        } else if (nota >= 6 && nota <7) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else{
            System.out.println("Nota no valida");
        }
    }
}


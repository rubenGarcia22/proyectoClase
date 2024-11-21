
package actividad_2_2_nombre__primer_apellido;

public class copiarArray {
    public static void main(String[] args) {
        double [] arrayA = {2, 3, 4, 5};
        double [] arrayB = new double[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i];
        }
    }
}

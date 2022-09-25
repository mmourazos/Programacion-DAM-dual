/**
 * IfElse
 * 
 * Este ejemplo simula el lanzar una moneda al aire con un 50% de probabilidad
 * de que salga cara y un 50% de que
 * salga cruz.
 */
public class IfElse {

    public static void main(String[] args) {
        double random = Math.random(); // random() devuelve un número mayor O IGUAL que 0 y menor que 1.

        if (random > 0.5) {
            System.out.println("Ha salido cara.");
        } else {
            System.out.println("Ha salido cruz.");
        }
    }
}
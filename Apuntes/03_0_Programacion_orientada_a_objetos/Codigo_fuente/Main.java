/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        // alumno es heredero de Object.
        System.out.println(alumno.toString());
        System.out.printf("%x%n", alumno.hashCode());
        System.out.printf("%d%n", alumno.hashCode());

        alumno.setNombre("Manuel");
        alumno.setApellidos("Piñeiro");

        alumno.setFechaDeNacimiento(15, 5, 1977);

        System.out.println("Nací el " + alumno.getFechaDeNacimiento());
    }
}

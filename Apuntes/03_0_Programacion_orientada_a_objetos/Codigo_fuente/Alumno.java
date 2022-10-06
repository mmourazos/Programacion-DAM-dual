import java.util.Calendar;

public class Alumno extends Object {
    private String nombre;
    private String apellidos;
    private Calendar fecha_de_nacimiento;

    // [visibilidad]<
    // tipo de dato|void><nombre>([parametros])
    // {
    // [código]
    // }

    public Alumno(String nombre, String apellidos, Calendar fecha_de_nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaDeNacimiento(int dia_mes, int mes, int anho) {
        Calendar fn = Calendar.getInstance();
        fn.set(anho, mes - 1, dia_mes);
        this.fecha_de_nacimiento = fn;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaDeNacimiento() {
        return String.format("%1$td de %1$tM de %1$tY", this.fecha_de_nacimiento);
    }

}

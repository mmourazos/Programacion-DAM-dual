import java.util.ArrayList;
import org.cotarelo.gestion.AlumnoFP;
import org.cotarelo.gestion.Ciclo;
import org.cotarelo.gestion.Modulo;

public class Main {
    public static void main(String[] args) {
        Ciclo DAM_dual = new Ciclo();
        DAM_dual.setNombreCiclo("DAM Dual");
        Modulo programacion = new Modulo();

        ArrayList<Modulo> modulos = new ArrayList<Modulo>();
        modulos.add(programacion);

        DAM_dual.setModulos(modulos);

        AlumnoFP alumno_fp_DAM_dual = new AlumnoFP();
        alumno_fp_DAM_dual.setCiclo(DAM_dual);
        alumno_fp_DAM_dual.setNombre("Manuel");
        alumno_fp_DAM_dual.setApellidos("Piñeiro");
        alumno_fp_DAM_dual.setCiclo(DAM_dual);

        System.out.println(alumno_fp_DAM_dual);
    }
}

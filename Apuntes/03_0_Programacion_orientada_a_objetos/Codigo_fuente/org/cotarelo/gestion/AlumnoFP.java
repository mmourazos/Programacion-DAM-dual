package org.cotarelo.gestion;

import java.util.ArrayList;

public class AlumnoFP extends Alumno {
    private Ciclo ciclo;

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public ArrayList<Modulo> getModulos() {
        return this.ciclo.getModulos();
    }

    @Override
    public String toString() {
        String info = "Nombre: " + this.getNombre() + " " + this.getApellidos() + "\n";
        info += "Ciclo: " + this.getCiclo() + "\n";

        return info;
    }
}

package org.cotarelo.gestion;

import java.util.ArrayList;

public class Ciclo {
    private String nombre_ciclo;
    private ArrayList<Modulo> modulos;

    public void setNombreCiclo(String nombre_ciclo) {
        this.nombre_ciclo = nombre_ciclo;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public String getNombreCiclo() {
        return nombre_ciclo;
    }

    public boolean tieneModulo(String nombre_modulo) {
        for (Modulo modulo : this.modulos) {
            if (nombre_modulo.equals(modulo.getNombreModulo())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.nombre_ciclo;
    }

}

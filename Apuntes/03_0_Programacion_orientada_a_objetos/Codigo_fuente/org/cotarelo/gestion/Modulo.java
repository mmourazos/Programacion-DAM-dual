package org.cotarelo.gestion;

public class Modulo {
    private String nombre_modulo;
    private int curso; // 1 ó 2 para primero o segundo.

    public void setNombreModulo(String nombre_modulo) {
        this.nombre_modulo = nombre_modulo;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getNombreModulo() {
        return nombre_modulo;
    }

    public int getCurso() {
        return curso;
    }
}

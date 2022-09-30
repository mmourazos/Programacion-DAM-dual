package org.cotarelo.gestion;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alumno {
    private Calendar fecha_nacimiento;
    private String telefono;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;


    public void setFechaNacimiento(Calendar fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        Date now = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(now);

        int año_nacimiento = fecha_nacimiento.get(Calendar.YEAR);
        int mes_nacimiento = fecha_nacimiento.get(Calendar.MONTH);
        int día_nacimiento = fecha_nacimiento.get(Calendar.DAY_OF_MONTH);

        int este_mes = calendar.get(Calendar.MONTH);
        int este_año = calendar.get(Calendar.YEAR);
        int este_día = calendar.get(Calendar.DAY_OF_MONTH);

        int edad = este_año - año_nacimiento;

        if (mes_nacimiento < este_mes) {
            ++edad;
        } else if (día_nacimiento < este_día) {
            ++edad;
        }

        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

}

package udem.edu.co.com.modelo.entitys;

import udem.edu.co.com.modelo.clases.Planta;

public class Lechuga extends Planta {

    private String nombre;
    private String color;
    private String edad;

    public Lechuga(String nombre, String color, String edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "<Lechuga>" +
                "<nombre>" + nombre + "</nombre>" +
                "<color>" + color + "</color>" +
                "<edad>" + edad + "</edad>" +
                "</Lechuga>";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public void crecer() {

    }
}
package com.gavilan.actividad1final;

public class Mascota {

    private String Nombre;
    private String Sexo;
    private String Tipo;
    private  boolean Duenio;

    public Mascota(String nombre, String sexo, String tipo, boolean duenio) {
        Nombre = nombre;
        Sexo = sexo;
        Tipo = tipo;
        Duenio = duenio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public boolean isDuenio() {
        return Duenio;
    }

    public void setDuenio(boolean duenio) {
        Duenio = duenio;
    }
}

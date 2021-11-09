package com.example.springcoredojo.Entidades;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("jugadores-config.properties")
public class Jugador {
    @Value("${a.nombre}")
    private String nombre;

    @Value("${a.apellido}")
    private String apellido;

    @Value("${a.deporte:Basket}")
    private String deporte;

    @Value("${a.edad}")
    private int edad;

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", deporte='" + deporte + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

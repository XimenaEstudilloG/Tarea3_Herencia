/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

import java.awt.Color;

/**
 *
 * @author Ximee_gon
 */
public class Perro {
    private String raza;
    private String tamanio;
    private int peso;
    private Color colorPelaje;
    private int edad;
    private String emitirSonido;

    public Perro() {
    }

    public Perro(String raza, String tamanio, int peso, Color colorPelaje, int edad, String emitirSonido) {
        this.raza = raza;
        this.tamanio = tamanio;
        this.peso = peso;
        this.colorPelaje = colorPelaje;
        this.edad = edad;
        this.emitirSonido = emitirSonido;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Color getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(Color colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmitirSonido() {
        return emitirSonido;
    }

    public void setEmitirSonido(String emitirSonido) {
        this.emitirSonido = emitirSonido;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", tamanio=" + tamanio + ", peso=" + peso + ", colorPelaje=" + colorPelaje + ", edad=" + edad + ", emitirSonido=" + emitirSonido + '}';
    }
    
    public void jugueton(){
        System.out.println("Si lo acaricas no te va a hacer nada, al contrario, querrá jugar contigo");
    }
    
    public void agresivo(){
        System.out.println("No te acerques, te puede morder");
    }
}

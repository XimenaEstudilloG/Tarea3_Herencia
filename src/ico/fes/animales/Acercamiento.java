/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Acercamiento extends Perro{
    private String acercar;
    private String comport;

    public Acercamiento() {
    }

    public Acercamiento(String acercar, String comport) {
        this.acercar = acercar;
        this.comport = comport;
    }

    public Acercamiento(String acercar, String comport, String raza, String tamanio, int peso, Color colorPelaje, int edad, String emitirSonido) {
        super(raza, tamanio, peso, colorPelaje, edad, emitirSonido);
        this.acercar = acercar;
        this.comport = comport;
    }

    public String getAcercar() {
        return acercar;
    }

    public void setAcercar(String acercar) {
        this.acercar = acercar;
    }

    public String getComport() {
        return comport;
    }

    public void setComport(String comport) {
        this.comport = comport;
    }

    @Override
    public String toString() {
        return "Acercamiento{" + "acercar=" + acercar + ", comport=" + comport + '}';
    }

    @Override
    public void jugueton() {
        if (this.comport.equals("Me acerco con buena intencion") ){
            System.out.println("Si lo acaricas no te va a hacer nada, al contrario, querrá jugar contigo");
            super.jugueton();}
        else{
            System.out.println("No te acerques, te puede morder");
        }
    }
    
    
    
    
    public class Acercamiento2 extends Gato{
    private String acercar;
    private String comport;
    
    @Override
    public void amigable() {
        if (this.comport.equals("Me acerco con buena intencion") ){
            System.out.println("Lo puedes tocar, no te hara daño");
            super.amigable();}
        else{
            System.out.println("Si te acercas, te va a arañar");
        }
    
    }

    }
}
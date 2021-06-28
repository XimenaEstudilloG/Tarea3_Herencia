/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import ico.fes.animales.Gato;
import ico.fes.animales.Perro;
import ico.fes.animales.Acercamiento;
import java.awt.Color;
/**
 *
 * @author Admin
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Perro poPerro = new Perro ( "Pomerania", "Pequeño" , 3, Color.WHITE, 7, "Ladra" );
        
        System.out.println(poPerro);
        
        Gato gato = new Gato( "Azul ruso" , "Mediano" , 2, Color.BLUE , 5, "Maulla" );
        
        System.out.println(gato);
        
        System.out.println(".-.-.-.-.-.-.-. Herencia -.-.-.-.-.-.-.");
        Acercamiento comport = new Acercamiento();
       
        System.out.println(poPerro);
        poPerro.jugueton();
        
        Acercamiento comport2 = new Acercamiento();   
    
        System.out.println( gato);
        gato.amigable();
    
    }
    
}

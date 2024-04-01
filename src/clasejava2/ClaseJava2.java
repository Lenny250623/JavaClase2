/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasejava2;

/**
 *
 * @author User
 */
public class ClaseJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final float Pi = 3.141592f;
        // La fórmuloa es "2π (r h + r²)"
        
        // Datos del cilindro 1:
        float radioCilindro1 = 4.0f;
        float alturaCilindro1 = 2.5f;
        float areaCilindro1;
        
        // Datos del cilndro 2:
         float radioCilindro2 = 2.0f;
         float alturaCilindro2 = 5.0f;
         float areaCilindro2;
         
         areaCilindro1 = 2.0f*Pi*(radioCilindro1*alturaCilindro1 + (float)Math.pow((float)radioCilindro1,2.0));
         areaCilindro2 = 2.0f*Pi*(radioCilindro2*alturaCilindro2 + (float)Math.pow((float)radioCilindro2,2.0));
         
         System.out.println("El area del cilindro 1 es:" + areaCilindro1 + "m²");
         System.out.println("El area del cilindro 2 es:" + areaCilindro2 + "m²");
    }
    
}

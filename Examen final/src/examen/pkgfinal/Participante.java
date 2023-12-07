/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.pkgfinal;

/**
 *
 * @author Kalaney
 */
public class Participante {
   
     String nombre;
     int montoPagar;
     
    
   
    public Participante(String nombre, int montoPagar) {
        this.nombre = nombre;
        this.montoPagar = montoPagar;
    }

    public int getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(int montoPagar) {
        this.montoPagar = montoPagar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}

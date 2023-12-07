/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkgfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Kalaney
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cuentas que desea registrar:"));
   
     Facturas arrFacturas[] = new Facturas [cantidad];
     
    
        for (int i = 0; i < arrFacturas.length ; i++) {
         JOptionPane.showMessageDialog(null, "Se solicitarán los dato"
                 + "s de las facturas ");
         String numCuenta=JOptionPane.showInputDialog("Ingrese el numero de cuenta:");
           //      = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto que debe"));
         String descripcion= JOptionPane.showInputDialog("Ingrese la descripción de la " +numCuenta+":");
         int cantidadParti=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de participantes de la  " +numCuenta+":"));
            for (int j = 0; j < cantidadParti; j++) {
              String participantes= JOptionPane.showInputDialog("Ingrese la parciante de la"+numCuenta+":");
            }
         int quienesPago=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de quienes pagaron lo  " +numCuenta+":")); 
            for (int z = 0; z < quienesPago; z++) {
            String quienPago= JOptionPane.showInputDialog("Ingrese el participante que ya pago de la  " +numCuenta+":");    
            }
         int montoTotal=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto total de la  " +numCuenta+":"));
         String moneda=JOptionPane.showInputDialog("Ingrese el nombre de la moneda de la " +numCuenta+":");
         arrFacturas[i]= new Facturas(numCuenta, descripcion, numCuenta, moneda, montoTotal, moneda);

        }
         for (int x = 0; x < arrFacturas.length; x++) {
            JOptionPane.showMessageDialog(null, arrFacturas[x].getCuenta()+"\n"+arrFacturas[x].getDescripcion()
                    +"\n"+arrFacturas[x].getParticipante()+"\n"+arrFacturas[x].getQuienPago()+"\n"+arrFacturas[x].getMontoTotal()+"\n"+arrFacturas[x].getMoneda());
         }
         
            
     }   
  }    


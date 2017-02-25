//MARIELA RAMONES BALVOA A01411449 IMT
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.a07;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arreglo       
        int num;
        String [] tel = new String[10];
        Scanner kb = new Scanner (System.in);
        for (int i = 0; i < tel.length; i++){
            System.out.println ("Teclea el numero de telefono" + i);
            tel[i] = kb.nextLine();
        }
        System.out.println("Porfavor introduzca que numero quiere");
        num = kb.nextInt();
        if (num  < tel.length){
        System.out.println("El número solicitado es " + tel[num]);
        } else System.out.println("El número ingresado está fuera de rango");
    }
}
    
        
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Empleado;
import java.util.Scanner;
import javax.xml.transform.sax.SAXSource;

/**
 *
 * @author Carolina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Variables
    String Nombre="";
    String Codigo="";
    int Año_Ingreso=0;
    int año_actual=2023;
    int resultado=0;
    
    //objetos 
    
    Empleado objempleado=new Empleado();
      Scanner scan=new Scanner (System.in);
        System.out.println("Digite el nombre del empleado");
        Nombre=scan.nextLine();
        objempleado.setNombre(Nombre);
    
    
        System.out.println("Digite el codigo de empleado");
        Codigo=scan.nextLine();
        objempleado.setCodigo(Codigo);
        
        System.out.println("Digite el año de ingreso");
        Año_Ingreso=scan.nextInt();
        objempleado.setAño_Ingreso(Año_Ingreso);
        
        resultado=año_actual-objempleado.getAño_Ingreso();
        
        System.out.println("El nombre de es empleado es: "+"\t"+objempleado.getNombre());
        System.out.println("El codigo del empleado es: "+"\t"+objempleado.getCodigo());
         System.out.println("Los años que lleva el empleado son:"+"\t"+resultado);
            
        
        
    
    
    
        
        
        
    }
    
}

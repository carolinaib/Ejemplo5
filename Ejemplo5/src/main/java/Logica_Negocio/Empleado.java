/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Carolina
 */
public class Empleado {
    //Atributos
    public String Nombre;
    public String codigo;
    public int Año_Ingreso;
    
    //constructor no parametrizado
    
    public Empleado(){}
    
    //contructor parametrizado

    public Empleado(String Nombre, String codigo, int Año_Ingreso) {
        this.Nombre = Nombre;
        this.codigo = codigo;
        this.Año_Ingreso = Año_Ingreso;
    }
    //setter

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAño_Ingreso(int Año_Ingreso) {
        this.Año_Ingreso = Año_Ingreso;
    }
    //Getter

    public String getNombre() {
        return Nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAño_Ingreso() {
        return Año_Ingreso;
    }
    

    
    
}

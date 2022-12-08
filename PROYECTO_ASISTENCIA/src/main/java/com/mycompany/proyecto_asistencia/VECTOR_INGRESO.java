/*
VECTOR DE INGRESOS PARA REGISTRAR LOS DATOS DE LAS ASISTENCIAS DE LOS INGRESOS 
LOS ESTUDIANTES
 */
package com.mycompany.proyecto_asistencia;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author katya
 */// ALBARO CALLIZAYA MOLLO
public class VECTOR_INGRESO {
    private ArrayList <Object>v=new ArrayList<>();
    
    VECTOR_INGRESO()
    {}
   public VECTOR_INGRESO(ArrayList<Object> v)
    {
        this.v=v;
    }
   public void agregarIngreso(INGRESO a)
    {
        this.v.add(a);
    }
    public void modificarIngreso(int i, INGRESO a)
    {
        this.v.set(i, a);
    }   
    public void eliminarIngreso(int i) 
    {
        this.v.remove(i);
    }
    public INGRESO obtenerIngreso(int i)
    {
        return (INGRESO)this.v.get(i);
    }
    public int cantidadIngresos()
    {
        return this.v.size();       //ALBARO CALLIZAYA MOLLO
    }
    public ArrayList buscarIngresos(int cod, Date fechaIni, Date fechaFin)
    {
        ArrayList <INGRESO> va=new ArrayList<>();
        
        for(int i=0; i<this.v.size();i++)
           if((cod==this.obtenerIngreso(i).getRU()) && 
                   (this.obtenerIngreso(i).getFecha().compareTo(fechaIni)>0)
                   && (this.obtenerIngreso(i).getFecha().compareTo(fechaFin)<0))
           {    va.add(obtenerIngreso(i));
           }
        return va;
    }
}
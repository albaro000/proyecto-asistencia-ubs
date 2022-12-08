/*
VECTOR DE SALIDA PARA REGISTRAR LOS DATOS DE LAS ASISTENCIAS DE LAS SALIDAS DE
LOS ESTUDIANTES
 */
package com.mycompany.proyecto_asistencia;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ALBARO CALLIZAYA MOLLO
 */
public class VECTOR_SALIDA {
    private ArrayList <Object>v=new ArrayList<>();
    
    VECTOR_SALIDA()
    {}
    
   public VECTOR_SALIDA(ArrayList<Object> v)
    {
        this.v=v;
    }
   
   public void agregarIngreso(INGRESO a)
    {
        this.v.add(a);
      
    }
    
    public void modificarSalida(int i, SALIDA a)
    {
        this.v.set(i, a);
    }   
     
    public void eliminarSalida(int i) 
    {
        this.v.remove(i);
    }
    
    public SALIDA obtenerSalida(int i)
    {
        return (SALIDA)this.v.get(i);
    }
    
    public int cantidadSalidas()
    {
        return this.v.size();
    }      //ALBARO CALLIZAYA MOLLO
    
    public ArrayList buscarSalidas(int cod, Date fechaIni, Date fechaFin)
    {
        ArrayList <SALIDA> va=new ArrayList<>();
        
        for(int i=0; i<this.v.size();i++)
           if((cod==this.obtenerSalida(i).getRU()) && 
                   (this.obtenerSalida(i).getFecha().compareTo(fechaIni)>0)
                   && (this.obtenerSalida(i).getFecha().compareTo(fechaFin)<0))
           {    va.add(obtenerSalida(i));
           }
        return va;
    }
}

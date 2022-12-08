/*
VECTOR DE ESTUDIANTES
 */
package com.mycompany.proyecto_asistencia;

import java.util.ArrayList;
/**
 *
 * @author ALBARO CALLIZAYA MOLLO
 */
public class VECTOR_ESTUDIANTES { 
    private ArrayList<Object> vest=new ArrayList<>();
    
    public VECTOR_ESTUDIANTES()
    { 
    }
    public VECTOR_ESTUDIANTES(ArrayList<Object>ve)
    {
        this.vest=ve;
    }
    
    public void agregarEstudiante(ESTUDIANTE e)
    {
        this.vest.add(e);
    }
    
    public void modificarEstudiante(int i, ESTUDIANTE e)
    {
        this.vest.set(i, e);
    }
    
    public void eliminarEstudiante(int i)
    {
        this.vest.remove(i);
    }
    
    public ESTUDIANTE obtenerEstudiante(int i)
    {
        return (ESTUDIANTE)this.vest.get(i);
    }
    //ALBARO CALLIZAYA MOLLO
    public int cantidadEstudiante()
    {
        return this.vest.size();
    }
    
    public int buscarRUEstudiante(int RU)
    {
        for(int i=0; i<vest.size();i++)
        {
            if(RU==obtenerEstudiante(i).getRU())
            {
                return i;
            }
        }
        return -1;
    }
}

/*
CLASE ESTUDIANTE MANIPULA LOS DATOS PERSONALES DEL ESTUDIANTE
 */
package com.mycompany.proyecto_asistencia;

/**
 *
 * @author ALBARO CALLIZAYA MOLLO
 */
public class ESTUDIANTE {
   private int RU;
   private String Nombre;
   private String Apellido;
   private char Genero;
   
   public ESTUDIANTE(){
   }
   public ESTUDIANTE(int RU, String Nombre, String Apellido, char Genero){
       this.RU=RU;
       this.Nombre=Nombre;
       this.Apellido=Apellido;
       this.Genero=Genero;
   }
   public int getRU()
   {
       return RU;
   }
   public void setRU(int RU)
   {
       this.RU=RU;
   }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
           //ALBARO CALLIZAYA MOLLO
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }
   
}

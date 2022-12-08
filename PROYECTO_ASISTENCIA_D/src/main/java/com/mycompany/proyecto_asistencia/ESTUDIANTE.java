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
   private int Edad;
   private String EstadoCivil;
   private int Celular;
   private String Nacionalidad;
   private String Cargo;
   
   public ESTUDIANTE(){
   }
   public ESTUDIANTE(int RU, String Nombre, String Apellido, char Genero, int Edad, String EstadoCivil, int Celular, String Nacionalidad, String Cargo){
       this.RU=RU;
       this.Nombre=Nombre;
       this.Apellido=Apellido;
       this.Genero=Genero;
       this.Edad=Edad;
       this.EstadoCivil=EstadoCivil;
       this.Celular=Celular;
       this.Nacionalidad=Nacionalidad;
       this.Cargo=Cargo;
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
    
    
    public int getEdad(){
        return Edad;
    }
    public void setEdad(int Edad){
        this.Edad=Edad;
    }
    
    
    public String getEstadoCivil(){
        return EstadoCivil;
    }
    public void setEstadoCivil(String EstadoCivil){
        this.EstadoCivil=EstadoCivil;
    }
    
    
    public int getCelular(){
        return Celular;
    }
    public void setCelular(int Celular){
        this.Celular=Celular;
    }
    
    
    public String getNacionalidad(){
        return Nacionalidad;
    }
    public void setNacionalidad(String Nacionalidad){
        this.Nacionalidad=Nacionalidad;
    }
    
    
    public String getCargo(){
        return Cargo;
    }
    public void setCargo(String Cargo){
        this.Cargo=Cargo;
    }
}

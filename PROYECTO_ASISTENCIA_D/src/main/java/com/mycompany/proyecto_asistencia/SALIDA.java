/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_asistencia;

import java.util.Date;
/**
 *
 * @author ALBARO CALLIZAYA MOLLO
 */
public class SALIDA {
    private Date Fecha;
    private Date horaSalida;
    private int RU;
    public SALIDA(){
    }
     public SALIDA(Date Fecha, Date horaSalida, int RU) {
        this.Fecha = Fecha;
        this.horaSalida = horaSalida;
        this.RU = RU;
    }
     public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getHoraIngreso() {
        return horaSalida;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaSalida=horaSalida;
    }

    public int getRU() {
        return RU;    //ALBARO CALLIZAYA MOLLO
    }

    public void setRU(int RU) {
        this.RU = RU;
    }
}

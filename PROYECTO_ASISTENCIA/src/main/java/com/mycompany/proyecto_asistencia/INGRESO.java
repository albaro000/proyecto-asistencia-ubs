/*
REGISTRO DE LAS ASISTENCIAS DE INGRESO PERSONAL
 */
package com.mycompany.proyecto_asistencia;

import java.util.Date;
/**
 *
 * @author ALBARO CALLIZAYA MOLLO
 */
public class INGRESO {
    private Date Fecha;
    private Date horaIngreso;
    private int RU;
    private int minutosAtraso;

    public INGRESO() {
    }

    public INGRESO(Date Fecha, Date horaIngreso, int RU, int minutosAtraso) {
        this.Fecha = Fecha;
        this.horaIngreso = horaIngreso;
        this.RU = RU;
        this.minutosAtraso = minutosAtraso;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public int getRU() {
        return RU;
    }          //ALBARO CALLIZAYA MOLLO

    public void setRU(int RU) {
        this.RU = RU;
    }

    public int getMinutosAtraso() {
        return minutosAtraso;
    }

    public void setMinutosAtraso(int minutosAtraso) {
        this.minutosAtraso = minutosAtraso;
    }
    
}

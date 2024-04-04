/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author krodr
 */
public class Orders {
    private String nombreCliente;
    private String detalle;
    private String fechaDeEntraga;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = Calendar.getInstance().getTime();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getFechaDeEntraga() {
        return fechaDeEntraga;
    }

    public void setFechaDeEntraga(String fechaDeEntraga) {
        this.fechaDeEntraga = fechaDeEntraga;
    }
    
    public String printData(){
        return "El nombre del cliente es: " + getNombreCliente()+"\n"+
               "Detalle: " + getDetalle() + "\n"+
               "Fecha de la entrega: " + getFechaDeEntraga() +"\n";
    }
}

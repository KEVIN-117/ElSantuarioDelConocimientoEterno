
package Iplementaciones;

import java.io.Serializable;

public class Data implements Serializable{
    private String nombre;
    private String apellido;
    private int ci;
    private int sueldoHora;
    private int horasTrbajadas;

    public int getHorasTrbajadas() {
        return horasTrbajadas;
    }

    public void setHorasTrbajadas(int horasTrbajadas) {
        this.horasTrbajadas = horasTrbajadas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(int sueldoHora) {
        this.sueldoHora = sueldoHora;
    }
    public String printData(){
        return "\nNombre :" + getNombre()+"\n"+
               "Apeliido :" + getApellido()+"\n"+
               "Ci :" + getCi()+"\n"+
               "Sueldo :" + getSueldoHora()+"\n"+
               "Las horas que trabajo es:" + getHorasTrbajadas()+"\n"+
               "Su sueldo es de " + getSueldoHora()*getHorasTrbajadas();
    }
}

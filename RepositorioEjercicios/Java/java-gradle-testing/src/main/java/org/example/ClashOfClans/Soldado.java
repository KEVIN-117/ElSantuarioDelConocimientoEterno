package org.example.ClashOfClans;

public class Soldado {
    private String objetivoFavorito;
    private String tipoDeDaño;
    private String objetivos;
    private int espacioEnVivienda;
    private int velocidad;

    public Soldado(String objetivoFavorito, String tipoDeDaño, String objetivos,
                   int espacioEnVivienda,
                   int velocidad){
        this.espacioEnVivienda = espacioEnVivienda;
        this.tipoDeDaño =  tipoDeDaño;
        this.objetivos = objetivos;
        this.objetivoFavorito = objetivoFavorito;
        this.velocidad = velocidad;
    }

    public String getObjetivoFavorito() {
        return objetivoFavorito;
    }

    public void setObjetivoFavorito(String objetivoFavorito) {
        this.objetivoFavorito = objetivoFavorito;
    }

    public String getTipoDeDaño() {
        return tipoDeDaño;
    }

    public void setTipoDeDaño(String tipoDeDaño) {
        this.tipoDeDaño = tipoDeDaño;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public int getEspacioEnVivienda() {
        return espacioEnVivienda;
    }

    public void setEspacioEnVivienda(int espacioEnVivienda) {
        this.espacioEnVivienda = espacioEnVivienda;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}

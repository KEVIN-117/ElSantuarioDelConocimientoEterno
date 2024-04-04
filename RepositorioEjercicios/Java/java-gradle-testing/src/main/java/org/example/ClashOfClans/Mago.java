package org.example.ClashOfClans;

public class Mago extends Soldado{
    private  String objetivoFavorito;
    private  String tipoDeDaño;
    private  String objetivos;
    private  int espacioEnVivienda;
    private  int velocidad;
    public Mago(String objetivoFavorito, String tipoDeDaño, String objetivos,
                int espacioEnVivienda,
                int velocidad){
        super(objetivoFavorito, tipoDeDaño, objetivos, espacioEnVivienda, velocidad);
    }
}

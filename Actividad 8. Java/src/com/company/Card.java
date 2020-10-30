package com.company;

public class Card {

    public Card(String Palo, String Color, String Valor){

        this.Palo = Palo;
        this.Color = Color;
        this.Valor = Valor;

    }

    public String getPalo(){
        return Palo;
    }

    public void setPalo(String Palo){
        this.Palo = Palo;
    }

    public String getColor(){
        return Color;
    }

    public void setColor(String Color){
        this.Color = Color;
    }

    public String getValor(){
        return Valor;
    }

    public void setValor(String Valor){
        this.Valor = Valor;
    }


    private String Palo;
    private String Color;
    private String Valor;

}


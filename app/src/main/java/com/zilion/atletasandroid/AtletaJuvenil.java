package com.zilion.atletasandroid;

public class AtletaJuvenil {
    private String name;
    private String birthdate;
    private String neighborhood;
    private String years;

    public AtletaJuvenil(String name, String birthdate, String neighborhood, String years) {
        this.name = name;
        this.birthdate = birthdate;
        this.neighborhood = neighborhood;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Atleta Juvenil: " + name + ", " + birthdate + ", " + neighborhood + ", Anos de Prática: " + years;
    }
}
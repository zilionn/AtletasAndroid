package com.zilion.atletasandroid;

public class AtletaSenior {
    private String name;
    private String birthdate;
    private String neighborhood;
    private boolean hasHeartProblem;

    public AtletaSenior(String name, String birthdate, String neighborhood, boolean hasHeartProblem) {
        this.name = name;
        this.birthdate = birthdate;
        this.neighborhood = neighborhood;
        this.hasHeartProblem = hasHeartProblem;
    }

    @Override
    public String toString() {
        return "Atleta Sênior: " + name + ", " + birthdate + ", " + neighborhood + ", Problemas Cardíacos: " + (hasHeartProblem ? "Sim" : "Não");
    }
}
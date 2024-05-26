package com.zilion.atletasandroid;

public class OutroAtleta {
    private String name;
    private String birthdate;
    private String neighborhood;
    private String academy;
    private String record;

    public OutroAtleta(String name, String birthdate, String neighborhood, String academy, String record) {
        this.name = name;
        this.birthdate = birthdate;
        this.neighborhood = neighborhood;
        this.academy = academy;
        this.record = record;
    }

    @Override
    public String toString() {
        return "Outro Atleta: " + name + ", " + birthdate + ", " + neighborhood + ", Academia: " + academy + ", Recorde: " + record + "s";
    }
}

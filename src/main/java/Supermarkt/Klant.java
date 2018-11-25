package Supermarkt;

public class Klant {
    private String naam;
    private double budget;


    public Klant(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}

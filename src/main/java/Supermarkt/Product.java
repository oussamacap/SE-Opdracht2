package Supermarkt;

public abstract class Product {
    private String naam;
    private double prijs;
    private double korting;
    private int aantal;

    public Product(String naam, double prijs, double korting, int aantal) {
        this.naam = naam;
        this.prijs = prijs;
        this.korting = korting;
        this.aantal = aantal;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getKorting() {
        return korting;
    }

    public void setKorting(double korting) {
        this.korting = korting;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }
}

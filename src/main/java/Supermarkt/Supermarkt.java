package Supermarkt;

import java.util.ArrayList;
import java.util.List;

//Deze class is gaat om een object van een supermarkt te realiseren
//

public class Supermarkt {
    private String naam;
    private List<Product> producten;

    public Supermarkt(String naam) {
        this.naam = naam;
        this.producten = new ArrayList<>();;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public List<Product> getProducten() {
        return producten;
    }

    public void setProducten(List<Product> producten) {
        this.producten = producten;
    }

    public void addProduct(Product product) {
        this.producten.add(product);
    }

    public void getAllProducten() {
        for (Product product : producten) {
            System.out.println(product.getNaam()+" Prijs: "+ product.getPrijs()+" Aantal: "+product.getAantal());
        }
    }
}

package Supermarkt;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Kassa {
    private List<Product> winkelwagen;
    private double bedrag;

    public Kassa(double bedrag) {
        this.bedrag = bedrag;
        this.winkelwagen = new ArrayList<>();
        ;
    }

    public List<Product> getWinkelwagen() {
        return winkelwagen;
    }

    public void setWinkelwagen(List<Product> winkelwagen) {
        winkelwagen = winkelwagen;
    }

    public double getBedrag() {
        for (Product product : winkelwagen) {
            bedrag += product.getPrijs();
        }
        System.out.println(bedrag);
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public void addProductToWinkelwagen(Product product) {
        this.winkelwagen.add(product);
    }

    public void deleteProductToWinkelwagen(Product product) {
        this.winkelwagen.remove(product);
    }

    public void getAllProductenOfWinkelwagen() {
        for (Product product : winkelwagen) {
            out.println(product.getNaam() + " Prijs: " + product.getPrijs() + " Aantal: " + product.getAantal());
        }
    }

    // Afreken
    public void Betaling(Klant klant) {
        double OverBudget = klant.getBudget() + Korting() - bedrag;
        if (OverBudget < 0){
            System.out.println("Beste "+klant.getNaam()+" uw bent helaas over uw budget gegaan");
            System.out.println("Verwijder producten om uw betaling te kunnen voltooien");
        } else {
            System.out.println(OverBudget);
        }
    }

    //korting

    public double Korting() {
        double totaalkorting = 0;
        int aantalkorting1 = 0;
        int aantalkorting2 = 0;
        for (Product product : winkelwagen) {


            if (product.getNaam().equals("Robijn")){
                aantalkorting1++;
            }
            if (aantalkorting1 == 2){
                // 31% korting bij aanschaf van 2x flacons
                if(product.getNaam().equals("Robijn")){
                    product.setPrijs(2.07);
                    totaalkorting += 1.86;
                }
            }

            if (product.getNaam().equals("Luiers")){
                aantalkorting2++;
            }
            if (aantalkorting2 == 4){
                // 31% korting bij aanschaf van 2x flacons
                if(product.getNaam().equals("Luiers")){
                    product.setPrijs(2.50);
                    totaalkorting = totaalkorting + 3.32;
                }
            }

            if (LocalDateTime.now().getDayOfWeek().getValue() == 3){
                if(product.getNaam().equals("Kwark")){
                    product.setPrijs(1);
                    totaalkorting = totaalkorting + 1;
                }
            }

        }
        out.println("Uw korting is: "+ totaalkorting);
        return totaalkorting;
    }
}
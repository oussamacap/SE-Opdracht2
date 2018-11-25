package Supermarkt;

// De Main class maken objecten aan en roepen we de methode op die nodig zijn om de supermarkt procces te beginnen
public class Main {
    public static void main(String[] args) {

        // hier maken we het supermarkt object aan
        Supermarkt SuperCap = new Supermarkt("Super Capgemini");

        //welkomsbericht
        System.out.println("Welkom bij online supermarkt "+SuperCap.getNaam());

        //Hier maken we de lijst van producten die gebruikt gaan worden voor de super
        Product Product1 = new Huisartikel("Robijn",3.00,0,1);
        Product Product2 = new Voedsel("Brinta",2.50,0,1);
        Product Product3 = new Voedsel("Chinese Groenten",5.00,0,1);
        Product Product4 = new Voedsel("Kwark",2.00,0,1);
        Product Product5 = new Huisartikel("Luiers",3.33,0,1);

        //hier wordt toegevoegd aan de winkel
        SuperCap.addProduct(Product1);
        SuperCap.addProduct(Product2);
        SuperCap.addProduct(Product3);
        SuperCap.addProduct(Product4);
        SuperCap.addProduct(Product5);

        System.out.println("Hieronder de producten van "+SuperCap.getNaam());

        // haalt alle producten op van
        SuperCap.getAllProducten();

        Klant klant1 = new Klant("Jeroen",15.00);

        System.out.println("Beste "+klant1.getNaam()+" Welkom bij de "+ SuperCap.getNaam());

        Kassa kassa1 = new Kassa(0.00);

        kassa1.addProductToWinkelwagen(Product1);
        kassa1.addProductToWinkelwagen(Product1);
        kassa1.addProductToWinkelwagen(Product2);
        kassa1.addProductToWinkelwagen(Product3);
        kassa1.deleteProductToWinkelwagen(Product3);
        kassa1.getAllProductenOfWinkelwagen();
        kassa1.getBedrag();
        System.out.println(klant1.getBudget());
        kassa1.Betaling(klant1);

    }
}

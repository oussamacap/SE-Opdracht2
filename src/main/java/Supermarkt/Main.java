package Supermarkt;

import java.util.Scanner;

// De Main class maken objecten aan en roepen we de methode op die nodig zijn om de supermarkt procces te beginnen
public class Main {
    public static void main(String[] args) {

        // hier maken we het supermarkt object aan
        Supermarkt SuperCap = new Supermarkt("Super Capgemini");

        //welkomsbericht
        System.out.println("Welkom bij online supermarkt " + SuperCap.getNaam());

        //Hier maken we de lijst van producten die gebruikt gaan worden voor de super
        Product Product1 = new Huisartikel("Robijn", 3.00, 0, 1);
        Product Product2 = new Voedsel("Brinta", 2.50, 0, 1);
        Product Product3 = new Voedsel("Chinese Groenten", 5.00, 0, 1);
        Product Product4 = new Voedsel("Kwark", 2.00, 0, 1);
        Product Product5 = new Huisartikel("Luiers", 3.33, 0, 1);

        //hier wordt toegevoegd aan de winkel doormiddel van de methode add product
        SuperCap.addProduct(Product1);
        SuperCap.addProduct(Product2);
        SuperCap.addProduct(Product3);
        SuperCap.addProduct(Product4);
        SuperCap.addProduct(Product5);

        System.out.println("Hieronder de producten van " + SuperCap.getNaam());

        // haalt alle producten op die aan de supermarkt zijn toegevoegd
        SuperCap.getAllProducten();

        //hier printer done
        Klant klant1 = new Klant("Jeroen", 150.00);
        System.out.println("Beste " + klant1.getNaam() + " Welkom bij de " + SuperCap.getNaam() + ", uw budget is " + klant1.getBudget());


        //kassa object aangemaakt die methode heeft om product toe te voegen te verwijderen
        Kassa kassa1 = new Kassa(0.00);

        UitlegTekst();

        Scanner sc = new Scanner(System.in);
        System.out.print("Vul hierin: ");
        String input = sc.nextLine();
        boolean again = true;
        InteractieSupermarkt(Product1, Product2, Product3, Product4, Product5, klant1, kassa1, sc, input, again);
    }

    private static void InteractieSupermarkt(Product product1, Product product2, Product product3, Product product4, Product product5, Klant klant1, Kassa kassa1, Scanner sc, String input, boolean again) {
        while (again) {
            switch (input) {
                case "0":
                    kassa1.addProductToWinkelwagen(product1);
                    System.out.println(product1.getNaam() + " is toegevoegd aan de winkelwagen");
                    System.out.print("Vul hierin:");
                    break;
                case "1":
                    kassa1.addProductToWinkelwagen(product2);
                    System.out.println(product2.getNaam() + " is toegevoegd aan de winkelwagen");
                    System.out.print("Vul hierin:");
                    break;
                case "2":
                    kassa1.addProductToWinkelwagen(product3);
                    System.out.println(product3.getNaam() + " is toegevoegd aan de winkelwagen");
                    System.out.print("Vul hierin:");
                    break;
                case "3":
                    kassa1.addProductToWinkelwagen(product4);
                    System.out.println(product4.getNaam() + " is toegevoegd aan de winkelwagen");
                    System.out.print("Vul hierin:");
                    break;
                    case "4":
                    kassa1.addProductToWinkelwagen(product5);
                    System.out.println(product5.getNaam() + " is toegevoegd aan de winkelwagen");
                    System.out.print("Vul hierin:");
                    break;
                case "00":
                    kassa1.deleteProductToWinkelwagen(product1);
                    System.out.println(product1.getNaam()+" is verwijderd uit de winkelwagen");
                    System.out.print("Vul hierin:");
                    break;
                case "01":
                    kassa1.deleteProductToWinkelwagen(product2);
                    System.out.println(product2.getNaam()+" is verwijderd uit de winkelwagen");
                    System.out.print("Vul hierin:");
                    break;
                case "02":
                    kassa1.deleteProductToWinkelwagen(product3);
                    System.out.println(product3.getNaam()+" is verwijderd uit de winkelwagen");
                    System.out.print("Vul hierin:");

                    break;
                case "03":
                    kassa1.deleteProductToWinkelwagen(product4);
                    System.out.println(product4.getNaam()+" is verwijderd uit de winkelwagen");
                    System.out.print("Vul hierin:");
                    break;
                case "04":
                    kassa1.deleteProductToWinkelwagen(product5);
                    System.out.println(product5.getNaam()+" is verwijderd uit de winkelwagen");
                    System.out.print("Vul hierin:");
                    break;
                    case "winkelwagen":
                        kassa1.getAllProductenOfWinkelwagen();
                        System.out.print("Vul hierin:");
                        break;
                case "betalen":
                    System.out.println("Uw bedrag: "+kassa1.getBedrag());
                    kassa1.Betaling(klant1);
                    System.out.println("Dank voor je komst "+klant1.getNaam());
                    System.out.println("type einde om af te sluiten");
                    System.out.print("Vul hierin:");
                    again = false;
                    break;
                case "korting":
                    kassa1.Korting();
                    break;
                    case "einde":
                    again = false;
                    break;
                default:
                    System.out.println("type niet correct");
                    System.out.print("Vul hierin:");
                    again = true;
                    break;
            }
            input = sc.nextLine();
        }
    }

    private static void UitlegTekst() {
        System.out.println("voer uw productnummer van het product in om het toe te voegen aan uw winkelwagen.");
        System.out.println("Om een product te verwijdeneren dient uw productnummer in te voeren met daarvoor het getal 0");
        System.out.println("om uw winkelwagen producten in te zien dient uw winkelwagen in te typen");
        System.out.println("om uw te betalen typte uw betalen");
    }
}

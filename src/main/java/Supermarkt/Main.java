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
        Klant klant1 = new Klant("Jeroen", 15.00);

        System.out.println("Beste " + klant1.getNaam() + " Welkom bij de " + SuperCap.getNaam() + ", uw budget is " + klant1.getBudget());


        //kassa object aangemaakt die methode heeft om product toe te voegen te verwijderen

        Kassa kassa1 = new Kassa(0.00);

        System.out.println("voer uw productnummer van het product in om het toe te voegen aan uw winkelwagen.");
        System.out.println("Om een product te verwijdeneren dient uw productnummer in te voeren met daarvoor het getal 0");
        System.out.println("om uw winkelwagen producten in te zien dient uw winkelwagen in te typen");
        System.out.println("om uw winkelwagen producten in te zien dient uw winkelwagen in te typen");

        Scanner sc = new Scanner(System.in);
        System.out.print("Vul hierin: ");
        String input = sc.nextLine();
        boolean again = true;
        while (again) {
            switch (input) {
                case "0":
                    kassa1.addProductToWinkelwagen(Product1);
                    System.out.println(Product1.getNaam() + " is toegevoegd aan de winkelwagen");
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                    break;

                case "1":
                    kassa1.addProductToWinkelwagen(Product2);
                    System.out.println(Product2.getNaam() + " is toegevoegd aan de winkelwagen");
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                    break;
                case "2":
                    kassa1.addProductToWinkelwagen(Product3);
                    System.out.println(Product3.getNaam() + " is toegevoegd aan de winkelwagen");
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                    break;
                case "3":
                    kassa1.addProductToWinkelwagen(Product4);
                    System.out.println(Product4.getNaam() + " is toegevoegd aan de winkelwagen");
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                    break;
                    case "4":
                    kassa1.addProductToWinkelwagen(Product5);
                    System.out.println(Product5.getNaam() + " is toegevoegd aan de winkelwagen");
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                    break;
                case "00":
                    kassa1.deleteProductToWinkelwagen(Product1);
                    System.out.println(Product1.getNaam()+" is verwijderd uit de winkelwagen");
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                case "01":
                    kassa1.deleteProductToWinkelwagen(Product2);
                    System.out.println(Product2.getNaam()+" is verwijderd uit de winkelwagen");
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                case "02":
                    kassa1.deleteProductToWinkelwagen(Product3);
                    System.out.println(Product3.getNaam()+" is verwijderd uit de winkelwagen");
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                case "03":
                    kassa1.deleteProductToWinkelwagen(Product4);
                    System.out.println(Product4.getNaam()+" is verwijderd uit de winkelwagen");
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                case "04":
                    kassa1.deleteProductToWinkelwagen(Product5);
                    System.out.println(Product5.getNaam()+" is verwijderd uit de winkelwagen");
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                    case "winkelwagen":
                        kassa1.getAllProductenOfWinkelwagen();
                        System.out.print("Vul hierin:");
                        input = sc.nextLine();
                case "bedrag":
                    System.out.println("uw huidige bedrag: "+kassa1.getBedrag());
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                case "budget":
                    System.out.println("uw budget:"+ klant1.getBudget());
                    System.out.print("Vul hierin:");
                    input = sc.nextLine();
                case "betalen":
                    kassa1.getBedrag();
                    kassa1.Betaling(klant1);
                    System.out.println("Dank voor je komst "+klant1.getNaam());
                default:
                    again = true;
                    break;
            }
        }
    }
}

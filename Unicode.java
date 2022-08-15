import java.util.Scanner;

public class Unicode {


    public static void main(String[] args) {

        lista();
        end();
        kebab();
        jablko();
        gruszka();
        jajko();
        bigmac();
        kajzerka();
        snickers();
        jogurt();


    }

    public static void lista() {

        System.out.println("Zaczynamy wybierz liczbe przy produkcie i nacisnij ENTER:");
        String a = "(1 = Kebab)";
        String b = "(2 = Jablko)";
        String c = "(3 = Gruszka)";
        String d = "(4 = Jajko)";
        String e = "(5 = Big Mac Hamburger)";
        String f = "(6 = Bulka kajzerka)";
        String g = "(7 = Snickers)";
        String h = "(8 = Jogurt naturalny 100 g)";


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                kebab();
                break;
            case 2:
                jablko();
                break;
            case 3:
                gruszka();
                break;
            case 4:
                jajko();
                break;
            case 5:
                bigmac();
                break;
            case 6:
                kajzerka();
                break;
            case 7:
                snickers();
                break;
            case 8:
                jogurt();
                break;

        }
    }


    public static void kebab() {
        int akcal;
        akcal = 550;
        System.out.println("Czy zjadles/as wiecej niz jednego kebaba: TAK (wcisnij T) / NIE (wcisnij N)");
        Scanner lineScanner1 = new Scanner(System.in);
        String unit1 = lineScanner1.nextLine();
        switch (unit1) {
            case "T":
                System.out.println("Podaj ilosc sztuk:");
                Scanner scanner2 = new Scanner(System.in);
                int ab = scanner2.nextInt();
                double produkt = ab * akcal;

                System.out.println("Wybrales/as kebaba. Jeden kebab ma 550 kcal" + " " + "Twoja ilosc kalorii to" + " " + produkt + " " + "spozyta z tego produktu dzisiaj");
                double mprodukt = 2500 - (ab * akcal);

                while (mprodukt >= 0) {
                    System.out.println("Dzienne zapotrzabowanie to 2500 kalorii dla doroslej osoby, pozostalo jeszcze" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    String skebab = lineScanner1.nextLine();

                    switch (skebab) {
                        case "T":
                            lista();
                        case "N":
                            System.out.println("OK zapraszam ponownie");
                            lista();

                    }

                }


                while (mprodukt < 0) {
                    System.out.println("Uwaga! Twoj bilans kaloryczny dzisiaj zostal przekroczony o" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    java.util.Scanner scanner = new java.util.Scanner(System.in);

                    String more = scanner.next();

                    while (more.equals("T") || more.equals("t")) {
                        lista();
                        break;
                    }
                    while (!more.equals("N") || !more.equals("n")) ;
                    {
                        System.out.println("OK zapraszam ponownie");
                    }
                    break;
                }
                break;
            case "N":
                System.out.println("Nie jestes glodny/a?");
                lista();
                break;

            default:
                System.out.println("Nieobslugiwana jednostka, uzyj duzych liter T / N");
                kebab();
                break;
        }
    }

    public static void jablko() {
        int bkcal;
        bkcal = 57;

        System.out.println("Czy zjadles/as wiecej niz jedno jablko: TAK (wcisnij T) / NIE (wcisnij N)");
        Scanner lineScanner1 = new Scanner(System.in);
        String unit1 = lineScanner1.nextLine();
        switch (unit1) {
            case "T":
                System.out.println("Podaj ilosc sztuk:");
                Scanner scanner2 = new Scanner(System.in);
                int ab = scanner2.nextInt();
                double produkt = ab * bkcal;

                System.out.println("Jedno jablko ma 57 kcal" + " " + "Twoja ilosc kalorii to" + " " + produkt + " " + "spozyta z tego produktu dzisiaj");
                double mprodukt = 2500 - (ab * bkcal);

                while (mprodukt >= 0) {
                    System.out.println("Dzienne zapotrzabowanie to 2500 kalorii dla doroslej osoby, pozostalo jeszcze" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    String sjablko = lineScanner1.nextLine();

                    switch (sjablko) {
                        case "T":
                            lista();
                        case "N":
                            System.out.println("OK zapraszam ponownie");
                            lista();

                    }
                }

                while (mprodukt < 0) {
                    System.out.println("Uwaga! Twoj bilans kaloryczny dzisiaj zostal przekroczony o" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    java.util.Scanner scanner = new java.util.Scanner(System.in);

                    String more = scanner.next();
                    while (more.equals("T") || more.equals("t")) {
                        lista();
                        break;
                    }
                    while (!more.equals("N") || !more.equals("n")) ;
                    {
                        System.out.println("OK zapraszam ponownie");
                    }
                    break;
                }
                break;
            case "N":
                System.out.println("Nie jestes glodny/a?");
                lista();
                break;

            default:
                System.out.println("Nieobslugiwana jednostka, uzyj duzych liter T / N");
                jablko();
                break;
        }
    }

    public static void gruszka() {

        int ckcal;
        ckcal = 58;
        System.out.println("Czy zjadles/as wiecej niz jedna gruszke: TAK (wcisnij T) / NIE (wcisnij N)");
        Scanner lineScanner1 = new Scanner(System.in);
        String unit1 = lineScanner1.nextLine();
        switch (unit1) {
            case "T":
                System.out.println("Podaj ilosc sztuk:");
                Scanner scanner2 = new Scanner(System.in);
                int ab = scanner2.nextInt();
                double produkt = ab * ckcal;

                System.out.println("Jedna gruszka ma 58 kcal" + " " + "Twoja ilosc kalorii to" + " " + produkt + " " + "spozyta z tego produktu dzisiaj");
                double mprodukt = 2500 - (ab * ckcal);

                while (mprodukt >= 0) {
                    System.out.println("Dzienne zapotrzabowanie to 2500 kalorii dla doroslej osoby, pozostalo jeszcze" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    String sGruszka = lineScanner1.nextLine();

                    switch (sGruszka) {
                        case "T":
                            lista();
                        case "N":
                            System.out.println("OK zapraszam ponownie");
                            lista();


                    }
                    while (mprodukt < 0) {
                        System.out.println("Uwaga! Twoj bilans kaloryczny dzisiaj zostal przekroczony o" + " " + mprodukt + " " + "kalorii");
                        System.out.println("Wjechalo cos jeszcze? T/N");
                        java.util.Scanner scanner = new java.util.Scanner(System.in);

                        String more = scanner.next();

                        while (more.equals("T") || more.equals("t")) {
                            lista();
                            break;
                        }
                        while (!more.equals("N") || !more.equals("n")) ;
                        {
                            System.out.println("OK zapraszam ponownie");
                        }
                        break;
                    }
                    break;
                }
            case "N":
                System.out.println("Nie jestes glodny/a?");
                lista();
                break;

            default:
                System.out.println("Nieobslugiwana jednostka, uzyj duzych liter T / N");
                gruszka();
                break;
        }
    }

    public static void jajko() {

        int dkcal;
        dkcal = 145;
        System.out.println("Czy zjadles/as wiecej niz jedno jajko: TAK (wcisnij T) / NIE (wcisnij N)");
        Scanner lineScanner1 = new Scanner(System.in);
        String unit1 = lineScanner1.nextLine();
        switch (unit1) {
            case "T":
                System.out.println("Podaj ilosc sztuk:");
                Scanner scanner2 = new Scanner(System.in);
                int ab = scanner2.nextInt();
                double produkt = ab * dkcal;

                System.out.println("Jedno jajko ma 145 kcal" + " " + "Twoja ilosc kalorii to" + " " + produkt + " " + "spozyta z tego produktu dzisiaj");
                double mprodukt = 2500 - (ab * dkcal);

                while (mprodukt >= 0) {
                    System.out.println("Dzienne zapotrzabowanie to 2500 kalorii dla doroslej osoby, pozostalo jeszcze" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");

                    String sjajko = lineScanner1.nextLine();

                    switch (sjajko) {
                        case "T":
                            lista();
                        case "N":
                            System.out.println("OK zapraszam ponownie");
                            lista();
                    }
                }

                while (mprodukt < 0) {
                    System.out.println("Uwaga! Twoj bilans kaloryczny dzisiaj zostal przekroczony o" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    java.util.Scanner scanner = new java.util.Scanner(System.in);

                    String more = scanner.next();

                    while (more.equals("T") || more.equals("t")) {
                        lista();
                        break;
                    }
                    while (!more.equals("N") || !more.equals("n")) ;
                    {
                        System.out.println("OK zapraszam ponownie");
                    }
                    break;
                }
                break;
            case "N":
                System.out.println("Nie jestes glodny/a?");
                lista();
                break;

            default:
                System.out.println("Nieobsługiwana jednostka, uzyj duzych liter T / N");
                jajko();
                break;
        }
    }

    public static void bigmac() {
        int ekcal;
        ekcal = 449;

        System.out.println("Wybrano Big Mac'a, jedno Big Mac ma 449 kalorii");
        System.out.println("Czy zjadles/as wiecej niz jednego Big Mac'a: TAK (wcisnij T) / NIE (wcisnij N)");
        Scanner lineScanner1 = new Scanner(System.in);
        String unit1 = lineScanner1.nextLine();
        switch (unit1) {
            case "T":

                System.out.println("Podaj ilosc sztuk:");
                Scanner scanner2 = new Scanner(System.in);
                int ab = scanner2.nextInt();
                double produkt = ab * ekcal;

                System.out.println("Jeden Big Mac ma 449 kcal" + " " + "Twoja ilosc kalorii to" + " " + produkt + " " + "spozyta z tego produktu dzisiaj");
                double mprodukt = 2500 - (ab * ekcal);

                while (mprodukt >= 0) {
                    System.out.println("Dzienne zapotrzabowanie to 2500 kalorii dla doroslej osoby, pozostalo jeszcze" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");


                    String sbigmack = lineScanner1.nextLine();

                    switch (sbigmack) {
                        case "T":
                            lista();
                        case "N":
                            end();
                            break;
                    }
                }

                while (mprodukt < 0) {
                    System.out.println("Uwaga! Twoj bilans kaloryczny dzisiaj zostal przekroczony o" + " " + mprodukt + " " + "kalorii");

                    System.out.println("Wjechalo cos jeszcze? T/N");
                    java.util.Scanner scanner = new java.util.Scanner(System.in);

                    String more = scanner.next();


                    while (more.equals("T") || more.equals("t")) {
                        lista();
                        break;
                    }
                    while (!more.equals("T") || !more.equals("t")) ;
                    {
                        System.out.println("OK zapraszam ponownie");
                    }
                    break;
                }
                break;

            case "N":
                System.out.println("Nie jestes glodny/a?");
                lista();
                break;

            default:
                System.out.println("Nieobsługiwana jednostka, uzyj duzych liter T / N");
                bigmac();
                break;
        }
    }

    public static void kajzerka() {

        int fkcal;
        fkcal = 165;

        System.out.println("Wybrano bulke kajzerke, jedna kajzerka ma 165 kalorii");
        System.out.println("Czy zjadles/as wiecej niz jedna bulke: TAK (wcisnij T) / NIE (wcisnij N)");
        Scanner lineScanner1 = new Scanner(System.in);
        String unit1 = lineScanner1.nextLine();
        switch (unit1) {
            case "T":
                System.out.println("Podaj ilosc sztuk:");
                Scanner scanner2 = new Scanner(System.in);
                int ab = scanner2.nextInt();
                double produkt = ab * fkcal;

                System.out.println("Jedna bulka kajzerka ma 165 kcal" + " " + "Twoja ilosc kalorii to" + " " + produkt + " " + "spozyta z tego produktu dzisiaj");
                double mprodukt = 2500 - (ab * fkcal);

                while (mprodukt >= 0) {
                    System.out.println("Dzienne zapotrzabowanie to 2500 kalorii dla doroslej osoby, pozostalo jeszcze" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    String skajzerka = lineScanner1.nextLine();

                    switch (skajzerka) {
                        case "T":
                            lista();
                        case "N":
                            System.out.println("OK zapraszam ponownie");
                            lista();

                    }
                }

                while (mprodukt < 0) {
                    System.out.println("Uwaga! Twoj bilans kaloryczny dzisiaj zostal przekroczony o" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    java.util.Scanner scanner = new java.util.Scanner(System.in);

                    String more = scanner.next();

                    while (more.equals("T") || more.equals("t")) {
                        lista();
                        break;
                    }
                    while (!more.equals("N") || !more.equals("n")) ;
                    {
                        System.out.println("OK zapraszam ponownie");
                    }
                    break;
                }
                break;
            case "N":
                System.out.println("Nie jestes glodny/a?");
                lista();
                break;

            default:
                System.out.println("Nieobsługiwana jednostka, uzyj duzych liter T / N");
                kajzerka();
                break;
        }
    }

    public static void snickers() {

        int gkcal;
        gkcal = 243;


        System.out.println("Czy zjadles wiecej niz jeden batonik: TAK (wcisnij T) / NIE (wcisnij N)");
        Scanner lineScanner1 = new Scanner(System.in);
        String unit1 = lineScanner1.nextLine();
        switch (unit1) {
            case "T":
                System.out.println("Podaj ilosc sztuk:");
                Scanner scanner2 = new Scanner(System.in);
                int ab = scanner2.nextInt();
                double produkt = ab * gkcal;

                System.out.println("Jeden Snickers ma 243 kcal" + " " + "Twoja ilosc kalorii to" + " " + produkt + " " + "spozyta z tego produktu dzisiaj");
                double mprodukt = 2500 - (ab * gkcal);

                while (mprodukt >= 0) {
                    System.out.println("Dzienne zapotrzabowanie to 2500 kalorii dla doroslej osoby, pozostalo jeszcze" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    String ssnickers = lineScanner1.nextLine();

                    switch (ssnickers) {
                        case "T":
                            lista();
                        case "N":
                            System.out.println("Nie jestes glodny/a?");
                            lista();

                    }
                }

                while (mprodukt < 0) {
                    System.out.println("Uwaga! Twoj bilans kaloryczny dzisiaj zostal przekroczony o" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    java.util.Scanner scanner = new java.util.Scanner(System.in);

                    String more = scanner.next();
                    while (more.equals("T") || more.equals("t")) {
                        lista();
                        break;
                    }
                    while (!more.equals("N") || !more.equals("n")) ;
                    {
                        System.out.println("OK zapraszam ponownie");
                    }
                    break;
                }
                break;
            case "N":
                System.out.println("Nie jestes glodny/a?");
                lista();
                break;

            default:
                System.out.println("Nieobslugiwana jednostka, uzyj duzych liter T / N");
                snickers();
                break;
        }
    }

    public static void jogurt() {

        int hkcal;
        hkcal = 60;
        System.out.println("Czy zjadles wiecej niz jeden kubek jogurtu: (wcisnij T) / NIE (wcisnij N)");
        Scanner lineScanner1 = new Scanner(System.in);
        String unit1 = lineScanner1.nextLine();
        switch (unit1) {
            case "T":
                System.out.println("Podaj ilosc sztuk:");
                Scanner scanner2 = new Scanner(System.in);
                int ab = scanner2.nextInt();
                double produkt = ab * hkcal;

                System.out.println("Jeden kubek jogurtu 100 g ma 60 kcal" + " " + "Twoja ilosc kalorii to" + " " + produkt + " " + "spozyta z tego produktu dzisiaj");
                double mprodukt = 2500 - (ab * hkcal);

                while (mprodukt >= 0) {
                    System.out.println("Dzienne zapotrzabowanie to 2500 kalorii dla doroslej osoby, pozostalo jeszcze" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    String sjogurt = lineScanner1.nextLine();

                    switch (sjogurt) {
                        case "T":
                            lista();
                        case "N":
                            end();
                            lista();
                    }
                }
                while (mprodukt < 0) {
                    System.out.println("Uwaga! Twoj bilans kaloryczny dzisiaj zostal przekroczony o" + " " + mprodukt + " " + "kalorii");
                    System.out.println("Wjechalo cos jeszcze? T/N");
                    java.util.Scanner scanner = new java.util.Scanner(System.in);

                    String more = scanner.next();

                    while (more.equals("T") || more.equals("t")) {
                        lista();
                        break;
                    }
                    while (!more.equals("N") || !more.equals("n")) ;
                    {
                        end();
                    }
                    break;
                }
                break;
            case "N":
                System.out.println("Nie jestes glodny/a?");
                lista();
                break;

            default:
                System.out.println("Nieobslugiwana jednostka, uzyj duzych liter T / N");
                jogurt();
                break;
        }
    }


    public static void end() {
        System.out.println("OK zapraszam ponownie");

    }
}

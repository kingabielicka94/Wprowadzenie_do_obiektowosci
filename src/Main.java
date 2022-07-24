import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Car audi = new Car("Red", 5, "A4", false);
        System.out.println(audi.getAutomaticGearbox());
        audi.setAutomaticGearbox(true);
        System.out.println(audi.getAutomaticGearbox());

        Car suzuki = new Car("Black", 3, "1500", false);
        System.out.println(suzuki.getColour());
        suzuki.setColour("White");
        System.out.println(suzuki.getColour());

        Car bmw = new Car("Blue", 5, "M3", true);
        System.out.println(bmw.getDoorsAmount());
        audi.setDoorsAmount(3);
        System.out.println(bmw.getDoorsAmount());

        Car renault = new Car("Silver", 5, "Clio", false);
        System.out.println(renault.getBrand());
        suzuki.setBrand("GT");
        System.out.println(renault.getBrand());

        int a;
        int b;
        a = 10;
        b = 2;
        int c;
        c = a - b;
        System.out.println(c);

        Kalkulator calc = new Kalkulator();
        calc.add(5,2);
        System.out.println(calc.add(5,2));



        Kalkulator calc = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać pierwszą liczbę");
        int firstVariable = scanner.nextInt();
        System.out.println("Proszę podać drugą liczbę");
        int fsecondVariable = scanner.nextInt();
        System.out.println("Twój wynik to " + calc.add(firstVariable, fsecondVariable));


        Kalkulator calc = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać pierwszą liczbę");
        int firstVariable = scanner.nextInt();
        System.out.println("Proszę podać drugą liczbę");
        int fsecondVariable = scanner.nextInt();
        System.out.println("Twój wynik to " + calc.sub(firstVariable, fsecondVariable));

 */

        Kalkulator liczydlo = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać pierwszą liczbę");
        int firstVariable = scanner.nextInt();
        System.out.println("Proszę podać drugą liczbę");
        int fsecondVariable = scanner.nextInt();
        System.out.println("Twój wynik to " + liczydlo.multiply(firstVariable, fsecondVariable));
    }

}

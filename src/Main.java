public class Main {
    public static void main(String[] args) {

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

    }
}

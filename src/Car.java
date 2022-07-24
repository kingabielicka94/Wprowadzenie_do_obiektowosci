public class Car {
    private String colour;
    private int doorsAmount;
    private String brand;
    private boolean automaticGearbox;
    // boolean odpowiada za true or false

    public Car(String colour, int doorsAmount, String brand, boolean automaticGearbox) {
        this.colour = colour;
        this.doorsAmount = doorsAmount;
        this.brand = brand;
        this.automaticGearbox = automaticGearbox;
// konstruktor 4-parametrowy powyżej; nic nie zwraca, nic nie przyjmuje; to w nawiasie to parametry, a ciało metody znajduje się w wąsach
    }

    public void setAutomaticGearbox(boolean automaticGearbox) {
        this.automaticGearbox = automaticGearbox;
    }

    public boolean getAutomaticGearbox() {
        return automaticGearbox;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setDoorsAmount(int doorsAmount) {
        this.doorsAmount = doorsAmount;
    }

    public int getDoorsAmount() {
        return doorsAmount;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

}
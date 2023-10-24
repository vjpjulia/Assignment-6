public class Main {
    public static void main(String[] args) {
        Laptop laptop = new MyLaptop();
        Refrigerator refrigerator = new MyRefrigerator();
        SmartphoneCharger charger = new MySmartphoneCharger();

        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(charger);

        System.out.println("Plugging in laptop:");
        laptopAdapter.plugIn();

        System.out.println("Plugging in refrigerator:");
        refrigeratorAdapter.plugIn();

        System.out.println("Plugging in smartphone charger:");
        smartphoneAdapter.plugIn();
    }
}
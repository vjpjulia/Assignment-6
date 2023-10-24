interface Laptop {
    void charge();
}

class MyLaptop implements Laptop {
    @Override
    public void charge() {
        System.out.println("Laptop is charging.");
    }
}
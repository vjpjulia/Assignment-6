interface Refrigerator {
    void startCooling();
}

class MyRefrigerator implements Refrigerator {
    @Override
    public void startCooling() {
        System.out.println("Refrigerator is cooling.");
    }
}

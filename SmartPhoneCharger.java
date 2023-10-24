interface SmartphoneCharger {
    void chargePhone();
}

class MySmartphoneCharger implements SmartphoneCharger {
    @Override
    public void chargePhone() {
        System.out.println("Smartphone is charging.");
    }
}
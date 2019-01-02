class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;
    String brand;
    String model;

    public Car(String license, Account driver, String brand, String model){
        this.license = license;
        this.driver = driver;
        this.brand = brand;
        this.model = model;
    }

    void printDataCar(){
        System.out.println("Licencia: " + license + " Brand: "+ brand +" Model: " + model);
    }
    
}
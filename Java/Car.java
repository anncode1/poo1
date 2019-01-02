class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;
    String brand;
    String model;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("Licencia: " + license + " Driver: " + driver.name);
    }
    
}
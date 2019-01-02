class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo"); 
        //Autos https://noticias.autocosmos.com.mx/2018/02/09/los-10-mejores-autos-para-uber
        //Car carSonic = new Car();
        Account driver = new Account("Andres", "AND123");
        Car carSonic = new Car("AMQ531", driver);
        carSonic.passenger = 4;
        carSonic.printDataCar();
    }
}
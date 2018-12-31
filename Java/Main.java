class Main {
    public static void main(String[] args) {
       System.out.println("Hola Mundo"); 
       UberX uberXVento = new UberX();
       uberXVento.model = 2017;
       uberXVento.door = 4;
       uberXVento.passenger = 4;
       uberXVento.brand = "Vento";

       UberX uberXSpark = new UberX();
       uberXSpark.brand = "Spark";
       uberXSpark.model = 2018;
       uberXSpark.door = 4;
       uberXSpark.passenger = 3;

       System.out.println("UberX Brand: " + uberXSpark.brand);

    }
}
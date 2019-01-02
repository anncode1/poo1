//this hace referencia a sí mismo
//Constructor implisito en la clase
function Car(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
    
}

Car.prototype.printDataCar = function () {
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
    console.log(this.passengers);
}

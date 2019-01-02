from car import Car
from route import Route

if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car()
    car.brand = "JEtta"
    car.model = "Vento"
    car.lic = "AMS567"
    print("Car: {}".format(car.brand))
    print(vars(car))

    r = Route()
    r.init = [12.00,45.04]
    print("r[0]: {}".format(r.init[1]))
    
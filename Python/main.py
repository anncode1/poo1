from car import Car
from route import Route

if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car()
    car.driver = "Adnrés"
    print("Car: {}".format(car.driver))

    r = Route()
    r.init = [12.00,45.04]
    print("r[0]: {}".format(r.init[1]))
    
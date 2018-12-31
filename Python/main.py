from uberx import UberX

if __name__ == "__main__":
    print("Hola Mundo")
    uberXVento = UberX()
    uberXVento.model = 2017
    uberXVento.passengers = 4
    uberXVento.door = 4
    uberXVento.brand = "Vento"

    print("UberX Brand: {}".format(uberXVento.brand))
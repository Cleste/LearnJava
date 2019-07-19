package ch7;
/*Для того чтобы продемонстрировать возможности наследования,
расширим класс Vehicle, созданный в главе 4. Напомним, что
класс Vehicle инкапсулирует данные о транспортных средствах и,
в частности, сведения о количестве пассажиров, объеме топливного бака и расходе топлива.
Воспользуемся классом Vehicle в качестве заготовки для создания более специализированных классов.
Например, транспортным средством, помимо прочих, является грузовик.
Одной из важных характеристик грузовика является его грузоподъемность.
Поэтому для создания класса Truck можно расширить класс Vehicle, добавив переменную экземпляра,
хранящую сведения о допустимом весе перевозимого груза. */

public class TruckDemo {
    public static void main(String[] args) {
        Truck pickup = new Truck(2, 200, 7, 44000);
        offRoad semi = new offRoad(3, 28, 15, 15);
        semi.showInfo();
        pickup.showInfo();


    }
}

class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    private int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }

    void showInfo() {
        System.out.println("Can transfer " + passengers +
                " passengers to " + range() +
                " miles");

    }
}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    int getCargocap() {
        return cargocap;
    }

    void setCargocap(int c) {
        cargocap = c;
    }

    void showInfo() {
        System.out.println("Truck can transport " +
                cargocap + " pounds.");
        super.showInfo();
        System.out.println();
    }
}

class offRoad extends Vehicle {
    private int groundClearance;

    offRoad(int p, int f, int m, int gC) {
        super(p, f, m);
        groundClearance = gC;
    }

    public void showInfo() {
        System.out.println("Offroad have a " +
                groundClearance + " inches.");
        super.showInfo();
        System.out.println();
    }

    int getGroudClearance() {
        return groundClearance;
    }

    void setGroudClearance(int gC) {
        groundClearance = gC;
    }

}
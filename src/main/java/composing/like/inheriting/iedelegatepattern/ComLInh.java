package composing.like.inheriting.iedelegatepattern;

public class ComLInh {

    public static void main(String[] args) {

        IVehicle vObj = new Vehicle(2.3);
        IVehicle sObj = new SuperCar(vObj);
        vObj.makeEngineSound();
        sObj.makeEngineSound();


    }
}

interface IVehicle {

    void accelerate();

    void makeEngineSound();
}

class Vehicle implements IVehicle {
    double speed;

    Vehicle(Double speed) {
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        this.speed = this.speed * 3;
    }

    @Override
    public void makeEngineSound() {
        System.out.println("Voom" + this.speed);
    }
}

class SuperCar implements IVehicle {

    IVehicle vehicle;

    SuperCar(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void accelerate() {
        vehicle.accelerate();
    }

    @Override
    public void makeEngineSound() {
        vehicle.makeEngineSound();
    }
}


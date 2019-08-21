package ch12;

enum Transport{
    CAR(65), TRUCK(60), AIRPLANE(600), TRAIN(70);

    private int speed;
    Transport(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Transport transportEnum;

        transportEnum = Transport.TRAIN;
        System.out.println(transportEnum + " speed: " + transportEnum.getSpeed());
        for (Transport t: Transport.values()){
            System.out.println(t + " position: " + t.ordinal());
        }
    }
}

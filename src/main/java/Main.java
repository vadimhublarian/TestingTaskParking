/**
 * Created by Vadim Khublarian on 8/12/21.
 */
public class Main {

    public static void main(String[] args) {
        Parking parking = new Parking(2,1);
        System.out.println(parking.park(CarType.PASSENGER_CAR));
        System.out.println(parking.park(CarType.TRUCK_CAR));
        System.out.println(parking.park(CarType.PASSENGER_CAR));
        System.out.println(parking.park(CarType.TRUCK_CAR));
    }

    public static String returnStringHi() {
        return "Hi";
    }
}


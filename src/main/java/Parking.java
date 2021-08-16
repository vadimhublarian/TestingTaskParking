/**
 * Created by Vadim Khublarian on 8/16/21.
 */

/*
На парковке имеется N мест для легковых автомобилей и M мест для грузовых.
Легковой автомобиль может занять место грузового автомобиля при отсутствии мест для легковых.

Нужно реализовать метод park(тип автомобиля), который для очередного автомобиля вернет номер места или -1 при отсутствии мест
и метод unpark(номер места).
*/
public class Parking {
    /*
    int park(CarType);
    void unpark(int placeIndex);
    * */

    private int numberOfPassengerCarPlaces;
    private int numberOfTruckCarPlaces;

    private int indexOfFreePassengerCarPlace;
    private int indexOfFreeTruckCarPlace;

    //private int[] passengerCarPlaces = new int[this.numberOfPassengerCarPlaces];
    //private int[] truckCarPlaces = new int[this.numberOfTruckCarPlaces];

    public Parking(int numberOfPassengerCarPlaces, int numberOfTruckCarPlaces) throws NumberFormatException {
        if (numberOfPassengerCarPlaces > 0 && numberOfTruckCarPlaces > 0) {

            this.numberOfPassengerCarPlaces = numberOfPassengerCarPlaces;
            this.numberOfTruckCarPlaces = numberOfTruckCarPlaces;

            this.indexOfFreePassengerCarPlace = numberOfPassengerCarPlaces;
            this.indexOfFreeTruckCarPlace = numberOfTruckCarPlaces;

        } else
            throw new NumberFormatException("\"numberOfPassengerCarPlaces\" and \"numberOfTruckCarPlaces\" should have value greater than zero.");
    }

    public int park(CarType carType) {

        if (indexOfFreePassengerCarPlace < 0 && indexOfFreeTruckCarPlace < 0) {
            return -1;
        } else {
            if (carType.equals(CarType.TRUCK_CAR)) {
                if (indexOfFreeTruckCarPlace > 0) {
                    //truckCarPlaces[indexOfFreeTruckCarPlace] = 1;
                    int indexParkingPlace = indexOfFreeTruckCarPlace + indexOfFreePassengerCarPlace;
                    indexOfFreeTruckCarPlace--;
                    return indexParkingPlace;
                } else return -1;
            } else {
                // CarType.PASSENGER_CAR;
                if (indexOfFreePassengerCarPlace > 0) {
                    //passengerCarPlaces[indexOfFreePassengerCarPlace] = 1;
                    int indexParkingPlace = indexOfFreePassengerCarPlace + indexOfFreeTruckCarPlace;
                    indexOfFreePassengerCarPlace--;
                    return indexParkingPlace;
                } else {
                    if (indexOfFreeTruckCarPlace > 0) {
                        //truckCarPlaces[indexOfFreeTruckCarPlace] = 1;
                        int indexParkingPlace = indexOfFreePassengerCarPlace + indexOfFreeTruckCarPlace;
                        indexOfFreeTruckCarPlace--;
                       return indexParkingPlace;
                    } else return -1;
                }
            }
        }
    }
}


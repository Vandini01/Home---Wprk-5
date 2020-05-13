package MyCar;

import java.util.Scanner;
import java.util.logging.SocketHandler;

class Car {
    private Scanner scanner = new Scanner(System.in);

    private String DateOfProduction;
    private String NameCar;
    private String TypeMotor ;
    private int MaxSpeed ;
    private double AccelerationTo100 ;
    private byte MaxPassenger ;
    private byte PassengerInThisMoment;
    private int SpeedInThisMoment ;


    Car(){
        NameCar= (MessageForProgram.NameCar);
        DateOfProduction= (MessageForProgram.DateOfProduction);
        TypeMotor= (MessageForProgram.TypeMotor);
        MaxSpeed =310;
        AccelerationTo100= 2.7;
        MaxPassenger= 4;
        PassengerInThisMoment = 1; // водитель
        SpeedInThisMoment= 56;
    }

    void ChangeSpeedInThisMoment() {
        System.out.println(MessageForProgram.ChangeSpeed+MaxSpeed);

        if (PassengerInThisMoment==0){
            System.out.println(MessageForProgram.ErrorNoDriver);
        }
        else {
            SpeedInThisMoment= InputSpeedOfCarInThisMoment();
        }
    }
    private int InputSpeedOfCarInThisMoment(){
        while (true) {
            String SpeedInThisMoment = scanner.nextLine();
            while (!SpeedInThisMoment.matches("^[0-9]?[0-9]?[0-9]$")) {
                System.out.println(MessageForProgram.ErrorInInputSpeedInThisMoment +MaxSpeed);
                SpeedInThisMoment = scanner.nextLine();
            }
            int speedInThisMoment = Integer.parseInt(SpeedInThisMoment);
            if (speedInThisMoment > MaxSpeed) {
                System.out.println(MessageForProgram.ErrorInInputSpeedInThisMoment +MaxSpeed);
            } else {
                return speedInThisMoment;
            }
        }

    }

    void PutOnePassengerInCar() {
        if(PassengerInThisMoment<MaxPassenger) {
            PassengerInThisMoment++;
        }
        else {System.out.println(MessageForProgram.ErrorMaximumReachedOfPassenger);}
    }

    void LandOnePassengerFromCar() {
        if(PassengerInThisMoment>0) {
            PassengerInThisMoment--;
        }
        else {System.out.println(MessageForProgram.ErrorMinimumReachedOfPassenger);}

    }

    void LandOllPassengersFrom(){
        PassengerInThisMoment = 0;
    }


    int CalculateMaximumSpeed(byte i, byte CarWheelSize){
        int MaxSpeedInThisMoment;

        MaxSpeedInThisMoment = (MaxSpeed * i)/100;

        if (PassengerInThisMoment == 0){
            MaxSpeedInThisMoment =0;
        }
        if (CarWheelSize == 0){
            MaxSpeedInThisMoment =0;
        }


        return MaxSpeedInThisMoment;
    }

    int SpeedInThisMoment(byte CarWheelSize){

        if (PassengerInThisMoment==0){
            SpeedInThisMoment =0;
        }
        if (CarWheelSize == 0){
            SpeedInThisMoment =0;
        }

        return SpeedInThisMoment;
    }

    void PrintObjectData(byte WorstWheel,byte CarWheelSize){

        System.out.println(MessageForProgram.MesssageNameCar+NameCar);
        System.out.println(MessageForProgram.MesssageTypeMotor+TypeMotor);
        System.out.println(MessageForProgram.MesssageAccelerationTo100+AccelerationTo100+MessageForProgram.Hours);
        System.out.println(MessageForProgram.MesssageMaxPassenger+MaxPassenger);
        System.out.println(MessageForProgram.MesssageMaxSpeed+MaxSpeed+MessageForProgram.Speed);
        System.out.println(MessageForProgram.MesssageMaxSpeedInThisMoment+CalculateMaximumSpeed(WorstWheel,CarWheelSize)+MessageForProgram.Speed);
        System.out.println(MessageForProgram.MesssagePassengerInThisMoment+PassengerInThisMoment);
        System.out.println(MessageForProgram.MesssageSpeedInThisMoment+SpeedInThisMoment(CarWheelSize)+MessageForProgram.Speed);
    }
}

package MyCar;
import java.util.Scanner;

class GeneralMenuCar {
    private CarDoor carDoor = new CarDoor();
    private CarWheel carWheel = new CarWheel();
    private Car car = new Car();
    private Scanner scanner = new Scanner(System.in);

    private boolean Choice() {
        String choice = scanner.nextLine();
        while (!choice.matches("^[0-1]$")) {
            System.out.println(MessageForProgram.ErrorInInputChoice);
            choice = scanner.nextLine();
        }
        boolean Choice = false;
        if(choice.equals("1")){
            Choice = true;
        }
        return Choice;
    }

    private void Menu(){
        System.out.println(MessageForProgram.GeneralMenu);
        byte MenuValue = inputInMenu();

        if(MenuValue==1){
            MenuCarDoor();
        }
        else if(MenuValue==2){
            MenuCarWheel();
        }
        else if (MenuValue==3){
            MenuCar();
        }
        else {
            System.out.println(MessageForProgram.Bye);
            System. exit(0);
        }
    }

    private byte inputInMenu() {
        String MenuValue = scanner.nextLine();
        while (!MenuValue.matches("^[0-3]$")) {
            System.out.println(MessageForProgram.ErrorInInputMenu);
            MenuValue = scanner.nextLine();
        }
        return Byte.parseByte(MenuValue);
    }

    private byte InputNumber() {
        String MenuValue = scanner.nextLine();
        while (!MenuValue.matches("^[1-9]$")) {
            System.out.println(MessageForProgram.ErrorInInputNumbersDoors);
            MenuValue = scanner.nextLine();
        }
        return Byte.parseByte(MenuValue);
    }
    ////////////////////////////////////////////////  DOOR AND WINDOWS ///////////////////////////

    private void NumberOfDoors(){
        System.out.println(MessageForProgram.InputNumbersOfDoors);
        byte Number = InputNumber();
        ChoiceInputStatusDoorAndWindows(Number);

    }


    private void ChoiceInputStatusDoorAndWindows(byte Number){
        System.out.println(MessageForProgram.ChoiceInputStatusOfDoor);
        if(Choice()){
            MakeArrayDoor(Number);
        }else {
            MakeArrayDoorAutomatic(Number);
        }
        Menu();
    }

    private void MakeArrayDoor(byte Number){

        for (byte i=0;i<Number;){
            System.out.println(MessageForProgram.InputStatusOfDoor1+(++i)+"\n"+MessageForProgram.InputStatusOfDoor2);
            carDoor.ArrayConditionDoor.add(Choice());
            System.out.println(MessageForProgram.InputStatusOfWindows1+i+"\n"+MessageForProgram.InputStatusOfWindows2);
            carDoor.ArrayConditionWindows.add(Choice());
        }
    }

    private void MakeArrayDoorAutomatic(byte Number){
        for (byte i=0;i<Number;i++){
            carDoor.ArrayConditionDoor.add(false);
            carDoor.ArrayConditionWindows.add(false);
        }
    }

    private void MenuCarDoor() {
        boolean check = true;
        byte i =0;
                while (check) {
            System.out.println(MessageForProgram.MenuDoorAndWindows);
            byte MenuDoorValue = inputInMenuDoor();
            if (MenuDoorValue == 1) {
                i=ChoiceNumberOfWheel();
                carDoor.CloseDoor(--i);
            } else if (MenuDoorValue == 2) {
                i=ChoiceNumberOfDoor();
                carDoor.OpenDoor(--i);
            } else if (MenuDoorValue == 3) {
                i=ChoiceNumberOfDoor();
                carDoor.CloseOrOpenDoor(--i);
            } else if (MenuDoorValue == 4) {
                i=ChoiceNumberOfDoor();
                carDoor.CloseWindows(--i);
            } else if (MenuDoorValue == 5) {
                i=ChoiceNumberOfDoor();
                carDoor.OpenWindows(--i);
            } else if (MenuDoorValue == 6) {
                i=ChoiceNumberOfDoor();
                carDoor.CloseOrOpenWindows(--i);
            } else if (MenuDoorValue == 7){
                carDoor.PrintConditionArrayDoorsAndWindows();
            }
            else {
                check = false;
                Menu();
            }
        }
    }
    private byte ChoiceNumberOfDoor() {
        while (true) {
            System.out.println(MessageForProgram.ChoiceNumberOfDoor + carDoor.ArrayConditionDoor.size());

            String Number = scanner.nextLine();
            while (!Number.matches("^[1-9]$")) {
                System.out.println(MessageForProgram.ErrorInInputNumbersDoors);
                Number = scanner.nextLine();
            }
            byte i = Byte.parseByte(Number);
                if (i > carDoor.ArrayConditionDoor.size()) {
                    System.out.println(MessageForProgram.ErrorManyNumberOfDoor);
                } else {
                    return i;
                }
            }
        }

    private byte inputInMenuDoor(){
        String MenuDoorValue = scanner.nextLine();
        while (!MenuDoorValue.matches("^[0-7]$")) {
            System.out.println(MessageForProgram.ErrorInInputMenuDoor);
            MenuDoorValue = scanner.nextLine();
        }
        return Byte.parseByte(MenuDoorValue);
    }


    ///////////////////////////////////////////////////   WHEELS    ////////////////////////////////
     void InputNumberOfWheel(){
        System.out.println(MessageForProgram.NumberOfWheel);
        byte Number = InputNumber();
        MakeArrayWheelAutomatic(Number);
    }
    private void MakeArrayWheelAutomatic(byte Number){
        for (byte i=0;i<Number;i++){
            carWheel.ArrayWheels.add((byte) 100);
        }
        if(carDoor.ArrayConditionDoor.size() ==0) {
            NumberOfDoors();
        }
        MenuCarWheel();
    }

    private byte inputInMenuWheel() {
        String MenuValue = scanner.nextLine();
        while (!MenuValue.matches("^[0-5]$")) {
            System.out.println(MessageForProgram.ErrorInInputMenuWheel);
            MenuValue = scanner.nextLine();
        }
        return Byte.parseByte(MenuValue);
    }

    private void MenuCarWheel(){
        boolean check = true;
        byte i=0;
        while (check) {
            System.out.println(MessageForProgram.MenuWheel);
            byte MenuWheelValue = inputInMenuWheel();
            if (MenuWheelValue == 1) {
                i=ChoiceNumberOfWheel();
                carWheel.NewWheel(--i);
            } else if (MenuWheelValue == 2) {
                i=ChoiceNumberOfWheel();
                carWheel.EraseTheWheel(--i, (byte) InputCoefficientEraseOfWheel());
            } else if (MenuWheelValue == 3) {
                carWheel.RemoveAllWheels();
            } else if (MenuWheelValue == 4) {
                InputNumberOfWheel();
            } else if (MenuWheelValue == 5) {
                carWheel.PrintArrayWheel();
            }
            else {
                check = false;
                Menu();

            }
        }

    }

    private byte ChoiceNumberOfWheel(){
        while (true) {
            System.out.println(MessageForProgram.ChoiceNumberOfWheel + carWheel.ArrayWheels.size());

            String Number = scanner.nextLine();
            while (!Number.matches("^[0-9]$")) {
                System.out.println(MessageForProgram.ErrorInInputNumbersDoors);
                Number = scanner.nextLine();
            }
            byte i = Byte.parseByte(Number);
            if (i > carWheel.ArrayWheels.size()) {
                System.out.println(MessageForProgram.ErrorManyNumberOfWheel);
            } else {
                return i;
            }
        }
    }

    private double InputCoefficientEraseOfWheel(){
        System.out.println(MessageForProgram.InputCoefficientEraseOfWheel);
        while (true) {
            String Coefficient = scanner.nextLine();
            while (!Coefficient.matches("^[0-9]?[0-9]?[0-9]$")) {
                System.out.println(MessageForProgram.ErrorInInputCoefficient);
                Coefficient = scanner.nextLine();
            }
            byte coefficient = Byte.parseByte(Coefficient);
            if (coefficient > 100) {
                System.out.println(MessageForProgram.ErrorInInputCoefficient);
            } else {
                return coefficient;
            }
        }
    }
    ///////////////////////////////////////////////////   CAR    ////////////////////////////////////
     void MenuCar(){
        boolean check = true;
        while (check) {
            System.out.println(MessageForProgram.MenuCar);
            byte MenuCarValue = InputInMenuCar();
            if (MenuCarValue == 1) {
                car.ChangeSpeedInThisMoment();
            } else if (MenuCarValue == 2) {
                car.PutOnePassengerInCar();
            } else if (MenuCarValue == 3) {
               car.LandOnePassengerFromCar();
            } else if (MenuCarValue == 4) {
               car.LandOllPassengersFrom();
            } else if (MenuCarValue == 5) {
                car.PrintObjectData(WorstWheel(), (byte) carWheel.ArrayWheels.size());
            }
            else {
                check = false;
                Menu();
            }
        }
    }

    private byte WorstWheel(){
        byte n =101;
        for (int i = 0; i<carWheel.ArrayWheels.size(); i++) {
            if (carWheel.ArrayWheels.get(i)<n){
                n = carWheel.ArrayWheels.get(i);
            }
        }
        return n;
    }

   private byte InputInMenuCar(){
            String MenuCarValue = scanner.nextLine();
            while (!MenuCarValue.matches("^[0-5]$")) {
                System.out.println(MessageForProgram.ErrorInInputMenuCarValue);
                MenuCarValue = scanner.nextLine();
            }
               return Byte.parseByte(MenuCarValue);
            }
        }



package MyCar;

import java.util.ArrayList;

 class CarWheel {

     public ArrayList<Byte> ArrayWheels = new ArrayList<Byte>();

    void NewWheel(byte i) {
        ArrayWheels.set(i, (byte) 100);

    }

    void EraseTheWheel(byte i, byte coefficient) {
        if (ArrayWheels.get(i) > coefficient) {
            ArrayWheels.set(i, (byte) (ArrayWheels.get(i) - coefficient));
        } else if (ArrayWheels.get(i) == 0.0) {
            System.out.println(MessageForProgram.ErrorCoefficient);
        } else {
            ArrayWheels.set(i, (byte) 0);
        }

    }

    void RemoveAllWheels(){
        while (ArrayWheels.size()>0) {
            ArrayWheels.remove(0);
        }
    }

    void PrintArrayWheel() {
        if (ArrayWheels.size()==0){
            System.out.println(MessageForProgram.ErrorCarWithoutWheels);
        }
        for (byte i = 0; i < ArrayWheels.size(); i++) {
            System.out.print(MessageForProgram.NumberWheel + (++i) + MessageForProgram.StatusOfWheel);
            --i;
            System.out.println(ArrayWheels.get(i) + "%");
        }
        System.out.println();
    }
}

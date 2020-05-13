package MyCar;

import java.util.ArrayList;

class CarDoor {
    ArrayList<Boolean> ArrayConditionDoor = new ArrayList<Boolean>();
    ArrayList<Boolean> ArrayConditionWindows = new ArrayList<Boolean>();

    void CloseDoor(byte i) {
        ArrayConditionDoor.set(i, false);
    }

    void OpenDoor(byte i) {
        ArrayConditionDoor.set(i, true);
    }


    void CloseOrOpenDoor(byte i) {
        ArrayConditionDoor.set(i, !ArrayConditionDoor.get(i));
    }

    void CloseWindows(byte i) {
        ArrayConditionWindows.set(i, false);
    }

    void OpenWindows(byte i) {
        ArrayConditionWindows.set(i, true);
    }

    void CloseOrOpenWindows(byte i) {
        ArrayConditionWindows.set(i, !ArrayConditionWindows.get(i));
    }


    void PrintConditionArrayDoorsAndWindows() {

        for (byte i=0;i<ArrayConditionDoor.size();i++){
            System.out.print(MessageForProgram.NumberDoor+(++i)+MessageForProgram.StatusOfDoor);
            --i;
            if (ArrayConditionDoor.get(i)){
                System.out.print(MessageForProgram.Open);
            }else {
                System.out.print(MessageForProgram.Close);
            }
            System.out.print(MessageForProgram.StatusOfWindows);
            if (ArrayConditionWindows.get(i)){
                System.out.println(MessageForProgram.Open);
            }else {
                System.out.println(MessageForProgram.Close);
            }
        }
        System.out.println();

    }
}
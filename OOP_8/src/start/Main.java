package start;

import ru.javabegin.training.fastjava2.objects.Door;
import ru.javabegin.training.fastjava2.objects.House;

public class Main {

    public static void main(String[] args) {

        House house1  = new House();
        Door door = new Door();

        house1.lightOn();
        door.open();
    }
}

import java.util.Random;

public class Player {
    private int currentDoor;

    public Player() {

    }

    public int chooseFirstDoor() {
        randomNumber rn = new randomNumber();
        int choice = rn.generateInt();
        currentDoor = choice;
        return choice;
    }
    public int chooseSecond(int goatDoor) {
        for (int i = 0; i < 2; i++) {
            if(i != currentDoor && i != goatDoor) {
                currentDoor = i;
                //Exit loop early
                i = 5;
            }
        }
        return currentDoor;
    }
}

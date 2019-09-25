public class Host {

    private int prizeAt;

    public Host() {

    }
        public void generateDoor(Boolean[] inDoors) {

            //Reset the door to false
            inDoors[0] = false;
            inDoors[1] = false;
            inDoors[2] = false;

            //Generate the door to put prize in
            randomNumber rn = new randomNumber();
            prizeAt = rn.generateInt();

            inDoors[prizeAt] = false;

        }
        //returns what door is opened
        public int revealGoat(int chosenDoor) {
        int goatDoor = -1;
            for (int i = 0; i < 2; i++) {
                if(i != prizeAt && i != chosenDoor) {
                    goatDoor = i;
                }
            }
            return goatDoor;
        }

        public boolean checkWon(int chosenDoor) {
            boolean win = false;
            if (chosenDoor == prizeAt)
                win = true;
            return win;
        }
}


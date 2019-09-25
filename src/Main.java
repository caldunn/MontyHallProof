public class Main {

    public static void main(String[] args) {
	// write your code here
        //Array for door
        Boolean[] doors = new Boolean[3];
        Host host = new Host();
        Player player = new Player();
        double wins = 0, games;

        //Int for storing players currentdoor
        int playerCurrentDoor;
        //The revealed door
        int goatDoor;

        for (games =0; games < 1000000000; games++) {
            //Generate a new Game
            host.generateDoor(doors);
            //Player chose initial door
            playerCurrentDoor = player.chooseFirstDoor();
            //Host reveal a door
            goatDoor = host.revealGoat(playerCurrentDoor);
            //Player rechoose a door
            playerCurrentDoor = player.chooseSecond(goatDoor);
            //Check if the door is a winner
            if (host.checkWon(playerCurrentDoor))
                wins++;
        }
        System.out.println("Games won: " + wins + " Total Played: " + games + "\nRatio: " + (wins / games * 100));

    }

    public void legacyShit() {
        randomNumber rn = new randomNumber();
        int x;
        int one = 0, two = 0, three = 0;
        for (int i = 0; i < 50; i++) {
            x = rn.generateInt();
            if (x == 1) {
                one++;
            } else if (x == 2) {
                two++;
            }
            else if (x == 0) {
                three++;
            }
        }
        System.out.println("Ones:" + one +  "\nTwos: " + two + "\nThrees: " + three + "\n Total: " + (one+two+three));
    }
}

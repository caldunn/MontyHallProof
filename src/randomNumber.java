import java.util.Random;

public class randomNumber {
    public int generateInt(){
        Random r = new Random();
        return r.nextInt((3 - 0) + 0) + 0;
    }
}

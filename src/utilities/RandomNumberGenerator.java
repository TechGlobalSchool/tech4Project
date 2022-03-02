package utilities;

public class RandomNumberGenerator {
    public static int getRandomNumber(int start, int end){
        return (int)(Math.random()*(end - start + 1)) + start;
    }
}

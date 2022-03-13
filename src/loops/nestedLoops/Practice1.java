package loops.nestedLoops;

public class Practice1 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println(i);
            for (int j = 5; j > 2; j--) {
                System.out.println("\t" + j);
            }
        }
    }
}

package oop_principles.recapOOP;

public class CreatingSwords {
    public static void main(String[] args) {
        CurvedSword goldenSword = new CurvedSword();
        goldenSword.color = "Yellow";
        goldenSword.material = "Gold";
        goldenSword.sharpness = "Blunt";
        goldenSword.price = 500.0;
        goldenSword.weight = 15.5;
        System.out.println(goldenSword);



        System.out.println("\n");
        CurvedSword ironSword = new CurvedSword("Silver", "Iron", "Sharp", 7.3, 50.0);
        System.out.println(ironSword);

        System.out.println("\n" + goldenSword.material + " Methods");
        goldenSword.slash();
        goldenSword.cut();
        goldenSword.cut(goldenSword.sharpness.equals("Sharp"));

        System.out.println("\n" + ironSword.material + " Methods");
        ironSword.slash();
        ironSword.cut();
        ironSword.cut(ironSword.sharpness.equals("Sharp"));
    }
}

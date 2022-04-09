package oop_principles.recapOOP;

public class CurvedSword {
    static { // one time execution BEFORE EVERYTHING
        System.out.println("Starting furnace...");
    }

    {
        System.out.println("Heating up the material..." +
                "\nSword is created!!!");
    }

    public CurvedSword() {

    }

    public CurvedSword(String material) {
        this.material = material;
    }

    public CurvedSword(String color, String material, String sharpness, double weight, double price) {
        this.color = color;
        this.material = material;
        this.sharpness = sharpness;
        this.weight = weight;
        this.price = price;
    }

    public String color;
    public String material;
    public final static String handle = "T shape handle";
    public String sharpness;
    public static String size = "Medium";
    public double weight;
    public double price;

    public void slash() {
        System.out.println(material + " sword slashes");
    }

    public void cut() {
        System.out.println(material + " sword cuts");
    }

    public void cut(boolean isSharp) {
        System.out.println(isSharp ? "The cut is deep" : "There is no cut");
    }


    public static CurvedSword creatingSword(String material) {
//        CurvedSword sword = new CurvedSword(material);
//        return sword;
        return new CurvedSword(material);
    }


    public String toString() {
        return "CurvedSword{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", sharpness='" + sharpness + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

}

package recap.OOP;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Male male = new Male("Abe", "Kim", 12, 140, 6.2, "01/01/2010"
                , "999-99-9999", "TechGlobal");
        Female female = new Female("Data", "datkaiym", 18, 100, 5.8,
                "01/01/2004", "999-99-9999", "TechGlobal");

        List<Human> humans = new ArrayList<>();
        humans.add(male);
        humans.add(female);

//        System.out.println(humans);
        male.beHappy();
        male.getJob();

        female.getJob();
    }
}

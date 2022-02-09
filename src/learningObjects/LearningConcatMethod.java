package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args) {

        String tech = "Tech";
        String global = "Global";

        String schoolName1 = tech + global;         //+ operator
        String schoolName2 = tech.concat(global);   //concat method

        System.out.println(schoolName1 + "\n" + schoolName2);



    }
}

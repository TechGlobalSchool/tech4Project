package ifElseStatements.ifElseStatements;

public class WeekdayOrWeekend {
    public static void main(String[] args) {

        // if it is weekend print out "it is weekend!"
        // else it is weekday

        //boolean isWeekend = true;
        boolean isWeekday = false;

        // you CANNOT use relational operators with OBJECTS, you have to use METHOD
        // you can use relational operators with primitives


        if(!isWeekday){
            System.out.println("it is weekend!");
        }else{
            System.out.println("it is weekday!");
        }

    }
}

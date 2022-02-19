package casting;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {


        // Autoboxing (primitive -> object[wrapper class])
        float num = 45.6F;
        // var num1 = 45.6F;
        Float numFloat = num;

        // Unboxing (object[wrapper class] -> primitive)
        Character character = 'D';
        char characterPrimitive = character;


    }
}

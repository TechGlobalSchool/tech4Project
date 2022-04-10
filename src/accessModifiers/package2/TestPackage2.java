package accessModifiers.package2;

import accessModifiers.package1.Honda;

public class TestPackage2{
    public static void main(String[] args) {
        Honda h1 = new Honda();
        //Tesla t1 = new Tesla(); compiler error
    }
}

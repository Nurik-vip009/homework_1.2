public class Main {
    public static void main(String[] args) {
        ComplexType complexType1 = new ComplexType(10, "Data");
        ComplexType complexType2 = new ComplexType(20, "Info");
        
        Level_2 objectA = new Level_2(10, "Object A");
        Level_3 objectB = new Level_3(20, "Object B",complexType1, MyEnum.OPTION1);
        Level_3 objectC = new Level_3(30,"Object C",complexType2, MyEnum.OPTION2);

        System.out.println("Object A:");
        System.out.println(objectA.getInfo());
        objectA.overloadedMethod(5);
        objectA.nonOverridableMethod();

        System.out.println("\nObject B:");
        System.out.println(objectB.getInfo());
        objectB.overloadedMethod(8);

        System.out.println("\nObject C:");
        System.out.println(objectC.getInfo());
        objectC.overloadedMethod(3);
    }
}
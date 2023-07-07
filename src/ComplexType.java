public class ComplexType {
    private int field1;
    private String field2;

    public ComplexType(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public void performAction() {
        System.out.println("Performing action...");
    }

    @Override
    public String toString() {
        return "ComplexType - Field1: " + field1 + ", Field2: " + field2;
    }
}

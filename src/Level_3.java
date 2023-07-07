public final class Level_3 extends Level_2{
    private ComplexType leve3Field;
    private MyEnum level3Enum;
    public Level_3(int level1Field, String level2Field, ComplexType leve3Field, MyEnum level3Enum) {
        super(level1Field, level2Field);
        this.leve3Field = leve3Field;
        this.level3Enum = level3Enum;
    }

    public ComplexType getLeve3Field() {
        return leve3Field;
    }

    public MyEnum getLevel3Enum() {
        return level3Enum;
    }

    @Override
    public void overloadedMethod(int value) {
        super.overloadedMethod(value);
    }

    public String getInfo(){
        return "Level_3 - " + super.getInfo() + ", Level3Field: " + getLeve3Field() + ", Level3Enum: " + getLevel3Enum();
    }
}

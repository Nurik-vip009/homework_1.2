public class Level_2 extends Level_1{
    private String level2Field;
    public Level_2(int level1Field, String level2Field) {
        super(level1Field);
        this.level2Field = level2Field;
    }

    public String getLevel2Field() {
        return level2Field;
    }
    public void overloadedMethod(int value){
        System.out.println("Overloaded method with int parameter: " + value);
    }
    public final void nonOverridableMethod(){
        System.out.println("Non - overridable method");
    }
        public String getInfo(){
            return "Level2 - LevelField: " + getLevel1Field() + ", LevelField2: " + getLevel2Field();
    }
}

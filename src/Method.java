import java.nio.file.WatchEvent;

public final class Method extends Namespace implements Static, Modifier, Return {
    private boolean isStatic;
    private String modifier;
    private String returnType;

    public Method(String name, boolean isStatic, String modifier, String returnType) {
        super(name);
        this.isStatic = isStatic;
        this.modifier = modifier;
        this.returnType = returnType;
    }

    @Override
    public void switchStatic() {
        this.isStatic = !this.isStatic;

    }
    @Override
    public boolean isStatic() {
        return isStatic;
    }
    @Override
    public void addReturnType(String returnType){
        this.returnType = returnType;
    }

    @Override
    public void addModifier(String modifier) {
        this.modifier = modifier;

    }

    @Override
    public String toString() {
        return "Method{" +
                "isStatic=" + isStatic +
                ", modifier='" + modifier + '\'' +
                ", returnType='" + returnType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

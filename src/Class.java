import java.util.ArrayList;

public class Class extends Namespace implements Modifier, Static {
    private String modifier;
    private boolean isStatic;

    @Override
    public String toString() {
        return "Class{" +
                "modifier='" + modifier + '\'' +
                ", isStatic=" + isStatic +
                ", methods=" + methods +
                ", fields=" + fields +
                ", name='" + name + '\'' +
                '}';
    }

    public Class(String name, String modifier, boolean isStatic) {
        super(name);
        this.modifier = modifier;
        this.isStatic = isStatic;
        this.methods = methods;
    }

    ArrayList<Method> methods = new ArrayList<>();
    ArrayList<Field> fields = new ArrayList<>();

    @Override
    public void addModifier(String modifier) {
        this.modifier = modifier;

    }

    @Override
    public void switchStatic() {
        this.isStatic = !this.isStatic;

    }
    @Override
    public boolean isStatic() {
        return this.isStatic;
    }
    public void methodsAdd(Method method){
        methods.add(method);

    }
    public void fieldsAdd(Field field){
        fields.add(field);

    }

}

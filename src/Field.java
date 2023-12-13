public final class Field extends Namespace implements Static, Const {
    private boolean isStatic;
    private boolean isConst;

    @Override
    public String toString() {
        return "Field{" +
                "isStatic=" + isStatic +
                ", isConst=" + isConst +
                ", name='" + name + '\'' +
                '}';
    }

    public Field(String name, boolean isStatic, boolean isConst) {
        super(name);
        this.isStatic = isStatic;
        this.isConst = isConst;
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
    public boolean isConst(){
        return isStatic;
    }
    public void switchConst() {
        this.isStatic = !isStatic;
    }
}

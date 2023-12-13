public class Main {
    public static void main(String[] args) {
        Class calc = new Class("Calc", "public", true);
        Method sum = new Method("Sum", true, "public", "Integer");
        Method difference = new Method("difference", true, "public", "Integer");
        Method multiplication = new Method("multiplication", true, "public", "Integer");
        Field pi = new Field("Pi", false, true);
        Field e = new Field("e", false, true);
        Field x = new Field("X", false, false );
        Field y = new Field("Y", false, false );
        calc.methodsAdd(sum);
        calc.methodsAdd(difference);
        calc.methodsAdd(multiplication);
        calc.fieldsAdd(pi);
        calc.fieldsAdd(x);
        calc.fieldsAdd(y);
        System.out.println(calc);


    }
}
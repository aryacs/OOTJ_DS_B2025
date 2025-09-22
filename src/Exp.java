public class Exp {
    public void show() throws ArithmeticException {
        int c = 55 / 2;//exception found
        System.out.println("Result =" + c);
    }
    public static void main(String arg[]) {
        Exp ex = new Exp();
        try {
            ex.show();
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("This execute always");
        }
    }
}


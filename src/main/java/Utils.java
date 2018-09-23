public class Utils {
    public void twoNums(String op){
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        String equation;
        if(op.equals("-") && a < b)
            equation = b + op + a;
        else
            equation = a + " " + op + " " +b;
        System.out.println(equation);
    }
    public void threeNums(String op1, String op2){
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);

    }
}

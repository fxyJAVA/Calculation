import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {
    public void twoNums(String op) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        String equation;
        if (op.equals("-") && a < b)
            equation = b + op + a;
        else
            equation = a + " " + op + " " + b;
        System.out.println(equation);
    }

    public void threeNums(String op1, String op2) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

    }

    public void fourNum(String[] op) {
        //默认没有乘除，暂不考虑括号
        boolean flag = false;
        String result = "";
        String tempSuanShi;
        StringBuffer suanShi = new StringBuffer();

        if (Arrays.asList(op).contains("*") || Arrays.asList(op).contains("÷"))
            flag = true;
        if (flag) {
            for (String s : op) {
                switch (s) {
                    case "*": {
                        if (suanShi != null && suanShi.length() > 0) {
                            int c = (int) (Math.random() * 100);
                            result = String.valueOf(Integer.valueOf(result) * c);
                            suanShi.append("*" + c);
                        } else {
                            int a = (int) (Math.random() * 100);
                            int b = (int) (Math.random() * 100);
                            result = String.valueOf(a * b);
                            suanShi.append(a + "*" + b);
                        }
                        tempSuanShi = suanShi.toString();
                        break;
                    }
                    case "÷": {
                        if (suanShi != null && suanShi.length() > 0) {
                            int c = (int) (Math.random() * 100);
                            result = result + "/" + c;
                            suanShi.append("÷" + c);
                        } else {
                            int a = (int) (Math.random() * 100);
                            int b = (int) (Math.random() * 100);
                            result = a + "/" + b;
                            suanShi.append(a + "÷" + b);
                        }
                        tempSuanShi = suanShi.toString();
                        break;
                    }
                }
            }
        }
        for (String s : op) {
            switch (s) {
                case "+": {
                    System.out.println("".equals(suanShi.toString()));
                    if(suanShi != null && !("".equals(suanShi.toString()))) {
                        int c = (int) (Math.random() * 100);
                        result = String.valueOf((Integer.parseInt(result)+c));
                        suanShi.append("+" + c);
                    } else {
                        int a = (int) (Math.random() * 100);
                        int b = (int) (Math.random() * 100);
                        result = String.valueOf(a + b);
                        suanShi.append(a + "+" + b);
                    }
                    tempSuanShi = suanShi.toString();
                    break;
                }
                case "-": {
                    if(suanShi != null && suanShi.length() > 0) {
                        int c = (int) (Math.random() * 100);
                        if(Integer.parseInt(result)<c) {
                            int temp = Integer.parseInt(result);
                            result = String.valueOf(c);
                            c = temp;
                        }
                        result = String.valueOf(Integer.valueOf(result) - c);
                        suanShi.append("-" + c);
                    } else {
                        int a = (int) (Math.random() * 100);
                        int b = (int) (Math.random() * 100);
                        if(a<b) {
                            int temp = a;
                            a = b;
                            b=temp;
                        }
                        result = String.valueOf(a - b);
                        suanShi.append(a + "-" + b);
                    }
                    tempSuanShi = suanShi.toString();
                    break;
                }
            }
        }
        System.out.println("生成的算式为："+suanShi.toString()+"="+result);
    }
}

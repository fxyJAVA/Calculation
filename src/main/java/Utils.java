import java.util.Arrays;

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
                        result = xo(suanShi,"*",result);
                        tempSuanShi = suanShi.toString();
                        break;
                    }
                    case "÷": {
                        result = xo(suanShi,"÷",result);
                        tempSuanShi = suanShi.toString();
                        break;
                    }
                }
            }
        }
        for (String s : op) {
            switch (s) {
                case "+": {
                    result = xo(suanShi,"+",result);
                    tempSuanShi = suanShi.toString();
                    break;
                }
                case "-": {
                    result = xo(suanShi,"-",result);
                    tempSuanShi = suanShi.toString();
                    break;
                }
            }
        }

        if(result.contains("'")) {
            if(result.split("'")[1].split("/")[0].equals("0")) {
                result = 0+"";
            }
        }else if(result.contains("/")){
            if(result.split("/")[0].equals("0")) {
                result = 0+"";
            }
        }
        System.out.println("生成的算式为："+suanShi.toString()+"="+result);
    }

    public String createFenShu() {
        String temp;
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        while (a==0 && b==0) {
             a = (int) (Math.random() * 100);
             b = (int) (Math.random() * 100);
        }
        if(a>b) {
          int zheng  = a/b;
          int fenzi = a%b;
          if(fenzi != 0) {
              temp = zheng+"'"+fenzi+"/"+b;
          }else {
              temp = zheng+"";
          }
        }
        else {
            temp = a+ "/" +b;
        }
        if(a==0 && b!=0) {
            temp = 0+"";
        }
        return temp;
    }

    public String calFenShu(String fen1,String fen2,String op) {
        if(fen1.contains("'")) {
           String[] temp = fen1.split("'");
           fen1  = (Integer.parseInt(temp[0])*Integer.parseInt(temp[1].split("/")[1])+Integer.parseInt(temp[1].split("/")[0]))+"/"+(Integer.parseInt(temp[1].split("/")[1]));
        }
        if(fen2.contains("'")) {
            String[] temp = fen2.split("'");
            fen2  = (Integer.parseInt(temp[0])*Integer.parseInt(temp[1].split("/")[1])+Integer.parseInt(temp[1].split("/")[0]))+"/"+(Integer.parseInt(temp[1].split("/")[1]));
        }
        String[] f1 = fen1.split("/");
        String[] f2 = fen2.split("/");
        String result = "";
        switch (op) {
            case "+": {
                 int tempFenZi = Integer.parseInt(f1[0])*Integer.parseInt(f2[1]) + Integer.parseInt(f2[0])*Integer.parseInt(f1[1]);
                 int tempFenMu = Integer.parseInt(f1[1])*Integer.parseInt(f2[1]);
                 result = zuhe(tempFenZi,tempFenMu);
                 break;
            }
            case "-": {
                int tempFenZi = Integer.parseInt(f1[0])*Integer.parseInt(f2[1]) - Integer.parseInt(f2[0])*Integer.parseInt(f1[1]);
                int tempFenMu = Integer.parseInt(f1[1])*Integer.parseInt(f2[1]);
                result = zuhe(tempFenZi,tempFenMu);
                break;
            }
            case "*": {
                int tempFenZi = Integer.parseInt(f1[0])*Integer.parseInt(f2[0]);
                int tempFenMu = Integer.parseInt(f1[1])*Integer.parseInt(f2[1]);
                result = zuhe(tempFenZi,tempFenMu);
                break;
            }
            case "÷": {
                int tempFenZi = Integer.parseInt(f1[0])*Integer.parseInt(f2[1]);
                int tempFenMu = Integer.parseInt(f1[1])*Integer.parseInt(f2[0]);
                result = zuhe(tempFenZi,tempFenMu);
                break;
            }
         }
         return result;
    }

    private String zuhe(int tempFenZi,int tempFenMu) {
        String result="";
        if(tempFenZi > tempFenMu) {
            int zheng = tempFenZi/tempFenMu;
            int yv = tempFenZi%tempFenMu;
            if(yv==0) {
                result = zheng+"";
            }else {
                result = zheng+"'"+yv+"/"+tempFenMu;
            }
        }else {
            result = tempFenZi+ "/"+tempFenMu;
        }
        return result;
    }

    private String xo(StringBuffer suanShi,String op,String r) {
        String result=r;
        if (suanShi.length() > 0 && suanShi != null && !(suanShi.toString().equals(""))) {
            if((int)(Math.random()*3) == 0) {
                //随机数如果为0，则代表生成的是分数
                String cfen = createFenShu();
                if(result.contains("/")) {
                    //result是分数
                    result = calFenShu(result,cfen,op);
                }else {
                    //result不是分数
                    result = calFenShu(result+"/"+1,cfen,op);
                }
                suanShi.append(op+cfen);
            } else {
                int c = (int) (Math.random() * 100);
                if(result.contains("/")) {
                    //result是分数
                    result = calFenShu(result,c+"/"+1,op);
                }else {
                    //result不是分数
                    result = calFenShu(result+"/"+1,c+"/"+1,op);
                }
                suanShi.append(op + c);
            }
        } else {
            if((int)(Math.random()*3) == 0) {
                String afen = createFenShu();
                String bfen = "";
                if((int)(Math.random()*3) == 0) {
                    //bfen是分数
                    bfen = createFenShu();
                    result = calFenShu(afen,bfen,op);
                } else {
                    //bfen是整数
                    bfen = (int)(Math.random()*100)+"";
                    result = calFenShu(afen,bfen+"/"+1,op);
                }
                suanShi.append(afen + op + bfen);
            } else {
                int a = (int) (Math.random() * 100);
                String b="";
                if((int)(Math.random()*3) == 0) {
                    //b是分数
                    b = createFenShu();
                    result = calFenShu(a+"/"+1,b,op);
                } else{
                    b = (int) (Math.random() * 100)+"";
                    result = a*Integer.parseInt(b)+"";
                }
                suanShi.append(a + op + b);
            }
        }
        return result;
    }
}

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    @org.junit.Test
    public void test() {
        Utils utils = new Utils();
        String[] s = {"+","-","*"};
    }

    @org.junit.Test
    public void test1(){
        int num0 = 0;
        int num12 = 0;
        for (int i=0;i<100;i++) {
            if((int)(Math.random()*3) == 0) {
                num0++;
                continue;
            }
            num12++;
        }
        System.out.println("num0:"+num0);
        System.out.println("num12:"+num12);
    }

    @org.junit.Test
    public void testAdd(){
        System.out.println(new Utils().createFun(new String[]{"+"},100));
    }

    @org.junit.Test
    public void testSub(){
        System.out.println(new Utils().createFun(new String[]{"-"},100));
    }

    @org.junit.Test
    public void testMul(){
        System.out.println(new Utils().createFun(new String[]{"*"},100));
    }

    @org.junit.Test
    public void testDiv(){
        System.out.println(new Utils().createFun(new String[]{"÷"},100));
    }

    @org.junit.Test
    public void testAddSub(){
        System.out.println("加减："+new Utils().createFun(new String[]{"+","-"},100));
        System.out.println("减加："+new Utils().createFun(new String[]{"-","+"},100));
    }

    @org.junit.Test
    public void testAddMul(){
        System.out.println("加乘："+new Utils().createFun(new String[]{"+","*"},100));
        System.out.println("乘加："+new Utils().createFun(new String[]{"*","+"},100));
    }

    @org.junit.Test
    public void testAddDiv() {
        System.out.println("加除："+new Utils().createFun(new String[]{"+","÷"},100));
        System.out.println("除加："+new Utils().createFun(new String[]{"÷","+"},100));
    }

    @org.junit.Test
    public void testMulDiv() {
        System.out.println("乘除："+new Utils().createFun(new String[]{"*","÷"},100));
        System.out.println("除乘："+new Utils().createFun(new String[]{"÷","*"},100));
    }

    @org.junit.Test
    public void testSubDiv() {
        System.out.println("减除："+new Utils().createFun(new String[]{"-","÷"},100));
        System.out.println("除减："+new Utils().createFun(new String[]{"÷","-"},100));
    }

    @org.junit.Test
    public void testSubMul() {
        System.out.println("减乘："+new Utils().createFun(new String[]{"-","*"},100));
        System.out.println("乘减："+new Utils().createFun(new String[]{"*","-"},100));
    }

    @org.junit.Test
    public void testThree() {
        System.out.println("加减乘："+new Utils().createFun(new String[]{"+","-","*"},100));
        System.out.println("乘减加："+new Utils().createFun(new String[]{"*","-","+"},100));
        System.out.println("减乘加："+new Utils().createFun(new String[]{"-","*","+"},100));
        System.out.println("加乘减："+new Utils().createFun(new String[]{"+","*","-"},100));
        System.out.println("乘加减："+new Utils().createFun(new String[]{"*","+","-"},100));
        System.out.println("减加乘："+new Utils().createFun(new String[]{"-","+","*"},100));


        System.out.println("乘除减："+new Utils().createFun(new String[]{"*","÷","-"},100));
        System.out.println("乘减除："+new Utils().createFun(new String[]{"*","-","÷"},100));
        System.out.println("减除乘："+new Utils().createFun(new String[]{"-","÷","*"},100));
        System.out.println("减乘除："+new Utils().createFun(new String[]{"-","*","÷"},100));
        System.out.println("除乘减："+new Utils().createFun(new String[]{"÷","-","*"},100));
        System.out.println("除减乘："+new Utils().createFun(new String[]{"÷","*","-"},100));

        System.out.println("除加减："+new Utils().createFun(new String[]{"÷","+","-"},100));
        System.out.println("除减加："+new Utils().createFun(new String[]{"÷","-","+"},100));
        System.out.println("加减除："+new Utils().createFun(new String[]{"+","-","÷"},100));
        System.out.println("加除减："+new Utils().createFun(new String[]{"+","÷","-"},100));
        System.out.println("减除加："+new Utils().createFun(new String[]{"-","÷","+"},100));
        System.out.println("减加除："+Utils.createFun(new String[]{"-","-","*"},100));
    }

    @org.junit.Test
    public void testCreateSuanShi() {
        Utils utils = new Utils();
        utils.createSuanShi(10000,100);
//        FileUtils.creatFile(utils.createSuanShi(10,100));
    }


    @org.junit.Test
    public void ss() throws IOException {
        LocalDateTime time = LocalDateTime.now();
        String timeFor = time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
        System.out.println(timeFor);
    }

    @org.junit.Test
    public void testCheck() {
        try {
            FileUtils.check("C:\\Users\\hp\\Desktop\\Exercises@2018-09-29_11-15-45.txt","C:\\Users\\hp\\Desktop\\myanswer.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void ttt(){
        String s = "1.    20";
        System.out.println(s.contains("."));
        System.out.println(s.split("\\.").length);
        System.out.println(s.split("\\.")[0]);
    }

    @org.junit.Test
    public void ttt1() {
        StringBuilder sb = new StringBuilder("(15+57)*12+85");
        while(sb.toString().contains("(")) {
            sb.deleteCharAt(sb.lastIndexOf("("));
        }
        while(sb.toString().contains(")")) {
            sb.deleteCharAt(sb.lastIndexOf(")"));
        }
        System.out.println(sb.toString());
//        String reg = "";
//        String t = "1+2-3÷4*5";
//        String s[] = t.split("[\\+\\-\\*\\÷]");
//        for (String c:s) {
//            System.out.println(c);
//        }
//        System.out.println(Arrays.toString(s));
    }

    @org.junit.Test
    public void test3() {
        int zero = 0;
        int notZero = 0;
        for (int i=0;i<100;i++) {
            if((int)(Math.random()*100) == 0) {
                zero++;
            } else {
                notZero++;
            }
        }
        System.out.println("zero:"+zero);
        System.out.println("notZero:"+notZero);
    }
}

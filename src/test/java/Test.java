public class Test {
    @org.junit.Test
    public void test() {
        Utils utils = new Utils();
        String[] s = {"+","-","*"};
        utils.fourNum(s);
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
}

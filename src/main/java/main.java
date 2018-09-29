public class main {

    public static void main(String[] args) {
        //"-n指令"
        if(args[0].equals("-n") && args.length==2) {
            try {
             int num = Integer.parseInt(args[1]);
             FileUtils.creatFile(Utils.createSuanShi(num,100));
            }catch (NumberFormatException e) {
                System.out.println("输入了非法数据");
                System.exit(0);
            }
           System.exit(0);
        }

        //"-r指令"
        if(args[0].equals("-r") && args.length==2) {
            try {
                int num = Integer.parseInt(args[0]);
                FileUtils.creatFile(Utils.createSuanShi(10,num));
            }catch (NumberFormatException e) {
                System.out.println("输入了非法数据");
                System.exit(0);
            }
            System.exit(0);
        }
    }
}

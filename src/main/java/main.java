import java.io.IOException;

public class main {

    public static void main(String[] args) {
        int num = 0;
        int size = 0;
        String exercisePath = null;
        String answerPath = null;
        if(args.length != 0){
            for(int i = 0; i < args.length; i++){
                //"-n指令"
                if(args[i].equals("-n")) {
                    try {
                        num = Integer.parseInt(args[i+1]);
                    }catch (NumberFormatException e) {
                        System.out.println("参数有误!");
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("参数有误!");
                    }
                }
                //"-r指令"
                if(args[i].equals("-r")) {
                    try {
                        size = Integer.parseInt(args[i+1]);
                    }catch (NumberFormatException e) {
                        System.out.println("参数有误!");
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("参数有误!");
                    }
                }
                if(args[i].equals("-e")){
                    try{
                        exercisePath = args[i+1];
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("参数有误!");
                    }
                }
                if(args[i].equals("-a")){
                    try{
                        answerPath = args[i+1];
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("参数有误!");
                    }
                }
            }
            if(num != 0 && size != 0){
                FileUtils.creatFile(Utils.createSuanShi(num,size));
            }
            if(exercisePath != null && answerPath != null){
                try {
                    FileUtils.check(exercisePath,answerPath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

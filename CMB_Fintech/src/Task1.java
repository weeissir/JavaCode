import java.util.Scanner;
import java.util.StringJoiner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String before = in.nextLine();
        String after = change(before);
        System.out.println(after);

    }

    public static String change(String before) {
        String bit = before.substring(0,10);//截取前10位
        String data = before.substring(10); //截取域内容

        //检查域是否存在
        boolean[] bitExist = new boolean[10];
        for (int i = 0; i < 10; i++) {
            if(bit.charAt(i) == '1'){
                bitExist[i] = true;
            }else {
                bitExist[i] = false;
            }
        }


        //检索每个域内容
        String[] dataBlock = new String[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if(bitExist[i]){
                int length = Integer.parseInt(data.substring(count, count + 2)); //长度
                dataBlock[i] = data.substring(count + 2, count + 2 + length); //内容
                count += length + 2;  ////
            }
        }

        //修改域
        bitExist[8] = true;
        dataBlock[8] = "CMBC95568";

        StringBuilder changedata = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if(bitExist[i]){
                changedata.append(String.format("%02d",dataBlock[i].length())).append(dataBlock[i]);
            }
        }
//        System.out.println(changedata.toString());
        return changedata.toString();
    }
}

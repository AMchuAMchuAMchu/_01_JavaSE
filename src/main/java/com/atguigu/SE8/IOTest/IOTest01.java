package com.atguigu.SE8.IOTest;

import java.io.*;
import java.util.Scanner;

/**
 * 日期:2022/7/3  时间:16:01
 *
 * @author:02雪乃赤瞳楪祈雨宫天制作委员会 截图理解:0.0-0.0
 */
public class IOTest01 {
    public static void main(String[] args) throws IOException {

        String path = "D:\\seldom\\rd\\Java_ProjectAll\\Java_ProjectReview\\_01_JavaSE\\java\\com\\atguigu\\SE8\\IOTest\\assets";
        File dir = new File(path+"\\42Guilty_crownED2.mp4");
//        File file = new File(path+"\\anime.txt");
        File file = new File(path+"\\42Guilty_crownED2Copy.mp4");

//        if (!dir.exists()){
//            boolean mkdirs = dir.mkdirs();
//            if (mkdirs){
//                System.out.println("目录造成功!!^_^");
//            }
//        }
//
//        if (!file.exists()){
//            boolean newFile = file.createNewFile();
//            if (newFile){
//                System.out.println("anime.txt文件造成功!!^_^");
//            }
//        }

//        String jm = "\t橘梅小的时候遭到朋友的背叛，从此变得自闭，\n" +
//                "不与人交朋友，不相信友情与爱情，有些自卑。\n" +
//                "但内心善良，温柔，坚强，独立，有正义感。因为误会而结\n" +
//                "识了全校最有人气的男生——黑泽大和，大和欣赏橘梅的个性和善良，\n" +
//                "单方面的追求橘梅，在相处的过程中，橘渐渐被大和的体贴，善良和温柔所吸引开\n" +
//                "始和大和交往，并认识了许多朋友，有了自己的朋友圈，也得到了同学们的认可。\n";
//
//        FileWriter fileWriter = new FileWriter(file);
//        fileWriter.write(jm);
//        fileWriter.flush();
//        fileWriter.close();

//        FileInputStream fileInputStream = new FileInputStream(dir);
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        int len = 0;
//        byte[] bytes = new byte[1024];
//        while ((len = (fileInputStream.read(bytes))) != -1){
//            fileOutputStream.write(bytes);
//        }
//        fileOutputStream.flush();
//        fileOutputStream.close();
//        fileInputStream.close();


//        Scanner scanner = new Scanner(new File("D:\\seldom\\rd\\Java_ProjectAll\\Java_ProjectReview\\_01_JavaSE\\java\\com\\atguigu\\SE8\\IOTest\\assets\\anime.txt"));
//        File file1 = new File("D:\\seldom\\rd\\Java_ProjectAll\\Java_ProjectReview\\_01_JavaSE\\java\\com\\atguigu\\SE8\\IOTest\\assets\\animeCopy.txt");
//        FileWriter fileWriter = new FileWriter(file1);
//        while (scanner.hasNextLine()){
//            fileWriter.write(scanner.nextLine());
//        }
//        fileWriter.flush();
//        fileWriter.close();






    }
}






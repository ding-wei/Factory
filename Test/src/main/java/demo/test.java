package demo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class test {
    public static void main(String[] args) {
//        try {
//            BufferedImage img = ImageIO.read(new File("D:\\Users\\Desktop\\172005_izfN_42170.png"));
//            int w = img.getWidth();
//            int h = img.getHeight();
//            System.out.println("高度"+h+",宽度:"+w);
//            Graphics2D graphics2D = img.createGraphics();
//            graphics2D.drawImage(img,0,0,null);
//            graphics2D.dispose();
//            int alpha = 0;
//            for (int y = img.getMinY();y<img.getHeight();y++){
//                for (int x=img.getMinX();x<img.getWidth();x++){
//                    int pixel = img.getRGB(x,y);
//                    int r = ((pixel & 0x00ff0000) >>> 16);
//                    int g = ((pixel & 0x0000ff00) >>> 8);
//                    int b = ((pixel & 0x000000ff));
//                    if(r == 255 && g == 0  && b == 0 ){
//                        int black = Color.black.getRGB();
//                        img.setRGB(x,y,black);
//                    } else {
//                        //白色像素改为透明
//                        //pixel = (alpha << 24) | (pixel & 0x00ffffff);
//                        int white = Color.white.getRGB();
//                        img.setRGB(x, y, white);
//                    }
//                }
//            }
//            ImageIO.write(img, "png", new File("D:\\Users\\Desktop\\qqqq.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        Hashtable<String,String> abstr = new Hashtable<>();
        abstr.put("ding_wei","Ok");
        System.out.println(4>>>1);
        ConcurrentHashMap<String,String> abstr1 = new ConcurrentHashMap<>();
        abstr1.put("ding_wei","Ok");

        List<String> ab = new ArrayList<>();
        ab.add("121");
    }
}

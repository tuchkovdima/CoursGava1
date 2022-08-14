package ManyStream;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String srcFolder = "/Users/Dima/Desktop/CoursGava/src";
        String dstFolder = "/Users/Dima/Desktop/CoursGava/src";

        File srcDir = new File(srcFolder);

        long start = System.currentTimeMillis();
        File[] files = srcDir.listFiles();

        try {
            for (File file:files){
                BufferedImage image = ImageIO.read(file);
                if(image == null){
                    continue;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

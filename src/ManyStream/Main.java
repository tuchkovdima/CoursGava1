package ManyStream;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
// уменьшение формата файла
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
                int newWidth = 300;
                int newHeight = (int) Math.round(
                        image.getHeight() / (image.getWidth() / (double) newWidth)
                );
                BufferedImage newImage = new BufferedImage(
                        newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
                int widthStep = image.getWidth() / newWidth;
                int heightStep = image.getHeight() / newHeight;

                for (int x = 0; x <newWidth; x++){
                    for (int y = 0; y < newHeight;y++){
                        int rgb = image.getRGB(x * widthStep, y* heightStep);
                        newImage.setRGB(x,y,rgb);
                    }
                }
                File newFile = new File(dstFolder + "/" + file.getName());
                ImageIO.write(newImage, "jpg", newFile);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Duration" + (System.currentTimeMillis() - start));
    }
}

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[][] arr = null;
		try {
			arr = seeBMPImage("uofa_challege.bmp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j]);
				}
			}
		}

	}

	public static byte[][] seeBMPImage(String BMPFileName) throws IOException {
		BufferedImage image = ImageIO.read(main.class.getResource(BMPFileName));

		byte[][] array2D = new byte[image.getWidth()][image.getHeight()];

		for (int xPixel = 0; xPixel < image.getWidth(); xPixel++) {
			for (int yPixel = 0; yPixel < image.getHeight(); yPixel++) {
				int color = image.getRGB(xPixel, yPixel);
					array2D[xPixel][yPixel] = (byte) (color >> 8);
					//array2D[xPixel][yPixel] = 0; // ?
				}
			}

		return array2D;
	}

}

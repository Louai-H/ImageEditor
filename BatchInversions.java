
/**
 * inverts images
 */

import edu.duke.*;
import java.io.*;

public class BatchInversions {
    public ImageResource makeInversion(ImageResource inImage) {
		//I made a blank image of the same size
		ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
		//for each pixel in outImage
		for (Pixel pixel: outImage.pixels()) {
			//look at the corresponding pixel in inImage
			Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
			//set pixel's red to 255-inPixel red
			pixel.setRed(255-inPixel.getRed());
			//set pixel's green to 255-inPixel green
			pixel.setGreen(255-inPixel.getGreen());
			//set pixel's blue to 255-inPixel blue
			pixel.setBlue(255-inPixel.getBlue());
		}
		//outImage is your answer
		return outImage;
	}

    public void selectAndConvert () {
    	DirectoryResource dr = new DirectoryResource();
    	for (File f : dr.selectedFiles()) {
    		ImageResource inImage = new ImageResource(f);
    		ImageResource inverted = makeInversion(inImage);
    		String fname = inImage.getFileName();
    		String newName = "inverted-" + fname;
    		inverted.setFileName(newName);
    		inverted.draw();
    		inverted.save();
    	}
    }

    public void testInverted() {
    	ImageResource ir = new ImageResource();
    	ImageResource inverted = makeInversion(ir);
    	inverted.draw();
    }

}

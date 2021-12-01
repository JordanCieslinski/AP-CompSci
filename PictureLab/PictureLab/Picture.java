import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; 

public class Picture extends SimplePicture 
{
    public static void main(String[] args) 
    {
        Picture beach = new Picture("caterpiller.jpg");
        beach.explore();
        beach.mirrorHorizontal();
        beach.explore();

        
    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    public void keepOnlyBlue()
    {
       Pixel[][] pixels = getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
                pixelObj.setGreen(0);
            }
        } 
    }

    public void negate()
    {
    Pixel[][] pixels = getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(255-pixelObj.getRed());
                pixelObj.setGreen(255-pixelObj.getGreen());
                pixelObj.setBlue(255-pixelObj.getBlue());
            }
        } 
    }

    public void grayScale()
    {
    Pixel[][] pixels = getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed((pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3);
                pixelObj.setGreen((pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3);
                pixelObj.setBlue((pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3);
            }
        } 
    }

    public void fixUnderWater()
    {
    Pixel[][] pixels = getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(pixelObj.getRed()+124);
                
            }
        }
    }

    public void mirrorVertical()
    {
        Pixel[][] pixels = getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        //Complete the rest of the method below
        //Hint: Use nested for loops
        for (int i = 0; i < pixels.length; i ++){
            for(int j = 0; j < pixels[i].length/2; j++){
               pixels[i][pixels[i].length-j-1].setColor(pixels[i][j].getColor());
                
            }
        }
    }

    public void mirrorHorizontal()
    {
        Pixel[][] pixels = getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        //Complete the rest of the method below
        //Hint: Use nested for loops
        for (int i = 0; i < pixels.length/2; i ++){
            for(int j = 0; j < pixels[i].length; j++){
               pixels[pixels.length-i-1][j].setColor(pixels[i][j].getColor());
                
            }
        }
    }

    
    
    
    
    
    
    
    
    ///////////////////// constructors //////////////////////////////////
    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, 
    int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

} // this } is the end of class Picture, put all new methods before this

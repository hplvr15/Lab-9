import java.awt.Color; 
  
/**
 * Write a description of class Mirror here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mirror extends Filter
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Mirror
     */
    public Mirror(String name)
    {
        // initialise instance variables
        super(name);
    }

    /**
     * Apply Mirror filter
     */
   
   @Override
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for (int y = 0;  y < height; y++)
        {
            for (int x = 0; x < (int) width/2; x++)
            {
                Color currentPixel = image.getPixel(x, y);
                Color mirrorPixel = image.getPixel(width-1-x, y);
                image.setPixel(x, y, mirrorPixel);  
                image.setPixel(width-1-x, y, currentPixel);              
            }
        }
    }

}

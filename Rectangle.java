import java.awt.*;
import objectdraw.*;

public class Rectangle extends ARectangle {
    private int width;
    private int height; 
  /* 
   * Name: Constructor  
   * Purpose: initialize the rectangle
   * Parameters: none 
   */
    public Rectangle() 
    {
        super("Rectangle", 0, 0);
        this.setH(0);
        this.setW(0);
    }
  /* 
   * Name: Constructor  
   * Purpose: initialize the rectangle
   * Parameters: int x, int y, int width, int height 
   */
    public Rectangle(int x, int y, int width, int height) 
    {
        super("Rectangle",x,y);
        this.setH(height);
        this.setW(width);
    }
  /* 
   * Name: Constructor  
   * Purpose: initialize the rectangle
   * Parameters: point upperleft, int width, int height 
   */
    public Rectangle(Point upperLeft, int width, int height) {
      super("Rectangle", upperLeft);
      this.setH(height);
      this.setW(width);
    }
  /* 
   * Name: Constructor  
   * Purpose: deep copy the rectangle
   * Parameters: rectangle r 
   */
    public Rectangle(Rectangle r) {
        super(r.getName(), new Point(r.getUpperLeft()));
        this.setH(r.getH());
        this.setW(r.getW());
    }
    
   /* 
   * Name: getter  
   * Purpose: get the height for the rectangle
   * Parameters: none 
   */ 
    public int getH()
    {
      return this.height;
    }
    /* 
   * Name: getter  
   * Purpose: get the width for the rectangle
   * Parameters: none 
   */ 
    public int getW()
    {
      return this.width;
    }
    
  /* 
   * Name: setter  
   * Purpose: set the hidth for the rectangle
   * Parameters: int h
   */ 
    private void setH(int h)
    {
      this.height = h;
    }
    
  /* 
   * Name: setter  
   * Purpose: set the width for the rectangle
   * Parameters: int w
   */ 
    private void setW(int w)
    {
      this.width = w;
    }
  /* 
   * Name: toString()  
   * Purpose: Print information for rctangle
   * Parameters: none 
   */
    @Override
    public String toString() {
        return super.getName() + super.toString() + " Height: " + this.getH()
        + " Width: " + this.getW();
    }
  /* 
   * Name: euqals()  
   * Purpose: deep compare the objects
   * Parameters: object o 
   */
    @Override
    public boolean equals(Object o) 
    {
      if(o == null)
    {
      return false;
    }
    
    if(this.getClass() != o.getClass())
    {
      return false;
    }
    Rectangle checkR = (Rectangle)o;
    if(this.getH() == checkR.getH() && this.getW() == checkR.getW())
    {
      return true;
    }
    else
    {
      return false;
    }
    }
  /* 
   * Name: draw()  
   * Purpose: wether to draw filled or framed draw the square 
   * Parameters: DrawingCanvas canvas, color c, boolean fill
   */
    public void draw(DrawingCanvas canvas, Color c, boolean fill) 
    {
        Location upleftC = new Location(super.getUpperLeft().getX(), super.getUpperLeft().getY());
        if(fill == true)
        {
          FilledRect newfilledR = new FilledRect(upleftC, this.getW(),this.getH(),canvas);
          newfilledR.setColor(c);
        }
        else
        {
          FramedRect newframeR = new FramedRect(upleftC, this.getW(),this.getH(),canvas);
        }
    }
}

import objectdraw.*;
import java.awt.*;

public abstract class ARectangle extends Shape {
    private Point upperLeft;
  /* 
   * Name: Constructor  
   * Purpose: initialize the ARectangle
   * Parameters: none 
   */
    public ARectangle() 
    {
        super("ARectangle");
        this.setUpperLeft(new Point (0,0));
    }
  /* 
   * Name: Constructor  
   * Purpose: initialize the ARectangle
   * Parameters: String name, int x, int y 
   */
    public ARectangle(String name, int x, int y) 
    {
        super(name);
        this.setUpperLeft(new Point (x,y));
    }
  /* 
   * Name: Constructor  
   * Purpose: initialize the ARectangle
   * Parameters: string name Point upperleft 
   */
    public ARectangle(String name, Point upperLeft) {
        super(name);
        this.setUpperLeft(new Point(upperLeft.getX(), upperLeft.getY()));
    }
  /* 
   * Name: Constructor  
   * Purpose: deep copy the ARectangle
   * Parameters: ARectangle r
   */
    public ARectangle(ARectangle r) {
        super(r.getName());
        this.setUpperLeft(new Point(r.getUpperLeft()));
    }
  /* 
   * Name: getter  
   * Purpose: get upper left point
   * Parameters: none 
   */ 
    public Point getUpperLeft()
    {
      return this.upperLeft;
    }
  /* 
   * Name: setter  
   * Purpose: set upperleft point
   * Parameters: point ul 
   */ 
    private void setUpperLeft(Point ul)
    {
      this.upperLeft = ul;
    }
                              
  /* 
   * Name: move  
   * Purpose: shift the ARectangle
   * Parameters: int xDelta, int yDelta 
   */ 
    public void move(int xDelta, int yDelta) 
    {
      this.upperLeft = new Point (this.getUpperLeft().getX() + xDelta,
                                  this.getUpperLeft().getY() + yDelta);
        
    }
  /* 
   * Name: toString()  
   * Purpose: Print out the information for ARectangle
   * Parameters: none
   */ 
    @Override
    public String toString() 
    {
        return super.getName() + " and Upper Left Corner: " + upperLeft.toString();
    }
  /* 
   * Name: toString()  
   * Purpose: Print out the information for ARectangle
   * Parameters: none
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
    ARectangle checkAR = (ARectangle)o;
    if(this.getUpperLeft() == checkAR.getUpperLeft())
    {
      return true;
    }
    else
    {
      return false;
    }
    }

  /* 
   * Name: hashCode()  
   * Purpose: turn an integer that represents the object
   * Parameters: none
   */
  @Override
  public int hashCode() 
  {
    return this.toString().hashCode();
  }
}
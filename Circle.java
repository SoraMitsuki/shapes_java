import java.awt.*;
import objectdraw.*;

public class Circle extends Shape {
  private Point center;
  private int radius;
  /* 
   * Name: Constructor  
   * Purpose: initialize the circle
   * Parameters: none 
   */
  public Circle() 
  {
    super("Circle");
    this.setCenter(new Point (0,0));
    this.setRadius(0);
  }
  /* 
   * Name: Constructor  
   * Purpose: initialize the circle
   * Parameters: point center, int radius
   */
  public Circle(Point center, int radius) 
  {
    super("Circle");
    this.setCenter(center);
    this.setRadius(radius);
  }
  /* 
   * Name: Constructor  
   * Purpose: deep copy circle
   * Parameters: circle c
   */
  public Circle(Circle c) 
  {
    super(c.getName());
    this.setCenter(new Point(c.getCenter()));
    this.setRadius(c.getRadius());
  }
  /* 
   * Name: getter  
   * Purpose: get center point
   * Parameters: none 
   */    
  public Point getCenter()
  {
    return this.center;
  }
  /* 
   * Name: getter  
   * Purpose: get radius for clrcle
   * Parameters: none 
   */
  public int getRadius()
  {
    return this.radius;
  }
  
  /* 
   * Name: setter  
   * Purpose: set center point for circle
   * Parameters: Point c
   */    
  private void setCenter(Point c)
  {
    this.center = new Point(c);
  }
  /* 
   * Name: setter  
   * Purpose: set radius for circle
   * Parameters: int r
   */
  private void setRadius(int r)
  {
    this.radius = r;
  }
  /* 
   * Name: move  
   * Purpose: shift the circle
   * Parameters: int xDelta, int yDelta
   */
  public void move(int xDelta, int yDelta) {
    this.setCenter(new Point(this.getCenter().getX() + xDelta,
                             this.getCenter().getY() + yDelta));
  }
  
  /* 
   * Name: toString  
   * Purpose: print the information of circle
   * Parameters: none
   */
  @Override
  public String toString() {
    return super.getName() + "is Center: " + this.getCenter().toString() 
      + "and Radius: " + this.getRadius();
  }
  
  /* 
   * Name: equals()  
   * Purpose: compare circle with object
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
    Circle checkC = (Circle)o;
    if(this.getCenter().equals(checkC.getCenter()) && this.getRadius() == checkC.getRadius())
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
  /* 
   * Name: draw()  
   * Purpose: draw a filled circle or framed circle
   * Parameters: DrawingCanvas canvas, Color c, boolean fill
   */
  public void draw(DrawingCanvas canvas, Color c, boolean fill) 
  {  
    Location center = new Location(this.center.getX()- this.getRadius(), 
                                   this.center.getY()- this.getRadius()); //create a location veriable for oval
      if(fill == true)
    {
      FilledOval newfilled = new FilledOval(center, this.getRadius()*2,this.getRadius()*2, canvas);
      newfilled.setColor(c);
    }
    else
    {
      FramedOval newframe = new FramedOval(center,this.getRadius()*2 ,this.getRadius()*2, canvas);
    }
  }
}

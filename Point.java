import java.awt.*;

public class Point {
    private int x;
    private int y;

  /* 
   * Name: Constructor  
   * Purpose: initialize point
   * Parameters: none 
   */
    public Point() 
    {
     this.setX(0);
     this.setY(0);
    }
    
  /* 
   * Name: Constructor  
   * Purpose: initialize point
   * Parameters: int x and int y 
   */
    public Point(int x, int y) 
    {
      this.setX(x);
      this.setY(y);
    }
    
  /* 
   * Name: Constructor  
   * Purpose: copy point
   * Parameters: Point point obejct 
   */
    public Point(Point point) 
    {
      this.setX(point.getX());
      this.setY(point.getY());
    }
  /* 
   * Name: getter  
   * Purpose: get value of x
   * Parameters: int x 
   */
    public int getX()
    {
      return this.x;
    }
  /* 
   * Name: getter  
   * Purpose: get value of y
   * Parameters: none 
   */
    public int getY()
    {
      return this.y;
    }
    
  /* 
   * Name: setter  
   * Purpose: set value of x
   * Parameters: none 
   */    
    private void setX(int x)
    {
      this.x = x;
    }
  /* 
   * Name: setter  
   * Purpose: set value of y
   * Parameters: int y
   */
    private void setY(int y)
    {
      this.y = y;
    }
    
  /* 
   * Name: move  
   * Purpose: move the point to new position
   * Parameters: int xDelta, int yDelta 
   */
    public void move(int xDelta, int yDelta) 
    {
        this.setX(this.getX() + xDelta);
        this.setY(this.getY() + yDelta);
    }

  /* 
   * Name: toSteing()  
   * Purpose: Print out the data in correct format
   * Parameters: none
   */
    @Override
    public String toString() 
    {
        return "Point: (" + this.getX() + "," + this.getY() + ")";
    }

  /* 
   * Name: equal()  
   * Purpose: check two objects are the same or not
   * Parameters: Object o 
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
        Point checkP = (Point)o;
        if(this.getX() == checkP.getX() && this.getY() == checkP.getY())
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
   * Purpose: turns an integer that represents the object
   * Parameters: none
   */
    @Override
    public int hashCode() 
    {
        return this.toString().hashCode();
    }
    
    
}//end of point class

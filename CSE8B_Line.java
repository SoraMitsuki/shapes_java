import java.awt.*;
import objectdraw.*;

public class CSE8B_Line extends Shape {
    private Point start;
    private Point end;

  /* 
   * Name: Constructor  
   * Purpose: initialize the line
   * Parameters: none 
   */
    public CSE8B_Line() 
    {
      super("CSE8B_Line");
      this.setS(new Point(0,0));
      this.setE(new Point(0,0));
    }

  /* 
   * Name: Constructor  
   * Purpose: initialize the line
   * Parameters: Point start, Point end 
   */
    public CSE8B_Line(Point start, Point end) 
    {
        super("CSE8B_Line");
        this.setS(start);
        this.setE(end);
    }

  /* 
   * Name: Constructor  
   * Purpose: deep copy of the line
   * Parameters: none 
   */
    public CSE8B_Line(CSE8B_Line line) 
    {
        super(line.getName());
        this.setS(new Point(line.getS()));
        this.setE(new Point(line.getE()));
    }
  /* 
   * Name: getter  
   * Purpose: get start point
   * Parameters: none 
   */
    public Point getS()
    {
      return this.start;
    }
  /* 
   * Name: getter  
   * Purpose: get end point
   * Parameters: none 
   */
    public Point getE()
    {
      return this.end;
    }
  /* 
   * Name: setter  
   * Purpose: set start point
   * Parameters: Point s (s stand for start)
   */
    private Point setS(Point s)
    {
      return this.start = s;
    }
  /* 
   * Name: setter  
   * Purpose: set end point
   * Parameters: Point e (e for end) 
   */
    private Point setE(Point e)
    {
      return this.end = e;
    }

  /* 
   * Name: move  
   * Purpose: move the line by delta
   * Parameters: int xdelta, int ydelta 
   */
    public void move(int xDelta, int yDelta) 
    {
      Point sP = new Point(this.getS().getX() + xDelta,
                           this.getS().getY() + yDelta);
      Point eP = new Point(this.getE().getX() + xDelta,
                           this.getE().getY() + yDelta);
      this.setS(sP);
      this.setE(eP);
        
    }
  /* 
   * Name: toString()  
   * Purpose: print the name of the object and position
   * Parameters: none
   */
    @Override
    public String toString() 
    {
        return super.getName() + ": " + getS().toString() + "," + getE().toString();
    }
  /* 
   * Name: equals()  
   * Purpose: check for two lines are they same
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
        CSE8B_Line checkL = (CSE8B_Line)o;
        if(this.getS() == checkL.getS() && this.getE() == checkL.getE())
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
    public int hashCode() {
        return this.toString().hashCode();
    }

  /* 
   * Name: draw()  
   * Purpose: draw out the object with color
   * Parameters: DrawingCanvas cancas, Color c, boolean fill
   * line is always filled, or it is hollow line
   */
    public void draw(DrawingCanvas canvas, Color c, boolean fill) 
    {
        Line drawL = new Line(this.getS().getX(), this.getS().getY(),
                              this.getE().getX(), this. getE().getY(), canvas);
        if(c == null)
        {
          drawL.setColor(Color.BLACK);
        }
        else
        {
          drawL.setColor(c);
        }
    }
}

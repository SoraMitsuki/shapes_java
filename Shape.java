import java.awt.*;
import objectdraw.*;

public abstract class Shape {
    private String name;
  /* 
   * Name: Constructor  
   * Purpose: set name for shape
   * Parameters: none 
   */
    public Shape() 
    {
        this.setName("Shape");
    }
  /* 
   * Name: Constructor  
   * Purpose: set name for shape
   * Parameters: String name
   */
    public Shape(String name) {
        this.setName(name);
    }
  /* 
   * Name: getter  
   * Purpose: get name for shape
   * Parameters: none 
   */
    public String getName() 
    {
        return name;
    }
  /* 
   * Name: setter  
   * Purpose: set name for shape
   * Parameters: String name
   */
    private void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        String s = "\n**********************************************************\n"
                + "This should never print. If it does print, then\n"
                + "you did not override equals() properly in class "
                + this.getClass().getName() + "\n"
                + "**********************************************************\n";

        System.out.println(s);

        return this == o;
    }

    public abstract void move(int xDelta, int yDelta);

    public abstract void draw(DrawingCanvas canvas, Color c, boolean fill);
}

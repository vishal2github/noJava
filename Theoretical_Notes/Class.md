# CLASS

### Defining class for object

+ The following steps are followed in order to define a class:
  + Define instance variable inside class
  + Define constructors
  + Define methods(specially getters and setters)

```
  public class Point
  {
    // Defining instance variable
    int x;
    int y;

    // Defining constructor
    public Point(int a,int b)
    {
  	this.x=a;
  	this.y=b;	
    }

    // Defining methods
    public int getX()
    {
  	return this.x;
    }

    public void setX(int a)
    {
  	this.x=a;
    }

    public int getY()
    {
  	return this.y;
    }

    public void setY(int a)
    {
  	this.y=a;
    }
  }
```

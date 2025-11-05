import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(double initWidth, double initHeight) {
        width = initWidth;
        height = initHeight;
    }
    public double getWidth() {
        return this.width;
        // getter for width
    }

    public double getHeight() {
        return this.height;
        // getter for height 
    }
    public void setWidth(double initWidth) {
        this.width = initWidth;
    }
    public void setHeight(double initHeight) { 
        this.height = initHeight;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2*width + 2*height;
    }

    public boolean getIsSquare() {
        return width == height;
    }
    public void drawRec() {
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setPenRadius(0.1);
        StdDraw.rectangle(0.5, 0.5, width/2, height/2);
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(34.0, 45.0);
        System.out.println(rec1.getArea());
        rec1.drawRec();
    }

}


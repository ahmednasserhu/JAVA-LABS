import java.util.*;
public class Main {

    static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        // Create ArrayList of Rectangle and Circle
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Circle());

        // Test the generic method with lists of different shapes
        System.out.println("Drawing Rectangles:");
        drawShapes(rectangles);

        System.out.println("\nDrawing Circles:");
        drawShapes(circles);
    }
}
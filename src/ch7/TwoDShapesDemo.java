package ch7;
/*Создайте подкласс Circle, производный от класса TwoDShape. В нем должен
быть определен метод area (), вычисляющий площадь круга, а также конструктор
с ключевым словом super для инициализации членов, унаследованных от класса
TwoDShape.*/
public class TwoDShapesDemo {
    public static void main(String[] args) {

        TwoDShapes[] shapes = {
                new Triangle("painted", 18, 13),
                new Rectangle(9),
                new Circle(6),
        };
        for (TwoDShapes x : shapes) x.showInfo();

    }
}

abstract class TwoDShapes {
    private double width;
    private double height;
    private String name;

    TwoDShapes() {
        width = 0;
        height = 0;
        name = "none";
    }

    TwoDShapes(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    TwoDShapes(double x, String name) {
        width = height = x;
        this.name = name;
    }

    TwoDShapes(TwoDShapes copy) {
        this.width = copy.width;
        this.height = copy.height;
        this.name = copy.name;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    String getName() {
        return name;
    }

    String getDim() {
        return ("\nWidth - " + width +
                "\nHeight - " + height);
    }

    abstract void showInfo();

    abstract double area();
}

class Triangle extends TwoDShapes {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(String style, double width, double height) {
        super(width, height, "Triangle");
        this.style = style;
    }

    Triangle(double x) {
        super(x, "Triangle");
        style = "painted";
    }

    Triangle(Triangle copy) {
        super(copy);
        this.style = copy.style;
    }

    double area() {
        return ((getWidth() * getHeight()) / 2);
    }

    void showInfo() {
        System.out.println("Triangle info: " + style + getDim() + "\nTriangle area - " + area() + "\n");
    }
}

class Rectangle extends TwoDShapes {

    Rectangle() {
        super();
    }

    Rectangle(double width, double height) {
        super(width, height, "Rectangle");
    }

    Rectangle(double x) {
        super(x, "Square");
    }

    double area() {
        return (getWidth() * getHeight());
    }

    void showInfo() {
        System.out.println("Rectangle info: " + getDim() + "\nRectangle area - " + area() + "\n");
    }
}

class Circle extends TwoDShapes {
    private double rad;

    Circle() {
        super();
        rad = 0;
    }

    Circle(double rad) {
        super(rad * 2, "circle");
        this.rad = rad;
    }

    Circle(Circle copy) {
        super(copy);

        this.rad = copy.rad;
    }

    double area() {
        return rad * rad * 3.14;
    }

    String getDim() {
        return ("\nCircle radius = " + rad);
    }

    void showInfo() {
        System.out.println("Circle info: " + getDim() + "\nCircle area - " + area() + "\n");
    }
}

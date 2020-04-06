public class Circle implements Figure {

    private String color;
    private double area;
    private int radius;

    public Circle() {
    }

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public Figure draw() {
        return createRandomCircle();
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    private Figure createRandomCircle() {
        String[] colors = {"green", "blue", "yellow", "black"};
        int indexColor = (int) (Math.random() * 3);
        return new Circle(colors[indexColor], (int) (Math.random() * 50) + 1);
    }

    @Override
    public String toString() {
        return String.format("Figure : circle, area : %.1f square units,"
                        + "radius : %d units, color : %s",
                getArea(), getRadius(), getColor());
    }
}

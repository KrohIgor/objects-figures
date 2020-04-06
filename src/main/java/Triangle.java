public class Triangle implements Figure {

    private String color;
    private double area;
    private int legFirst;
    private int legSecond;
    private double hypotenuse;

    public Triangle() {
    }

    private Triangle(String color, int legFirst, int legSecond) {
        this.color = color;
        this.legFirst = legFirst;
        this.legSecond = legSecond;
        area = legFirst * legSecond / 2;
        hypotenuse = Math.sqrt(Math.pow(legFirst, 2) + Math.pow(legSecond, 2));
    }

    public Figure draw() {
        return createRandomTriangle();
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public int getLegFirst() {
        return legFirst;
    }

    public int getLegSecond() {
        return legSecond;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    private Figure createRandomTriangle() {
        String[] colors = {"green", "blue", "yellow", "black"};
        int indexColor = (int) (Math.random() * 3);
        return new Triangle(colors[indexColor], (int) (Math.random() * 50) + 1,
                (int) (Math.random() * 50) + 1);
    }

    @Override
    public String toString() {
        return String.format("Figure : triangle, area : %.1f square units,"
                        + "legFirst : %d units, legSecond : %d units,"
                        + "hypotenuse : %.1f units, color : %s",
                getArea(), getLegFirst(), getLegSecond(), getHypotenuse(), getColor());
    }
}

public class Circle extends Figure {

    private int radius;

    public Circle() {
        createRandomFigure();
    }

    public Circle(String color, int radius) {
        this.radius = radius;
        setArea(areaCalculation(radius));
        setColor(color);
    }

    public int getRadius() {
        return radius;
    }

    public void createRandomFigure() {
        String[] colors = {"green", "blue", "yellow", "black"};
        int indexColor = (int) (Math.random() * 4);
        setColor(colors[indexColor]);
        radius = (int) (Math.random() * 50) + 1;
        setArea(areaCalculation(radius));
    }

    @Override
    public String draw() {
        return String.format("Figure : circle, area : %.1f square units, "
                        + "radius : %d units, color : %s",
                getArea(), getRadius(), getColor());
    }

    private double areaCalculation(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}

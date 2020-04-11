public abstract class Figure {

    private String color;
    private double area;

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract String draw();

    public double getArea() {
        return area;
    }

    public abstract void createRandomFigure();

    public String getColor() {
        return color;
    }
}

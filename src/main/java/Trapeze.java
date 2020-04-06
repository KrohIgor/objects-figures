public class Trapeze implements Figure {

    private String color;
    private double area;
    private int upperSide;
    private int downSide;
    private int height;

    public Trapeze() {
    }

    public Trapeze(String color, int upperSide, int downSide, int height) {
        this.color = color;
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
        area = (upperSide + downSide) / 2 * height;
    }

    public Figure draw() {
        return createRandomTrapeze();
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public int getUpperSide() {
        return upperSide;
    }

    public int getDownSide() {
        return downSide;
    }

    public int getHeight() {
        return height;
    }

    private Figure createRandomTrapeze() {
        String[] colors = {"green", "blue", "yellow", "black"};
        int indexColor = (int) (Math.random() * 3);
        return new Trapeze(colors[indexColor], (int) (Math.random() * 50) + 1,
                (int) (Math.random() * 50) + 1, (int) (Math.random() * 50) + 1);
    }

    @Override
    public String toString() {
        return String.format("Figure : trapeze, area : %.1f square units, upperSide"
                        + ": %d units, downSide : %d units, height : %d units,  color : %s",
                getArea(), getUpperSide(), getDownSide(), getHeight(), getColor());
    }
}

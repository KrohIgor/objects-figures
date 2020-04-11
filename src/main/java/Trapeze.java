public class Trapeze extends Figure {

    private int upperSide;
    private int downSide;
    private int height;

    public Trapeze() {
        createRandomFigure();
    }

    public Trapeze(String color, int upperSide, int downSide, int height) {
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
        setArea(areaCalculation(upperSide, downSide, height));
        setColor(color);
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

    public void createRandomFigure() {
        String[] colors = {"green", "blue", "yellow", "black"};
        int indexColor = (int) (Math.random() * 4);
        setColor(colors[indexColor]);
        upperSide = (int) (Math.random() * 50) + 1;
        downSide = (int) (Math.random() * 50) + 1;
        height = (int) (Math.random() * 50) + 1;
        setArea(areaCalculation(upperSide, downSide, height));
    }

    @Override
    public String draw() {
        return String.format("Figure : trapeze, area : %.1f square units, upperSide "
                        + ": %d units, downSide : %d units, height : %d units,  color : %s",
                getArea(), getUpperSide(), getDownSide(), getHeight(), getColor());
    }

    private double areaCalculation(int upperSide, int downSide, int height) {
        return (double) (upperSide + downSide) / 2 * height;
    }
}

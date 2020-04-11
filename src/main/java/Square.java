public class Square extends Figure {

    private int side;

    public Square() {
        createRandomFigure();
    }

    public Square(String color, int side) {
        this.side = side;
        setColor(color);
        setArea(areaCalculation(side));
    }

    public int getSide() {
        return side;
    }

    public void createRandomFigure() {
        String[] colors = {"green", "blue", "yellow", "black"};
        int indexColor = (int) (Math.random() * 4);
        setColor(colors[indexColor]);
        side = (int) (Math.random() * 50) + 1;
        setArea(areaCalculation(side));
    }

    @Override
    public String draw() {
        return String.format("Figure : square, area : %.1f square units, side "
                        + ": %d units, color : %s",
                getArea(), getSide(), getColor());
    }

    private double areaCalculation(int side) {
        return Math.pow(side, 2);
    }
}

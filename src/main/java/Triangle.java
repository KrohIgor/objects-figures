public class Triangle extends Figure {

    private int legFirst;
    private int legSecond;
    private double hypotenuse;

    public Triangle() {
        createRandomFigure();
    }

    public Triangle(String color, int legFirst, int legSecond) {
        this.legFirst = legFirst;
        this.legSecond = legSecond;
        hypotenuse = hypotenuseCalculation(legFirst, legSecond);
        setArea(areaCalculation(legFirst, legSecond));
        setColor(color);
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

    public void createRandomFigure() {
        String[] colors = {"green", "blue", "yellow", "black"};
        int indexColor = (int) (Math.random() * 4);
        setColor(colors[indexColor]);
        legFirst = (int) (Math.random() * 50) + 1;
        legSecond = (int) (Math.random() * 50) + 1;
        hypotenuse = hypotenuseCalculation(legFirst, legSecond);
        setArea(areaCalculation(legFirst, legSecond));
    }

    @Override
    public String draw() {
        return String.format("Figure : triangle, area : %.1f square units, "
                        + "legFirst : %d units, legSecond : %d units, "
                        + "hypotenuse : %.1f units, color : %s",
                getArea(), getLegFirst(), getLegSecond(), getHypotenuse(), getColor());
    }

    private double hypotenuseCalculation(int legFirst, int legSecond) {
        return Math.sqrt(Math.pow(legFirst, 2) + Math.pow(legSecond, 2));
    }

    private double areaCalculation(int legFirst, int legSecond) {
        return (double) legFirst * legSecond / 2;
    }
}

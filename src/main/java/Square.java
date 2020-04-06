public class Square implements Figure {

    private String color;
    private int area;
    private int side;

    public Square() {
    }

    private Square(String color, int side) {
        this.color = color;
        this.side = side;
        area = side * side;
    }

    public Figure draw() {
        return createRandomSquare();
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public int getSide() {
        return side;
    }

    private Figure createRandomSquare() {
        String[] colors = {"green", "blue", "yellow", "black"};
        int indexColor = (int) (Math.random() * 3);
        return new Square(colors[indexColor], (int) (Math.random() * 50) + 1);
    }

    @Override
    public String toString() {
        return String.format("Figure : square, area : %d square units, side : %d units, color : %s",
                area, getSide(), getColor());
    }
}

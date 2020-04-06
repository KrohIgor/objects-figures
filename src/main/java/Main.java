public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[20];
        for (int i = 0; i < figures.length; i++) {
            if (i % 4 == 0) {
                Figure square = new Square().draw();
                figures[i] = square;
            }
            if (i % 4 == 1) {
                Figure triangle = new Triangle().draw();
                figures[i] = triangle;
            }
            if (i % 4 == 2) {
                Figure circle = new Circle().draw();
                figures[i] = circle;
            }
            if (i % 4 == 3) {
                Figure trapeze = new Trapeze().draw();
                figures[i] = trapeze;
            }
        }
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }
}

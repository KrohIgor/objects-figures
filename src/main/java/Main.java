public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[20];
        for (int i = 0; i < figures.length; i++) {
            Figure figure = null;
            if (i % 4 == 0) {
                figure = new Square();
            }
            if (i % 4 == 1) {
                figure = new Triangle();
            }
            if (i % 4 == 2) {
                figure = new Circle();
            }
            if (i % 4 == 3) {
                figure = new Trapeze();
            }
            figures[i] = figure;
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}

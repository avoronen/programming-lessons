public class Main23 {

    public static void main(String[] args) {

        Polygon[] polygons = new Polygon[3];



        for (int i = 0; i < 3; i++) {
            polygons[i] = new Polygon();

            polygons[i].perimeter = polygons[i].showPerimeter();

            polygons[i].showPerimeter();

        }
    }
}



public class Main23 {

    public static void main(String[] args) {

        Polygon[] polygons = new Polygon[3];
        int[] sidelength = {3,4,5};

        polygons[0] = new Polygon(3, sidelength);

        polygons[1] = new Polygon(3, 5);

        polygons[2] = new Polygon();

        polygons[0].showPerimeter();
        polygons[1].showPerimeter();
        polygons[2].showPerimeter();




        }
    }


public class Polygon {

    int perimeter;

    int sides = 3;

    int[] array;

    int sidelength;


    public int Polygon(int sides, int[] array) {

        this.sides = 3;

        this.array = new int[]{3, 4, 5};

        return perimeter;

    }

    public int Polygon2(int sides, int sidelength) {

        this.sides = 4;
        this.sidelength = 5;

        return perimeter;
    }


    public void String() {

        System.out.println("Многоугольник не определен");
    }


    int showPerimeter() {

        if (sides == 4) {

            perimeter = sides * sidelength;

       } else if (sides == 3) {
                perimeter = 3 + 4 +5;
            } else {

                System.out.println("Периметр неизвестен");
            }




        return perimeter;

    }


    }


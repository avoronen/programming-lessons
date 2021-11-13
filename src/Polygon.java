public class Polygon {

    int perimeter;

    int sides;

    int[] array;

    int sidelength;


    public Polygon(int sides, int[] array) {

        this.sides = 3;

        this.array = new int[]{3, 4, 5};


    }

    public Polygon(int sides, int sidelength) {

        this.sides = 3;
        this.sidelength = 5;

    }


    public Polygon() {

        System.out.println("Многоугольник не определен");
    }


    int showPerimeter() {

        if (sides >= 3 && array != null) {
            for(int i = 0; i < 3; i++) {

                perimeter += array[i];

            }

        } else if(sidelength != 0) {

            perimeter = sides * sidelength;

        } else {
            System.out.println("Периметр неизвестен");
        }

        System.out.println(perimeter);

        return perimeter;

    }


    }


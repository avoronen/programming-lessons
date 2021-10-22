public class Circle {

        double square;

        static double pi = 3.14;

        int r;

        public Circle (int radius) {
            r = radius;

        }

    double showSquare() {

            square = pi * (r * r);

        System.out.println("Площадь " + square);

        return square;
        }
    }




public class Counting {


    public static double calculateExpression(String str) throws NotRightFormatException, OtherLengthException, NonTwoDigitNumberException {

        String[] str1 = str.split(" ");


        try {

            int a = Integer.parseInt(str1[0]);
            int b = Integer.parseInt(str1[2]);

            if ((str1[0].length() != 2) && (str1[2].length() != 2)) {
                throw new NonTwoDigitNumberException("Число не двузначное");

            }

            if (str.length() != 7) {
                throw new OtherLengthException("Другая длина строки");

            }

            switch (str1[1].charAt(0)) {

                case '+':
                    return a + b;

                case '-':
                    return a - b;

                case '*':
                    return a * b;

                case '/':
                    return a / b;

                default:
                    return 0;
            }

        } catch (NumberFormatException e) {

            throw new NotRightFormatException("Неправильный формат");

        }

    }

}













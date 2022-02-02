import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Names {

    public static void main(String[] args) {

        String s;

        String[] a = new String[100];
        String[] b = new String[100];

        int indexA = -1;
        int indexB = -1;


        try (BufferedReader e = new BufferedReader( new FileReader ("C:\\Users\\avoronen\\Documents\\names.txt"))) {
            s = e.readLine();

            while(e.readLine() !=null) {

                if (s.endsWith("a")) {
                    indexA++;
                    a[indexA] = s;
                    s.substring(s.length() - 1);



                } else if (s.endsWith("b")) {
                    indexB++;
                    b[indexB] = s;
                    s.substring(s.length() - 1);
                }
                System.out.println(e.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }





    }




}

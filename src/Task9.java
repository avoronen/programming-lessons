import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Task9 {
    public static void main(String[] args) {

        String name1 = "Иван";
        String surname1 = "Иванов";
        String patronymic1 = "Иванович";

        String name2 = "Петр";
        String surname2 = "Иванов";
        String patronymic2 = "Петрович";

        if (((name1 == name2)) && (surname1 == surname2) && (patronymic1 == patronymic2)) {
            System.out.println("Полные тезки");


        } else if ((name1 == name2)) {
            System.out.println("Тезки");

        }  else if ((surname1 == surname2)) {
                System.out.println("Однофамильцы");


            }


        }

    }


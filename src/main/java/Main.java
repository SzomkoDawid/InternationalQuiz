import england.EnglandView;
import germany.GermanyView;
import poland.PolandView;

import java.util.Scanner;

public class Main {

    private static EnglandView englandView = new EnglandView();
    private static GermanyView germanyView = new GermanyView();
    private static PolandView polandView = new PolandView();

    public static void main(String[] args) {
        Main main = new Main();
        main.starterQuiz();
    }
    private void starterQuiz() {
        boolean finish = false;
        try (Scanner scanner = new Scanner(System.in)) {
            while (!finish) {
                System.out.println("WELCOME ON THE GEOGRAPHICAL QUIZ");
                System.out.println("##################################");
                System.out.println("Select one of the following countries: ");
                System.out.println("England - PRESS 1");
                System.out.println("Poland - PRESS 2");
                System.out.println("Germany - PRESS 3");
                System.out.println("##################################");
                System.out.println("Exit - PRESS 0");
                int select = scanner.nextInt();
                switch (select) {
                    case 1:
                        englandView.mainView();
                        break;
                    case 2:
                        polandView.mainView();
                        break;
                    case 3:
                        germanyView.mainView();
                        break;
                    case 0:
                        finish = true;
                        break;
                    default:
                        System.out.println("Command not found");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
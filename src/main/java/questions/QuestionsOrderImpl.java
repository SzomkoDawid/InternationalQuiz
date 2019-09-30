package questions;
import java.util.Map;


public class QuestionsOrderImpl extends QuestionsOrder {

    public void firstQuestion() throws InterruptedException {
        QuestionImpl question = new QuestionImpl();
        for (Map.Entry<Integer, String> map : question.questions().entrySet()) {
            if (map.getKey().equals(1)) {
                sleepOfStartQuestion();
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
    }
    public void secondQuestion() throws InterruptedException {
        QuestionImpl question = new QuestionImpl();
        for (Map.Entry<Integer, String> map : question.questions().entrySet()) {
            if (map.getKey().equals(2)) {
                sleepOfStartQuestion();
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
    }
    public void thirdQuestion() throws InterruptedException {
        QuestionImpl question = new QuestionImpl();
        for (Map.Entry<Integer, String> map : question.questions().entrySet()) {
            if (map.getKey().equals(3)) {
                sleepOfStartQuestion();
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
    }


    public void fourthQuestion() throws InterruptedException {
        QuestionImpl question = new QuestionImpl();
        for (Map.Entry<Integer, String> map : question.questions().entrySet()) {
            if (map.getKey().equals(4)) {
                sleepOfStartQuestion();
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
    }


    public void fifthQuestion() throws InterruptedException {
        QuestionImpl question = new QuestionImpl();
        for (Map.Entry<Integer, String> map : question.questions().entrySet()) {
            if (map.getKey().equals(5)) {
                sleepOfStartQuestion();
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
    }


    public void sixthQuestion() throws InterruptedException {
        QuestionImpl question = new QuestionImpl();
        for (Map.Entry<Integer, String> map : question.questions().entrySet()) {
            if (map.getKey().equals(6)) {
                sleepOfStartQuestion();
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
    }


    public void seventhQuestion() throws InterruptedException {
        QuestionImpl question = new QuestionImpl();
        for (Map.Entry<Integer, String> map : question.questions().entrySet()) {
            if (map.getKey().equals(7)) {
                sleepOfStartQuestion();
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
    }


    public void eighthQuestion() throws InterruptedException {
        QuestionImpl question = new QuestionImpl();
        for (Map.Entry<Integer, String> map : question.questions().entrySet()) {
            if (map.getKey().equals(8)) {
                sleepOfStartQuestion();
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
    }


    public void ninthQuestion() throws InterruptedException {
        QuestionImpl question = new QuestionImpl();
        for (Map.Entry<Integer, String> map : question.questions().entrySet()) {
            if (map.getKey().equals(9)) {
                sleepOfStartQuestion();
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
    }


    public void tenthQuestion() throws InterruptedException {
        QuestionImpl question = new QuestionImpl();
        for (Map.Entry<Integer, String> map : question.questions().entrySet()) {
            if (map.getKey().equals(10)) {
                sleepOfStartQuestion();
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
    }

    public void sleepOfStartQuestion() throws InterruptedException {
        Thread.sleep(2000);
    }
}

package poland;

import questions.QuestionsOrderImpl;
import views.Countries;
import views.Details;

public class PolandView {

    private static final QuestionsOrderImpl QUESTIONS_ORDER = new QuestionsOrderImpl();
    private static final Countries COUNTRIES = new Countries();
    private static final Details DETAILS = new Details();
    private static final PolandAnswersViewImpl POLAND_ANSWERS_VIEW = new PolandAnswersViewImpl();
    private static final PolandVariantsViewImpl POLAND_VARIANTS_VIEW = new PolandVariantsViewImpl();

    public void mainView() throws InterruptedException {
        System.out.println("Your choice is : " + COUNTRIES.polandObject().getName().toUpperCase());
        DETAILS.rules();

        QUESTIONS_ORDER.firstQuestion();
        POLAND_VARIANTS_VIEW.capitalVariants();
        System.out.println("Enter your answer: ");
        System.out.println(POLAND_ANSWERS_VIEW.capitalCorrectAnswer());

        QUESTIONS_ORDER.secondQuestion();
        POLAND_VARIANTS_VIEW.populationVariants();
        System.out.println("Enter your answer: ");
        System.out.println(POLAND_ANSWERS_VIEW.populationCorrectAnswer());

        QUESTIONS_ORDER.thirdQuestion();
        POLAND_VARIANTS_VIEW.nationalDishVariants();
        System.out.println("Enter your answer: ");
        System.out.println(POLAND_ANSWERS_VIEW.nationalDishCorrectAnswer());

        QUESTIONS_ORDER.fourthQuestion();
        POLAND_VARIANTS_VIEW.colorsOfFlagVariants();
        System.out.println("Enter your answer: ");
        System.out.println(POLAND_ANSWERS_VIEW.colorsOfFlagAnswer());

        QUESTIONS_ORDER.fifthQuestion();
        POLAND_VARIANTS_VIEW.primeMinisterVariants();
        System.out.println("Enter your answer: ");
        System.out.println(POLAND_ANSWERS_VIEW.primeMinisterAnswer());

        QUESTIONS_ORDER.sixthQuestion();
        POLAND_VARIANTS_VIEW.currencyVariants();
        System.out.println("Enter your answer: ");
        System.out.println(POLAND_ANSWERS_VIEW.currencyAnswer());

        QUESTIONS_ORDER.seventhQuestion();
        POLAND_VARIANTS_VIEW.neighbourhoodVariants();
        System.out.println("Enter your answer: ");
        System.out.println(POLAND_ANSWERS_VIEW.neighbourhoodAnswer());

        QUESTIONS_ORDER.eighthQuestion();
        POLAND_VARIANTS_VIEW.alcoholVariants();
        System.out.println("Enter your answer: ");
        System.out.println(POLAND_ANSWERS_VIEW.alcoholAnswer());

        QUESTIONS_ORDER.ninthQuestion();
        POLAND_VARIANTS_VIEW.politicalSystemVariants();
        System.out.println("Enter your answer: ");
        System.out.println(POLAND_ANSWERS_VIEW.politicalSystemAnswer());

        QUESTIONS_ORDER.tenthQuestion();
        POLAND_VARIANTS_VIEW.monumentsVariants();
        System.out.println("Enter your answer: ");
        System.out.println(POLAND_ANSWERS_VIEW.monumentsAnswer());

        System.out.println("Wait for your result...");
        Thread.sleep(2000);
        System.out.println(POLAND_ANSWERS_VIEW.result());
        POLAND_ANSWERS_VIEW.rating();
        System.out.println("Try again!");

    }
}

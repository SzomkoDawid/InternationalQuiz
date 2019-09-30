package germany;

import questions.QuestionsOrderImpl;
import views.Countries;
import views.Details;
public class GermanyView {

    private static final QuestionsOrderImpl QUESTIONS_ORDER = new QuestionsOrderImpl();
    private static final Countries COUNTRIES = new Countries();
    private static final Details DETAILS = new Details();
    private static final GermanyAnswersViewImpl GERMANY_ANSWERS_VIEW = new GermanyAnswersViewImpl();
    private static final GermanyVariantsViewImpl GERMANY_VARIANTS_VIEW = new GermanyVariantsViewImpl();


    public void mainView() throws InterruptedException {
        System.out.println("Your choice is : " + COUNTRIES.germanyObject().getName().toUpperCase());
        DETAILS.rules();

        QUESTIONS_ORDER.firstQuestion();
        GERMANY_VARIANTS_VIEW.capitalVariants();
        System.out.println("Enter your answer: ");
        System.out.println(GERMANY_ANSWERS_VIEW.capitalCorrectAnswer());

        QUESTIONS_ORDER.secondQuestion();
        GERMANY_VARIANTS_VIEW.populationVariants();
        System.out.println("Enter your answer: ");
        System.out.println(GERMANY_ANSWERS_VIEW.populationCorrectAnswer());

        QUESTIONS_ORDER.thirdQuestion();
        GERMANY_VARIANTS_VIEW.nationalDishVariants();
        System.out.println("Enter your answer: ");
        System.out.println(GERMANY_ANSWERS_VIEW.nationalDishCorrectAnswer());

        QUESTIONS_ORDER.fourthQuestion();
        GERMANY_VARIANTS_VIEW.colorsOfFlagVariants();
        System.out.println("Enter your answer: ");
        System.out.println(GERMANY_ANSWERS_VIEW.colorsOfFlagAnswer());

        QUESTIONS_ORDER.fifthQuestion();
        GERMANY_VARIANTS_VIEW.primeMinisterVariants();
        System.out.println("Enter your answer: ");
        System.out.println(GERMANY_ANSWERS_VIEW.primeMinisterAnswer());

        QUESTIONS_ORDER.sixthQuestion();
        GERMANY_VARIANTS_VIEW.currencyVariants();
        System.out.println("Enter your answer: ");
        System.out.println(GERMANY_ANSWERS_VIEW.currencyAnswer());

        QUESTIONS_ORDER.seventhQuestion();
        GERMANY_VARIANTS_VIEW.neighbourhoodVariants();
        System.out.println("Enter your answer: ");
        System.out.println(GERMANY_ANSWERS_VIEW.neighbourhoodAnswer());

        QUESTIONS_ORDER.eighthQuestion();
        GERMANY_VARIANTS_VIEW.alcoholVariants();
        System.out.println("Enter your answer: ");
        System.out.println(GERMANY_ANSWERS_VIEW.alcoholAnswer());

        QUESTIONS_ORDER.ninthQuestion();
        GERMANY_VARIANTS_VIEW.politicalSystemVariants();
        System.out.println("Enter your answer: ");
        System.out.println(GERMANY_ANSWERS_VIEW.politicalSystemAnswer());

        QUESTIONS_ORDER.tenthQuestion();
        GERMANY_VARIANTS_VIEW.monumentsVariants();
        System.out.println("Enter your answer: ");
        System.out.println(GERMANY_ANSWERS_VIEW.monumentsAnswer());

        System.out.println("Wait for your result...");
        Thread.sleep(2000);
        System.out.println(GERMANY_ANSWERS_VIEW.result());
        GERMANY_ANSWERS_VIEW.rating();
        System.out.println("Try again!");

    }
}

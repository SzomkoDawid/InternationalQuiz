package england;
import questions.QuestionsOrderImpl;
import views.Countries;
import views.Details;

public class EnglandView {

    private static final QuestionsOrderImpl QUESTIONS_ORDER = new QuestionsOrderImpl();
    private static final Countries COUNTRIES = new Countries();
    private static final Details DETAILS = new Details();
    private static final EnglandVariantsViewImpl ENGLAND_VARIANTS_VIEW = new EnglandVariantsViewImpl();
    private static final EnglandAnswersViewImpl ENGLAND_ANSWERS_VIEW = new EnglandAnswersViewImpl();

    public void mainView() throws InterruptedException {

        System.out.println("Your choice is : " + COUNTRIES.englandObject().getName().toUpperCase());
        DETAILS.rules();

        QUESTIONS_ORDER.firstQuestion();
        ENGLAND_VARIANTS_VIEW.capitalVariants();
        System.out.println("Enter your answer: ");
        System.out.println(ENGLAND_ANSWERS_VIEW.capitalCorrectAnswer());

        QUESTIONS_ORDER.secondQuestion();
        ENGLAND_VARIANTS_VIEW.populationVariants();
        System.out.println("Enter your answer: ");
        System.out.println(ENGLAND_ANSWERS_VIEW.populationCorrectAnswer());

        QUESTIONS_ORDER.thirdQuestion();
        ENGLAND_VARIANTS_VIEW.nationalDishVariants();
        System.out.println("Enter your answer: ");
        System.out.println(ENGLAND_ANSWERS_VIEW.nationalDishCorrectAnswer());

        QUESTIONS_ORDER.fourthQuestion();
        ENGLAND_VARIANTS_VIEW.colorsOfFlagVariants();
        System.out.println("Enter your answer: ");
        System.out.println(ENGLAND_ANSWERS_VIEW.colorsOfFlagAnswer());

        QUESTIONS_ORDER.fifthQuestion();
        ENGLAND_VARIANTS_VIEW.primeMinisterVariants();
        System.out.println("Enter your answer: ");
        System.out.println(ENGLAND_ANSWERS_VIEW.primeMinisterAnswer());

        QUESTIONS_ORDER.sixthQuestion();
        ENGLAND_VARIANTS_VIEW.currencyVariants();
        System.out.println("Enter your answer: ");
        System.out.println(ENGLAND_ANSWERS_VIEW.currencyAnswer());

        QUESTIONS_ORDER.seventhQuestion();
        ENGLAND_VARIANTS_VIEW.neighbourhoodVariants();
        System.out.println("Enter your answer: ");
        System.out.println(ENGLAND_ANSWERS_VIEW.neighbourhoodAnswer());

        QUESTIONS_ORDER.eighthQuestion();
        ENGLAND_VARIANTS_VIEW.alcoholVariants();
        System.out.println("Enter your answer: ");
        System.out.println(ENGLAND_ANSWERS_VIEW.alcoholAnswer());

        QUESTIONS_ORDER.ninthQuestion();
        ENGLAND_VARIANTS_VIEW.politicalSystemVariants();
        System.out.println("Enter your answer: ");
        System.out.println(ENGLAND_ANSWERS_VIEW.politicalSystemAnswer());

        QUESTIONS_ORDER.tenthQuestion();
        ENGLAND_VARIANTS_VIEW.monumentsVariants();
        System.out.println("Enter your answer: ");
        System.out.println(ENGLAND_ANSWERS_VIEW.monumentsAnswer());

        System.out.println("##################################");
        System.out.println("Wait for your result...");
        Thread.sleep(2000);
        System.out.println(ENGLAND_ANSWERS_VIEW.result());
        ENGLAND_ANSWERS_VIEW.rating();
        System.out.println("Try again!");
        System.out.println("##################################");
    }
}

package views;

import england.England;
import england.EnglandAnswerImpl;
import germany.Germany;
import germany.GermanyAnswerImpl;
import poland.Poland;
import poland.PolandAnswerImpl;
import questions.QuestionImpl;

public class Countries {

    public final EnglandAnswerImpl englandAnswer = new EnglandAnswerImpl();
    public final GermanyAnswerImpl germanyAnswer = new GermanyAnswerImpl();
    public final PolandAnswerImpl polandAnswer = new PolandAnswerImpl();
    private QuestionImpl question = new QuestionImpl();

    public England englandObject() {
        England england = new England("England", question, englandAnswer);
        return england;
    }

    public Poland polandObject() {
        Poland poland = new Poland("Poland", question, polandAnswer);
        return poland;
    }

    public Germany germanyObject() {
        Germany germany = new Germany("Germany", question, germanyAnswer);
        return germany;
    }
}

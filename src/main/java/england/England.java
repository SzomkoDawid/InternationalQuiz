package england;
import lombok.*;
import views.service.Answers;
import questions.Question;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class England {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Question question;
    @Getter
    @Setter
    private Answers answer;
}

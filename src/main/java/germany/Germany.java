package germany;

import lombok.*;
import views.service.Answers;
import questions.Question;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Germany {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Question questions;
    @Getter
    @Setter
    private Answers answers;
}

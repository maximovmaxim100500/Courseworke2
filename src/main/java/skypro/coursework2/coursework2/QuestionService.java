package skypro.coursework2.coursework2;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remmove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();
}

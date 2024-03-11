package skypro.coursework2.coursework2;

import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class JavaQuestionService implements QuestionService{
    private final Set<Question> storage = new HashSet<>();
    private final Random random = new Random();
    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        storage.add(question1);
        return question1;
    }

    @Override
    public Question add(Question question) {
        storage.add(question);
        return question;
    }

    @Override
    public Question remmove(Question question) {
        storage.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(storage);
    }

    @Override
    public Question getRandomQuestion() {
        int index = random.nextInt(storage.size());
        int i = 0;
        for (Question question : storage) {
            if (index == i) {
                return question;
            }
            i++;
        }
        return null;
    }
}

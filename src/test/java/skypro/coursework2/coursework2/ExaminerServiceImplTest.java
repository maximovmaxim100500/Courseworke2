package skypro.coursework2.coursework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    static List<Question> JAVA_QUESTIONS = List.of(
            new Question("Question 1", "Answer 1"),
            new Question("Question 2", "Answer 2"),
            new Question("Question 3", "Answer 3"));
    @Mock
    JavaQuestionService javaQuestionService;
    @Mock
    ExaminerServiceImpl examinerService;

    @BeforeEach
    void setUp() {
        examinerService = new ExaminerServiceImpl(javaQuestionService);
        when(javaQuestionService.getAll()).thenReturn(JAVA_QUESTIONS);
    }

    @Test
    void testNotEnoughQuestions() {
        assertThrows(NotEnoughQuestionsException.class, () -> examinerService.getQuestions(10000));
    }
}
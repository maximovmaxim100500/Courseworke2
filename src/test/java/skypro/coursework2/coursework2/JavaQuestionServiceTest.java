package skypro.coursework2.coursework2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JavaQuestionServiceTest {

    JavaQuestionService javaQuestionService = new JavaQuestionService();

    @Test
    void testAdd() {
        javaQuestionService.add(new Question("question1", "answer1"));
        javaQuestionService.add("question2", "answer2");

        assertThat(javaQuestionService.getAll()).containsExactly(
                new Question("question1", "answer1"),
                new Question("question2", "answer2")
        );
    }

    @Test
    void testRemove() {
        javaQuestionService.add(new Question("question1", "answer1"));
        javaQuestionService.add("question2", "answer2");

        var removed = javaQuestionService.remove(new Question("question2", "answer2"));
        assertThat(removed).isEqualTo(new Question("question2", "answer2"));

        var empty = javaQuestionService.remove(new Question("question2", "answer2"));
        assertThat(empty).isEqualTo(new Question("question2", "answer2"));

        assertThat(javaQuestionService.getAll()).containsExactly(
                new Question("question1", "answer1"));
    }
}
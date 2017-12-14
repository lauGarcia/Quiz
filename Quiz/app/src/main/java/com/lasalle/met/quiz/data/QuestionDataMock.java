package com.lasalle.met.quiz.data;


import com.lasalle.met.quiz.model.Answer;
import com.lasalle.met.quiz.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionDataMock implements QuestionData {

    private List<Question> questionList;

    public QuestionDataMock() {
        questionList = new ArrayList<>();
        questionList.add(new Question(
                "Who won the 2014 World Cup?",
                Arrays.asList(
                        new Answer("Argentina", false),
                        new Answer("Brazil", false),
                        new Answer("Spain", false),
                        new Answer("Germany", false)
                )
        ));

        questionList.add(new Question(
                "Who won the 2016 LOL Worlds?",
                Arrays.asList(
                        new Answer("SKT", true),
                        new Answer("Fnatic", false),
                        new Answer("EDG", false),
                        new Answer("Origen", false)
                )
        ));
    }

    @Override
    public Integer countQuestions() {
        return questionList.size();
    }

    @Override
    public Question getQuestion(int questionId) {
        return questionList.get(questionId);
    }
}

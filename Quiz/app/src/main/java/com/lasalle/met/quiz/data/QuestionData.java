package com.lasalle.met.quiz.data;


import com.lasalle.met.quiz.model.Question;

public interface QuestionData {

    public Question getQuestion(int questionId);
    public Integer countQuestions();

}

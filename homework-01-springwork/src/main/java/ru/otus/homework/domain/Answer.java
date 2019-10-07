package ru.otus.homework.domain;

public class Answer {
    private final String variantOfAnswer;
    private final Boolean resultOfAnswer;

    public Answer (String variantOfAnswer, Boolean resultOfAnswer) {
         this.variantOfAnswer = variantOfAnswer;
         this.resultOfAnswer = resultOfAnswer;
    }

    public String getVariantOfAnswer() {
        return variantOfAnswer;
    }

    public Boolean getResultOfAnswer() {
        return resultOfAnswer;
    }
}


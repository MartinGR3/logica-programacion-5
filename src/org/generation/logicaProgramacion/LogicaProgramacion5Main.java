package org.generation.logicaProgramacion;

public class LogicaProgramacion5Main {

    public static void main(String[] args){
        DictionaryService dictionaryService = new Dictionary();
        QuizService quizService = new QuizService(dictionaryService);
        quizService.startQuiz();
    }

}

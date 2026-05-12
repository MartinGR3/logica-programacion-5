package org.generation.logicaProgramacion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QuizService {

    private final DictionaryService dictionaryService;

    public QuizService(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    public void startQuiz() {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> dictionary = dictionaryService.getWords();

        List<String> spanishWords = new ArrayList<>(dictionary.keySet());

        Collections.shuffle(spanishWords);

        int correctAnswers = 0;
        int incorrectAnswers = 0;

        for (int i = 0; i < 5; i++) {

            String spanishWord = spanishWords.get(i);

            System.out.println("Traduce la palabra: " + spanishWord);

            String userAnswer = scanner.nextLine();

            String correctTranslation = dictionary.get(spanishWord);

            if (userAnswer.equalsIgnoreCase(correctTranslation)) {

                System.out.println("Correcto");
                correctAnswers++;

            } else {

                System.out.println("Incorrecto. La respuesta correcta es: "
                        + correctTranslation);

                incorrectAnswers++;
            }

            System.out.println();
        }

        System.out.println("Resultados finales:");
        System.out.println("Correctas: " + correctAnswers);
        System.out.println("Incorrectas: " + incorrectAnswers);
    }
}
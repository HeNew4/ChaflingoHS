package Chaflingo;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ExerciseSentence implements Practice {
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Esta función revuelve el arreglo (índice)
     * @param array Arreglo a revolver
     */
    public void randomiseArray(int []array) {
        int tmp;

        // Ciclo for
        for (int i = 0; i < array.length; i++) {
            int numeroAleatorio = new Random().nextInt(array.length);
            tmp = array[i];

            array[i] = array[numeroAleatorio];
            array[numeroAleatorio] = tmp;
        }
    }

    /**
     * Lógica para que funcione el ejercicio
     * @param Sentence Lista de palabras en ingles
     * @param correctAnswer Lista de palabras en español
     */
    public void exercise(String [] Sentence, String [] correctAnswer) {
        String answer;

        char response;
        int attempts = 0, loopCount = 0;

        int [] lengthWords = IntStream.range(0, Sentence.length).toArray();

        randomiseArray(lengthWords);

        System.out.println("Ingresa la palabra faltante!");

        for (int index: lengthWords) {

            do {
                System.out.printf("%s\n", Sentence[index]);
                answer = scanner.nextLine().toLowerCase();

                if (attempts > 1) {
                    System.out.println("Quieres la respuesta? [y/n]");
                    response = scanner.next().charAt(0);

                    if (response == 'y') System.out.printf("La respuesta es %s\n", correctAnswer[index]);

                    scanner.nextLine();
                    attempts = 0;
                }

                attempts++;
                loopCount++;
            } while (!answer.equalsIgnoreCase(correctAnswer[index].toLowerCase()));

            attempts = 0;

            int MAX_LOOP = 5;

            if (loopCount > MAX_LOOP) {
                System.out.println("Deseas continuar? [y/n]");
                response = scanner.next().charAt(0);

                if (response == 'n') break;

                scanner.nextLine();
                loopCount = 0;
            }
        }
    }
}

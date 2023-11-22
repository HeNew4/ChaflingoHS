package english;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Practica {
    // Creación del objeto Scanner globalmente
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Aleatoriza el orden de los elementos en un array.
     * Este método modifica el array proporcionado directamente, no crea una copia nueva.
     *
     * @param array Un array de int que se aleatorizará.
     */
    private void randomiseArray( int []array ) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int numeroAleatorio = random.nextInt(array.length);
            int tmp = array[i];

            array[i] = array[numeroAleatorio];
            array[numeroAleatorio] = tmp;
        }
    }

    private void randomiseArrayString( String []array ) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int numeroAleatorio = random.nextInt(array.length);
            String tmp = array[i];

            array[i] = array[numeroAleatorio];
            array[numeroAleatorio] = tmp;
        }
    }

    /**
     * Realiza un ejercicio de vocabulario en el que el usuario debe traducir palabras
     * del inglés al español. El ejercicio utiliza un enfoque de aleatorización para
     * presentar las palabras en un orden aleatorio.
     * <p>
     * El usuario puede ingresar "salir" en cualquier momento para finalizar el ejercicio.
     * Si el usuario no proporciona la traducción correcta después de dos intentos,
     * se le brinda la opción de ver la respuesta correcta.
     * </p>
     *
     * @param sentence Un array de Strings que contiene las palabras en inglés a traducir.
     * @param answer Un array de Strings que contiene las traducciones correspondientes al español.
     */
    public void exercise(String [] sentence, String [] answer) {
        // Objeto random creado para... pues ya sabes que
        Random random = new Random();
        // Variable que determina el fin del programa
        boolean endOfProgram = false;

        // Se crea un arreglo que contiene exclusivamente el índice de los arreglos
        int []indexOfArrays = IntStream.range(0, sentence.length).toArray();
        // Aleatoriza el arreglo
        randomiseArray(indexOfArrays);

        System.out.println("Ingresa \"salir\" para parar la ejecución");

        // Iteración de los elementos
        for ( int index: indexOfArrays ) {
            // Se crea un nuevo arreglo con respuestas revueltas
            String [] arrayAnswer = {
                    answer[index],
                    answer[random.nextInt(answer.length)],
                    answer[random.nextInt(answer.length)]
            };

            randomiseArrayString(arrayAnswer);
            String response;
            int attempts = 0;

            // Saliendo del programa...
            if (endOfProgram) {
                System.out.println("Saliendo...");
                break;
            }


            do {
                System.out.println("Ingresa la opción correcta. Debes teclear la palabra");
                System.out.printf("%s \n\t1. (%s)\n\t2. (%s) \n\t3. (%s)\n\n>", sentence[index] ,arrayAnswer[0], arrayAnswer[1], arrayAnswer[2]);
                response = scanner.nextLine();

                // Compara si la respuesta es igual a salir
                if (response.equalsIgnoreCase("salir")) {
                    endOfProgram = true;
                    break;
                }

                // Sí lleva dos intentos preguntara si va a querer la respuesta
                if (attempts > 0) {
                    char respuesta;

                    do {
                        System.out.println("Quieres la respuesta? [y/n]");
                        respuesta = scanner.next().charAt(0);

                    } while( !(respuesta == 'y' || respuesta == 'n') );

                    // Si la respuesta es positiva entonces muestra la respuesta
                    if ( respuesta == 'y' ) {
                        System.out.printf("La respuesta es %s\n", answer[index]);
                        scanner.nextLine();     // Limpia el buffer?
                        break;                  // Se salta la prueba
                    }

                    scanner.nextLine();         // Limpia el buffer de entrada
                    attempts = 0;               // Reinicia el contador
                }

                attempts++;                     // Incrementa los intentos
            } while ( !response.equalsIgnoreCase(answer[index]) );
        }

    }
}
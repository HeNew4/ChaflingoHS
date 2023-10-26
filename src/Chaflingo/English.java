package Chaflingo;

import java.util.Scanner;

public class English extends Tools{

    private final int loongLine;

    final private String[] palabrasEnIngles = {
            "apple", "banana", "car", "dog", "elephant",
            "flower", "guitar", "house", "ice cream", "jacket",
            "kite", "lion", "moon", "notebook", "orange",
            "pencil", "queen", "rainbow", "sun", "tree",
            "umbrella", "van", "water", "xylophone", "zebra"
    };

    final private String[] palabrasEnEspanol = {
            "manzana", "platano", "coche", "perro", "elefante",
            "flor", "guitarra", "casa", "helado", "chaqueta",
            "cometa", "león", "luna", "cuaderno", "naranja",
            "lapiz", "reina", "arco iris", "sol", "arbol",
            "paraguas", "furgoneta", "agua", "xilófono", "cebra"
    };

    final private String[] oraciones = {
            "Do __ like cats?",
            "I have a __ car.",
            "She __ a book yesterday.",
            "We __ to the beach on weekends.",
            "My favorite color is __.",
            "He __ a delicious pizza for dinner.",
            "They __ to the park last Sunday.",
            "I __ playing the guitar.",
            "She __ in the garden every morning.",
            "We need __ for the party.",
            "I __ my homework in the evening.",
            "He __ basketball with his friends.",
            "She __ to the store to buy groceries.",
            "I like to __ on the weekends.",
            "They __ a great time at the party."
    };

    final private String[] respuestas = {
            "you",
            "blue",
            "read",
            "go",
            "purple",
            "ate",
            "went",
            "enjoy",
            "works",
            "decorations",
            "do",
            "plays",
            "went",
            "relax",
            "had"
    };

    private void HeaderPrint() {
        System.out.print("Chaflingo");
        for (int i = 0; i < loongLine; i++) {
            System.out.print("_");
        }
        System.out.print("\n");
    }

    public English(int loongLine) {
        this.loongLine = loongLine;
    }

    public void Vocabulario() {
        Vocabulario vocabulario = new Vocabulario();

        ClearConsole();

        HeaderPrint();

        vocabulario.exercise(palabrasEnIngles, palabrasEnEspanol);
    }

    public void Sentence() {
        ExerciseSentence exerciseSentence = new ExerciseSentence();

        ClearConsole();

        HeaderPrint();

        exerciseSentence.exercise(oraciones, respuestas);
    }

    public void Menu() {
        Scanner scanner = new Scanner(System.in);

        int response;

        do {

            ClearConsole();
            HeaderPrint();

            System.out.print("\n\n\t[1]Vocabulario\n\t[2]Practica\n\t[3]Salir\n");
            System.out.print("> ");
            response = scanner.nextInt();

            switch (response) {
                case 1:
                    Vocabulario();
                    break;

                case 2:
                    Sentence();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("No esta esa opción\n");
            }
        } while (!(response == 3));
    }
}

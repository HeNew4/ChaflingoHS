package english;

import tools.Tools;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu extends Tools {

    int loongLine;

    public Menu (int loongLine) {
        this.loongLine = loongLine;
    }

    final private static String[] palabrasEnIngles = {
            "apple", "banana", "car", "dog", "elephant",
            "flower", "guitar", "house", "ice cream", "jacket",
            "kite", "lion", "moon", "notebook", "orange",
            "pencil", "queen", "rainbow", "sun", "tree",
            "umbrella", "van", "water", "xylophone", "zebra"
    };

    final private static String[] palabrasEnEspanol = {
            "manzana", "platano", "coche", "perro", "elefante",
            "flor", "guitarra", "casa", "helado", "chaqueta",
            "cometa", "león", "luna", "cuaderno", "naranja",
            "lapiz", "reina", "arco iris", "sol", "arbol",
            "paraguas", "furgoneta", "agua", "xilófono", "cebra"
    };

    final private String[] oraciones = {
            "I like to read books that let me ________ about far-off lands. ",
            "I like to ________ in the morning before I start my day. ",
            "I like to ________ new things. ",
            "I like to spend time with my ________ and play games. ",
            "I like to ________ the guitar. ",
            "I like to ________ the stars at night. ",
            "I like to ________ during the summer. ",
            "I like to ________ with my friends. ",
            "I like to ________ in the forest. ",
            "I like to ________ new places. ",
            "I go to school to learn and make ________. ",
            "I like to listen to music when I want to ________. ",
            "The sun is a star that provides ________ and warmth. ",
            "Water is essential for ________. ",
            "A flower is a plant with bright, colorful ________. ",
            "I feel ________ when I am with my family. ",
            "I feel ________ when I am alone. ",
            "I say ________ to the people I care about. ",
            "A sunset is always ________. ",
            "A rainbow is a ________ arc in the sky. ",
            "If we do our homework, we will have good ___________.",
            "A cat is a small, furry ___________ with a tail.",
            "A dog is a loyal ___________ that loves to play fetch.",
            "A book is a collection of written or printed pages ________ together.",
            "A computer is an electronic device that can perform ________ and store data.",
            "A house is a building where people ________.",
            "A car is a vehicle that has four wheels and is used for ________.",
            "A pen is a writing instrument that uses ink to leave marks on ________.",
            "A table is a piece of furniture with a flat top and one or more legs, used as a surface for ________."
    };

    final private String[] respuestas = {
            "notes",
            "animal",
            "pet",
            "bound",
            "calculations",
            "live",
            "transportation",
            "paper",
            "eating, writing, etc.",
            "spend time",
            "friends",
            "relax",
            "light",
            "life",
            "petals",
            "happy",
            "sad",
            "love",
            "beautiful",
            "colorful",
            "dream",
            "stretch",
            "discover",
            "family",
            "play",
            "look at",
            "swim",
            "laugh",
            "hike",
            "travel"
    };

    public void Vocabulario() {
        Vocabulario vocabulario = new Vocabulario();

        ClearConsole();

        HeaderPrint(loongLine);

        vocabulario.exercise(palabrasEnIngles, palabrasEnEspanol);
    }

    public void Practica() {
        Practica practica = new Practica();

        ClearConsole();

        HeaderPrint(loongLine);

        practica.exercise(oraciones, respuestas);
    }

    public void homeEnglish() {
        Scanner scanner = new Scanner(System.in);

        int response = 0;

        do {

            ClearConsole();
            HeaderPrint(loongLine);

            System.out.print("\n\n\t[1]Vocabulario\n\t[2]Practica\n\t[3]Salir\n\n");
            System.out.print("> ");
            try {
                response = scanner.nextInt();

                switch (response) {
                    case 1:
                        Vocabulario();
                        break;

                    case 2:
                        Practica();
                        break;

                    case 3:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("No esta esa opción\n");
                }

            } catch (InputMismatchException exception) {
                System.out.println("Solo puedes introducir números :(");
                scanner.next();
            }
        } while (!(response == 3));
    }
}

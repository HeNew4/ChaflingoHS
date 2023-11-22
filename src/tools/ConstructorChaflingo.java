package tools;

import english.Diccionario;
import english.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConstructorChaflingo extends Tools {

    int loongLine;

    public ConstructorChaflingo(int loongLine) {
        this.loongLine = loongLine;
    }

    private void English() {
        Menu menu = new Menu(loongLine);

        ClearConsole();

        menu.homeEnglish();
    }

    private void Diccionario() {
        Diccionario diccionario = new Diccionario();

        ClearConsole();

        HeaderPrint(loongLine);

        diccionario.DiccionarioFunction();
    }

    public void HomePrincipal () {
        Scanner scanner = new Scanner(System.in);

        int response = 0;

        do {

            ClearConsole();
            HeaderPrint(loongLine);

            System.out.print("\n\n\t[1]Ingles\n\t[2]Diccionario\n\t[3]Pausas Activas\n\t[4] Salir\n\n");
            System.out.print("> ");
            try {
                response = scanner.nextInt();

                switch (response) {
                    case 1:
                        English();
                        break;

                    case 2:
                        Diccionario();
                        break;

                    case 3:
                        System.out.println("En Construcción...");
                        break;

                    case 4:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("No esta esa opción\n");
                }

            } catch (InputMismatchException exception) {
                System.out.println("Solo puedes introducir números :(");
                scanner.next();
            }
        } while (!(response == 4));
    }

}

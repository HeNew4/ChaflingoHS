package tools;

import java.io.IOException;

public class Tools {
    /**
     * Imprime una leyenda del nombre del proyecto.
     * @param loongLine Largo de la linea a imprimir
     */
    public void HeaderPrint(int loongLine) {
        System.out.print("Chaflingo");
        for (int i = 0; i < loongLine; i++) {
            System.out.print("_");
        }
        System.out.print("\n");
    }


    /**
     * Limpia la consola utilizando el comando CLS de CMD.
     */
    public void ClearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

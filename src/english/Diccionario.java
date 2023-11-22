package english;

import java.io.IOException;
import java.util.Scanner;

public class Diccionario {
    // Definimos el diccionario
    final private String[] palabrasIngles = {
            "apple", "cat","dog","book",
            "computer", "house", "car", "pen",
            "table", "friend", "school", "music",
            "sun", "water", "flower", "happy",
            "sad", "love", "beautiful", "color",
            "smile", "family", "time", "work",
            "play", "learn", "dream", "night",
            "morning", "bird", "food", "drink",
            "tree", "beach", "mountain",
            "time", "work", "play", "learn",
            "dream", "night", "morning", "bird",
            "food", "drink", "tree", "beach",
            "mountain", "smile", "sunshine",
            "rain", "wind", "fire", "earth",
            "moon", "star", "ocean", "river",
            "city", "umbrella", "moonlight", "adventure",
            "butterfly", "candle", "celebrate", "chocolate",
            "discover", "excitement", "family", "guitar",
            "harmony", "imagination", "journey", "laughter",
            "miracle", "nostalgia", "orchestra", "paradise",
            "quaint", "rainbow", "serendipity", "tranquility",
            "vivid", "wanderlust", "xylophone", "zeal",
            "freedom", "happiness", "innovation", "kindness",
            "luminous", "magnificent", "nourish", "optimistic",
            "persistence", "quizzical", "resilience", "serenity",
            "tenderness", "unconditional", "vibrant", "whimsical",
            "xenial", "youthful", "zestful", "benevolence",
            "captivating", "dazzling", "effervescent", "fantastic",
            "gratitude", "heartfelt", "inspiration", "jubilant",
            "kaleidoscope", "lighthearted", "mesmerizing", "nurturing",
            "optimism"
    };

    final private String[] traduccionesEspanol = {
            "manzana", "gato", "perro", "libro",
            "computadora", "casa", "coche", "pluma",
            "mesa", "amigo", "escuela", "música",
            "sol", "agua", "flor", "feliz",
            "triste", "amor", "hermoso", "color",
            "sonrisa", "familia", "tiempo", "trabajo",
            "jugar", "aprender", "soñar", "noche",
            "mañana", "pájaro", "comida", "bebida",
            "árbol", "playa", "montaña", "tiempo",
            "trabajo", "jugar", "aprender", "soñar",
            "noche", "mañana", "pájaro", "comida",
            "bebida", "árbol", "playa", "montaña",
            "sonrisa", "sol", "lluvia", "viento",
            "fuego", "tierra", "luna", "estrella",
            "océano", "río", "ciudad", "paraguas",
            "luz de luna", "aventura", "mariposa",
            "vela", "celebrar", "chocolate", "descubrir",
            "emoción", "familia", "guitarra", "armonía",
            "imaginación", "viaje", "risa", "milagro",
            "nostalgia", "orquesta", "paraíso", "pintoresco",
            "arco iris", "serendipia", "tranquilidad", "vívido",
            "ansia de viajar", "xilófono", "entusiasmo",
            "libertad", "felicidad", "innovación", "bondad",
            "luminoso", "magnífico", "nutrir", "optimista",
            "persistencia", "extraño", "resiliencia", "serenidad",
            "ternura", "incondicional", "vibrante", "caprichoso",
            "hospitalario", "juvenil", "vigoroso", "benevolencia",
            "cautivador", "deslumbrante", "efervescente", "fantástico",
            "gratitud", "sincero", "inspiración", "jubiloso",
            "caleidoscopio", "despreocupado", "hipnotizante",
            "nutrición", "optimismo"
    };

    final private String[] significados = {
            "Una fruta comestible que es roja o verde.",
            "Un animal doméstico de cuatro patas que a menudo se acicala.",
            "Un animal doméstico leal que es el mejor amigo del hombre.",
            "Un objeto con páginas que contiene información escrita.",
            "Una máquina que procesa información y realiza tareas.",
            "El lugar donde vives con tu familia.",
            "Un vehículo de cuatro ruedas que se utiliza para transportarse.",
            "Un instrumento de escritura que usa tinta para escribir.",
            "Un mueble que se utiliza para comer o trabajar.",
            "Una persona a la que le tienes cariño y confías.",
            "Un lugar de educación donde los estudiantes aprenden.",
            "Sonidos organizados que pueden ser alegres o tristes.",
            "La estrella brillante que da luz y calor a la Tierra.",
            "El líquido esencial para la vida.",
            "Una planta con colores hermosos que crece en el jardín.",
            "Sentimiento de alegría y contento.",
            "Sentimiento de tristeza y pesar.",
            "Un sentimiento profundo de afecto y cariño.",
            "Tener cualidades atractivas y agradables a la vista.",
            "Los diferentes tonos que pueden verse en objetos.",
            "Una expresión facial que muestra alegría.",
            "Un grupo de personas relacionadas por sangre o matrimonio.",
            "El continuo flujo del pasado al presente al futuro.",
            "La actividad que haces para ganar dinero.",
            "Participar en actividades recreativas y divertidas.",
            "Adquirir conocimientos y habilidades a través del estudio.",
            "Tener imágenes y pensamientos mientras duermes.",
            "El período oscuro entre el atardecer y el amanecer.",
            "El tiempo justo después de despertar por la mañana.",
            "Un animal con alas que canta melodías.",
            "La comida que consumes para mantenerte vivo.",
            "La bebida que sacia la sed.",
            "Una planta alta con hojas y ramas.",
            "Área de arena junto al mar.",
            "Una gran elevación de terreno con vistas impresionantes.",
            "La medida del cambio en segundos.",
            "Actividad realizada para ganar dinero.",
            "Participar en actividades lúdicas.",
            "Adquirir conocimiento o habilidades.",
            "Experimentar una sucesión de imágenes y sensaciones mientras se duerme.",
            "Período de oscuridad durante la noche.",
            "El tiempo después de la medianoche y antes del mediodía.",
            "Un animal con alas que vuela.",
            "Sustento que se consume para mantener la vida.",
            "Líquido que se consume para saciar la sed.",
            "Una planta grande con ramas y hojas.",
            "Área de arena junto al mar.",
            "Una elevación de terreno natural.",
            "Una expresión facial que muestra alegría.",
            "La luz brillante del día.",
            "Agua que cae del cielo en gotas.",
            "El movimiento del aire en la atmósfera.",
            "Calor y luz producidos por la combustión.",
            "El planeta en el que vivimos.",
            "El satélite natural de la Tierra en el cielo nocturno.",
            "Una luz que brilla en el cielo.",
            "Un vasto cuerpo de agua salada.",
            "Un flujo de agua que corre hacia el mar.",
            "Un lugar con edificios y habitantes.",
            "Un dispositivo portátil que te protege de la lluvia o el sol.",
            "La luz suave y plateada que ilumina la noche en ausencia del sol.",
            "Una experiencia emocionante y aventurera llena de descubrimientos.",
            "Un insecto con alas y colores llamativos que representa la transformación.",
            "Un objeto que arde y proporciona luz y calor, a menudo utilizado en ocasiones especiales.",
            "Festejar y conmemorar con alegría y gratitud.",
            "Un dulce y reconfortante manjar hecho a partir del cacao.",
            "Descubrir algo nuevo, desconocido o sorprendente.",
            "Una sensación de entusiasmo y anticipación positiva.",
            "El grupo de personas unidas por lazos de sangre y amor.",
            "Un instrumento musical de cuerdas utilizado para crear melodías y ritmos.",
            "La combinación de sonidos en equilibrio y concordancia.",
            "La habilidad de crear imágenes y conceptos mentales imaginativos.",
            "Una travesía emocionante o un viaje a lugares desconocidos.",
            "El sonido de la risa que llena el corazón de alegría y diversión.",
            "Un acontecimiento sorprendente y maravilloso que escapa de la explicación común.",
            "Un sentimiento de añoranza por el pasado y sus recuerdos.",
            "Un conjunto de músicos y músicas que interpretan obras maestras musicales.",
            "Un lugar de belleza y bienestar perfecto y placentero.",
            "Un adjetivo que describe algo encantador y pintoresco.",
            "Un arco multicolor que aparece en el cielo después de la lluvia.",
            "La capacidad de encontrar cosas buenas por casualidad.",
            "La sensación de calma y paz interior.",
            "Intenso, claro y lleno de vida y energía.",
            "Un fuerte deseo de viajar y explorar nuevos lugares.",
            "Un instrumento musical de percusión con teclas de madera.",
            "Un entusiasmo apasionado y ardiente.",
            "El estado de ser libre y sin restricciones.",
            "El sentimiento de alegría, satisfacción y bienestar.",
            "La creación de algo nuevo e innovador.",
            "El acto de ser amable, compasivo y considerado con los demás.",
            "Brillante, luminoso y resplandeciente.",
            "Magnífico, grandioso y asombroso.",
            "Alimentar y nutrir con cariño y cuidado.",
            "Creer en un resultado positivo y prometedor.",
            "Expresión facial que muestra asombro o perplejidad.",
            "La capacidad de recuperarse y superar desafíos y dificultades.",
            "La sensación de paz, serenidad y calma interior.",
            "Cualidad de ser cariñoso, suave y afectuoso.",
            "Sin restricciones ni condiciones, ofrecido sin esperar nada a cambio.",
            "Lleno de vitalidad, energía y entusiasmo.",
            "Divertido y caprichoso de manera encantadora y alegre.",
            "Amigable, acogedor y hospitalario hacia los visitantes.",
            "Joven, lleno de vida y vigor.",
            "Lleno de entusiasmo, energía y pasión.",
            "El acto de hacer el bien y mostrar amabilidad.",
            "Atractivo e hipnotizante, que atrae y encanta la atención.",
            "Brillante y resplandeciente por su belleza y luminosidad.",
            "Lleno de burbujas, animación y efervescencia.",
            "Excepcionalmente bueno, impresionante o maravilloso.",
            "Sentimiento de agradecimiento sincero y reconocimiento.",
            "Expresado desde el corazón y con sinceridad profunda.",
            "Estímulo que despierta la creatividad y la acción.",
            "Lleno de alegría y celebración por algo especial.",
            "Un patrón en constante cambio y diverso, lleno de colores y formas.",
            "Divertido y despreocupado en la manera de abordar la vida.",
            "Fascinante y cautivador, que atrapa la atención y el interés.",
            "Cuidar y nutrir con amor y atención constante.",
            "Creencia en un futuro positivo y esperanzador."

    };
    public void DiccionarioFunction () {
        // Crear un Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Limpia la pantalla en Windows
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Ingresa una palabra a buscar (o escriba 'salir' para terminar):");
            String palabraUsuario = scanner.nextLine();

            if (palabraUsuario.equals("salir")) {
                System.out.println("¡BYE!");
                break;
            }

            // Verificar si la palabra está en el diccionario
            boolean palabraEncontrada = false;
            for (int i = 0; i < palabrasIngles.length; i++) {
                if (palabrasIngles[i].equalsIgnoreCase(palabraUsuario) || traduccionesEspanol[i].equalsIgnoreCase(palabraUsuario)) {
                    palabraEncontrada = true;
                    System.out.println("\nPalabra: " + palabrasIngles[i]);
                    System.out.println("Traducción al español: " + traduccionesEspanol[i]);
                    System.out.println("Significado: " + significados[i]);
                    break;
                }
            }

            if (!palabraEncontrada) {
                System.out.println("\nLa palabra no se encuentra en el diccionario.");
            }

            String respuesta;
            do {
                System.out.println("\n¿Quieres ingresar otra palabra? (si/no)");
                respuesta = scanner.nextLine().toLowerCase(); // Convertir a minúsculas
            } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

            if (!respuesta.equalsIgnoreCase("si")) {
                System.out.println("¡BYE!");
                break;
            }
        }

    }
}

package Clase1;
// uso de las palabras break y continue junto a las etiquetas (labels)

// Uso de las palabras break y continue junto a las etiquetas (labels)
public class UsoDeEtiquetasLabels {

    public static void main(String[] args) {
        // Primer bucle con break
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) {
                System.out.println("contando = " + contando);
                break;
            }
        }

        // Etiqueta "inicio" y uso de continue
        inicio:
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 != 0) {
                continue inicio; // Vamos a la siguiente iteración del bucle con la etiqueta "inicio"
            }
            System.out.println("contando = " + contando);
        }
    }
}

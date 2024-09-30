package Clase1;
// uso de las palabras break y continue junto a las etiquetas (labels)
public class UsoDeEtiquetasLabels {

    for(var contando = 0; contando < 7; contando++) {
        if (contando % 2 == 0 ) {
            System.out.println("contando =" + contando);
            break;
        }
    }
    inicio:
    for(var contando = 0; contando < 7; contando++) {
        if (contando % 2 != 0 ) {
            continue inicio; //vamos a la siguiente iteracion
        }
        System.out.println("contando =" + contando);
    }
}

package clase1;

public class UsoDeBreakYcontinue {
    public static void main(String[] args) {
        for(var contando = 0; contando < 7; contando++){
            if (contando % 2 == 0 ) {
                System.out.println("contando =" + contando);
                break;
            }
        }
        for(var contando = 0; contando < 7; contando++){
            if (contando % 2 != 0 ) {
                continue;
            }
            System.out.println("contando =" + contando);
        }
    }
}

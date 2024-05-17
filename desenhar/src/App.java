public class App {
    public static void main(String[] args) {
        
        Retangulo retangulo1 = new RetanguloBordasArredondadas(20, 5, "I");
        Retangulo retangulo2 = new RetanguloDuplo(20, 5, "LOVE");
        Retangulo retangulo3 = new RetanguloAscArt(20, 5, "POO <3");

        retangulo1.desenhar();
        retangulo2.desenhar();
        retangulo3.desenhar();

    }
}
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        String kod = "a=5;\nb=4;\nislem=((a*2)/2+55*b);\nprint(islem);";
        
        Lexer l = new Lexer(kod);
        l.start();

        Queue<Token> sonuclar = l.getResult();
        
        Parser p = new Parser(sonuclar);
        p.start();
        
        p.printTree(p.t);
    }
}
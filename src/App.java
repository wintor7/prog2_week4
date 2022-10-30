import jp.ac.uryukyu.ie.wintor.library.*;

public class App {
    public static void main(String[] args) throws Exception {
        Chatbot bot1 = new Chatbot();
        Chatbot bot2 = new Chatbot("wintor");
        bot1.greeting();
        bot2.greeting();
        bot2.setter("差別用語");
        bot2.setter("Wintor");
        bot2.greeting();
        System.out.println(bot2.getter());

    }
}

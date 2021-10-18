package Stirng;

public class Interpretation {
    public static String interpret(String command) {
String s=command.replace("()","o");
return s.replace("(al)","al");
    }

    public static void main(String[] args) {
        String j="G()()()()(al)";
        System.out.println(interpret(j));
    }
}

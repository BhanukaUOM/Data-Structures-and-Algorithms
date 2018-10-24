public class ReverseStringByWord {
public static void main(String[] args) {
        String foo = "Alex ist doof";
        System.out.println(reverseByWords(foo));
}
public static String reverseByWords(String s){
        String[] words = s.replaceAll("( )+", " ").split(" ");
        StringBuilder out = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) out.append(words[i]).append(" ");
        return out.toString();
}
}

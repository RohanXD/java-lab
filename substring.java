public class substring {
    public static void main(String[] args) {
        String str = "This is a java practicle";
        String[] words = str.split("\\s");
        for(String w: words) {
            System.out.println(w);
        }
}
}

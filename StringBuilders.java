public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("shahariar");
        System.out.println(sb);
        System.out.println(sb.charAt(6));

       
        System.out.println(sb.insert(0, "r"));
        sb.setCharAt(5, 'p');
        System.out.println(sb);

    }
}

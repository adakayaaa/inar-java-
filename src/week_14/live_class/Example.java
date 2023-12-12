package week_14.live_class;

public class Example {
    public static void main(String[] args) {
        String str = "inar Academy";
        boolean[] ch = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            if (!ch[str.charAt(i)]) {
                ch[str.charAt(i)] = true;
            } else {
                System.out.println("false");
                System.exit(1);
            }
        }

    }
}


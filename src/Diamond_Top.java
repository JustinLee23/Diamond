public class Diamond_Top {
    public static void main(String args[]) {
        drawTop();
        for (int i = 8; i >= 0; i -= 2) { // top
            System.out.print("|");
            for (int j = 0; j < i / 2; j++) {
                System.out.print(" "); // left padding
            }
            System.out.print("/");
            for (int j = 0; j < 8 - i; j++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int j = 0; j < i / 2; j++) {
                System.out.print(" "); // right padding
            }
            System.out.println("|");
        }

    }

    public static void drawTop() {
    }
}



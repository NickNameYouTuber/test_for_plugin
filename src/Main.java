// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hi Negr!");
        System.out.printf("в!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {
            System.out.printf("XZ!");
        }

        if (1 == 1){
            System.out.println(sum(1, 3));
        } else {
            System.out.println(sub(1, 3));
            System.out.println(sum(2, 3));
        }

        System.out.printf("END!");
    }

    public static float sum(int a, int b){
        return a + b;
    }

    public static float sub(int a, int b){
        return a - b;
    }
}
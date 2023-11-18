package loop;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (1 == 5)
                continue;
            System.out.println("Coding Everybody" + i);
        }
    }
}

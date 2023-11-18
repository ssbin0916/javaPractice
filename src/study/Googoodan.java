package study;

public class Googoodan {
    public static void main(String[] args) {
        Googoodan googoodan = new Googoodan();
        googoodan.gugudan();
    }
    public void gugudan() {
        for (int i = 2; i <= 9; i++) {
            for (int a = 1; a <= 9; a++) {
                System.out.println(a * i);
            }
        }
    }
}

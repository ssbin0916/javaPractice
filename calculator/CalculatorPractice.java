package calculator;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }

    public void division() {
        System.out.println(this.left / this.right);
    }

    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

public class CalculatorPractice {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
        c1.division();
        c1.multiplication();
    }
}
void main() {
    greet();
    remindName();
    guessAge();
    count();
    test();
    congratulate();
}

private static void greet() {
    IO.println("Hello! My name is Nova.");
    IO.println("I was created in 2026.");
}

private static void remindName() {
    IO.println("Please, remind me your name.");
    String name = IO.readln();
    IO.println("What a great name you have, " + name + "!");
}

private static void guessAge() {
    IO.println("Let me guess your age.");
    IO.println("Enter remainders of dividing your age by 3, 5 and 7.");
    int remainder3 = readRemainder(3);
    int remainder5 = readRemainder(5);
    int remainder7 = readRemainder(7);
    int age = (remainder3 * REMAINDER_3_MULTIPLIER + remainder5 * REMAINDER_5_MULTIPLIER +
            remainder7 * REMAINDER_7_MULTIPLIER) % AGE_MODULO;
    IO.println("Your age is " + age + "; that's a good time to start programming!");
}

private static void count() {
    IO.println("Now I will prove to you that I can count to any number you want.");
    int number = readInt();
    while (number < 0) {
        IO.println("Please, enter a non-negative number.");
        number = readInt();
    }
    for (int i = 0; i <= number; i++) {
        IO.println(i + "!");
    }
}

private static void test() {
    IO.println("Let's test your programming knowledge.");
    IO.println("Why do we use methods?");
    final int correctAnswer = 2;
    IO.println("1. To repeat a statement multiple times.");
    IO.println("2. To decompose a program into several subroutines.");
    IO.println("3. To determine the execution time of a program.");
    IO.println("4. To interrupt the execution of a program.");
    int answer = readInt();
    while (answer != correctAnswer) {
        IO.println("Please, try again.");
        answer = readInt();
    }
}

private static void congratulate() {
    IO.println("Congratulations, have a nice day!");
}

private static int readInt() {
    while (true) {
        try {
            return Integer.parseInt(IO.readln());
        } catch (NumberFormatException e) {
            IO.println("Please, enter a number.");
        }
    }
}

private static int readRemainder(int divisor) {
    while (true) {
        int remainder = readInt();
        if (remainder >= 0 && remainder < divisor) {
            return remainder;
        }
        IO.println("Please, enter a valid remainder.");
    }
}

private static final int AGE_MODULO = 105;
private static final int REMAINDER_3_MULTIPLIER = 70;
private static final int REMAINDER_5_MULTIPLIER = 21;
private static final int REMAINDER_7_MULTIPLIER = 15;
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
    int remainder3 = Integer.parseInt(IO.readln());
    int remainder5 = Integer.parseInt(IO.readln());
    int remainder7 = Integer.parseInt(IO.readln());
    int age = (remainder3 * REMAINDER_3_MULTIPLIER + remainder5 * REMAINDER_5_MULTIPLIER +
            remainder7 * REMAINDER_7_MULTIPLIER) % AGE_MODULO;
    IO.println("Your age is " + age + "; that's a good time to start programming!");
}

private static void count() {
    IO.println("Now I will prove to you that I can count to any number you want.");
    int number = Integer.parseInt(IO.readln());
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
    int answer = Integer.parseInt(IO.readln());
    while (answer != correctAnswer) {
        IO.println("Please, try again.");
        answer = Integer.parseInt(IO.readln());
    }
}

private static void congratulate() {
    IO.println("Congratulations, have a nice day!");
}

private static final int AGE_MODULO = 105;
private static final int REMAINDER_3_MULTIPLIER = 70;
private static final int REMAINDER_5_MULTIPLIER = 21;
private static final int REMAINDER_7_MULTIPLIER = 15;
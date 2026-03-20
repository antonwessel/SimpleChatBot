void main() {
    IO.println("Hello! My name is Nova.");
    IO.println("I was created in 2026.");
    IO.println("Please, remind me your name.");
    String name = IO.readln();
    IO.println("What a great name you have, " + name + "!");

    IO.println("Let me guess your age.");
    IO.println("Enter remainders of dividing your age by 3, 5 and 7.");
    int remainder3 = Integer.parseInt(IO.readln());
    int remainder5 = Integer.parseInt(IO.readln());
    int remainder7 = Integer.parseInt(IO.readln());
    int age = (remainder3 * REMAINDER_3_MULTIPLIER + remainder5 * REMAINDER_5_MULTIPLIER +
            remainder7 * REMAINDER_7_MULTIPLIER) % AGE_MODULO;
    IO.println("Your age is " + age + "; that's a good time to start programming!");

    IO.println("Now I will prove to you that I can count to any number you want.");
    int number = Integer.parseInt(IO.readln());
    for (int i = 0; i <= number; i++) {
        IO.println(i + "!");
    }
    IO.println("Completed, have a nice day!");
}

public static final int AGE_MODULO = 105;
public static final int REMAINDER_3_MULTIPLIER = 70;
public static final int REMAINDER_5_MULTIPLIER = 21;
public static final int REMAINDER_7_MULTIPLIER = 15;
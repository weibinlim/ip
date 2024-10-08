package bigdog;

import java.util.Scanner;

/**
 * The {@code Ui} class handles all interactions with the user,
 * including greeting, reading input, and displaying messages.
 */
public class Ui {

    /** The Scanner object used to read user input. */
    protected Scanner scanner;

    /**
     * Constructs an Ui instance and initializes the Scanner for reading input.
     */
    public Ui() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * @return String representation of a greeting message to the user at the start of the application.
     */
    public static String greet() {
        return "Hello! I'm Bigdog!\nWhat can I do for you?\n";
    }

    /**
     * @return String representation of a farewell message and closes the Scanner when the application exits.
     */
    public String bye() {
        this.scanner.close();
        return "Bye. Hope to see you again soon!";
    }

    /**
     * Prints a given message to the console.
     *
     * @param s the message to print.
     */
    public void print(String s) {
        System.out.println(s);
    }

    /**
     * Reads a line of input from the user.
     *
     * @return the input entered by the user as a String.
     */
    public String readInput() {
        return this.scanner.nextLine();
    }

}

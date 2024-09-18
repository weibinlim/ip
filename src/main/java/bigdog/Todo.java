package bigdog;

/**
 * The {@code Todo} class represents a task with no specific deadline.
 * It extends the {@code Task} class and provides methods for managing to-do items.
 */
public class Todo extends Task {

    private static final int TODO_PREFIX_LENGTH = 4;

    /**
     * Private constructor for creating an {@code Todo} instance.
     * Contains specified description
     *
     * @param str    the description of the Todo.
     * @param marked the completion status of the Todo.
     */
    private Todo(String str, boolean marked) {
        super(str, marked);
    }

    /**
     * Factory method that creates a new Todo instance from the given string.
     *
     * @param s the description of the Todo.
     * @return a new Todo object with the specified description.
     * @throws BigdogException if the description is empty.
     */
    public static Todo of(String s) throws BigdogException {
        if (s.isEmpty()) {
            throw new BigdogException("todo can't be empty! How can you do nothing!");
        }
        return new Todo(s, false);
    }

    /**
     * Factory method that creates a new Todo instance from the given string.
     * Assumes that the first four characters represent a command, such as "todo ".
     *
     * @param s      the string representing the Todo, starting with a "todo " prefix.
     * @param marked the completion status of the Todo.
     * @return a new Todo object with the specified description.
     * @throws BigdogException if the description is empty or invalid.
     */
    public static Todo of(String s, boolean marked) throws BigdogException {
        if (s.length() <= TODO_PREFIX_LENGTH) {
            throw new BigdogException("todo can't be empty! How can you do nothing!");
        }
        return new Todo(s.substring(4), marked);
    }

    /**
     * Returns the description of the Todo.
     *
     * @return the description of the Todo.
     */
    @Override
    public String getDescription() {
        return super.getDescription();
    }

    /**
     * Returns a string representation of the Todo.
     * The format includes Task description.
     *
     * @return a string representation of the to-do item.
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

}

package bug_11;

/**
 * uncommented this piece of code
 * <p>
 * remember for min changes
 */
public class IsEmptyString {

    private final String CUSTOM_DEFAULT_VALUE;// not initialize it in declaration
    public IsEmptyString(String CUSTOM_DEFAULT_VALUE) {
        this.CUSTOM_DEFAULT_VALUE = CUSTOM_DEFAULT_VALUE;
    }

    public static void main(String[] args) {
        IsEmptyString i = new IsEmptyString("ggh");

        if (i.CUSTOM_DEFAULT_VALUE.equals(args)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}

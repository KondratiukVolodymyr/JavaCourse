package bug_4;

public class StrangeBehavior {
    private static StrangeBehavior strangeBehavior = new StrangeBehavior(); //додав статик


    public static void main(String[] args) {
        new StrangeBehavior();
    }
}


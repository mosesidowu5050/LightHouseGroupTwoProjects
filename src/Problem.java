public class Problem {
    private final int problemId;
    private String description;
    private String type;
    private boolean isSolved;
    private static int idCounter = 0;

    public Problem(String description, String type) {
        if (description == null || type == null) {
            throw new IllegalArgumentException("Description and type cannot be null");
        }
        this.problemId = ++idCounter;
        this.description = description;
        this.type = type;
        this.isSolved = false;
    }

    public int getId() {
        return problemId;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolveStatus(boolean status) {
        this.isSolved = status;
    }
}

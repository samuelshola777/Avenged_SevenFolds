package justExercise;

public class ValidateNumberExeption extends Exception{
    private String message;
    public ValidateNumberExeption(String massage) {
        super(massage);
    }
}

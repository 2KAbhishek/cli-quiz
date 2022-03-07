class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String question, boolean answer) {
        super(question, answer ? "Y" : "N");
    }
}

class Question {
    String question;
    String correctAnswer;
    String[] options = new String[4];

    public Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return correctAnswer;
    }

    public String[] getOptions() {
        return options;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.correctAnswer = answer;
    }

    public void setOptions(String[] choices) {
        this.options = choices;
    }

    @Override
    public String toString() {
        return this.question + "\n";
    }

    public boolean checkAnswer(String userAnswer) {
        return correctAnswer.equals(userAnswer);
    }
}

class MultipleChoiceQuestion extends Question {
    public MultipleChoiceQuestion(String question, String answer, String[] optons) {
        super(question, answer);
        this.setOptions(optons);
    }

    @Override
    public String toString() {
        String out = this.question + "\n";
        for (int i = 0; i < this.options.length; i++) {
            out += (char)(96 + (i + 1)) + ") " + this.options[i] + "\n";
        }
        return out;
    }
}

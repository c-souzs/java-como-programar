package chapterSix;

public enum TypeQuestion {
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/'), RANDOM('?');

    private char symbol;

    TypeQuestion(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}

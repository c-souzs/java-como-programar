package chapters.twoThreeForAndFive.challenges.cryptography;

public class Decode {
    private int valueDecode;

    public Decode(int value) {
        this.valueDecode = decodeValue(value);
    }

    private int decodeValue(int value) {
        int firstDigit, secondDigit, threeDigit, fourDigit;

        fourDigit = value % 10;
        value /= 10;

        threeDigit = value % 10;
        value /= 10;

        secondDigit = value % 10;
        value /= 10;

        firstDigit = value % 10;

        firstDigit-=7;
        secondDigit-=7;
        threeDigit-=7;
        fourDigit-=7;

        firstDigit = firstDigit < 0 ? 10 + firstDigit : firstDigit;
        secondDigit = secondDigit < 0 ? 10 + secondDigit : secondDigit;
        threeDigit = threeDigit < 0 ? 10 + threeDigit : threeDigit;
        fourDigit = fourDigit < 0 ? 10 + fourDigit : fourDigit;

        String decode = "" + threeDigit + fourDigit + firstDigit + secondDigit;

        return Integer.parseInt(decode);
    }

    public int getValueDecode() {
        return valueDecode;
    }
}

package chapters.twoThreeForAndFive.challenges.health;


/*
    Calculadora de índice de massa corporal) Introduzimos a calculadora de índice de massa corporal (IMC) no Exercício 1.10.
    As formulas para calcular o IMC são:
        IMC = pesoEmQuilogramas / alturaEmMetros²
    */
public class CalculatorImc implements Cloneable {
    private double imc;
    private String statusImc;

    public CalculatorImc(double weight, double height) {
        calculateImc(weight, height);
        determineStatusImc();
    }

    private void calculateImc(double weight, double height) {
        double heightPow = Math.pow(height, 2);
        imc = weight / heightPow;
    }

    private void determineStatusImc() {
        if(imc >= 30) statusImc = "Obese";
        else if(imc >= 25) statusImc = "Overweight";
        else if(imc > 18.5) statusImc = "Normal";
        else statusImc = "Underweight";
    }

    @Override
    public CalculatorImc clone() {
        try {
            return (CalculatorImc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getStatusImc() {
        return statusImc;
    }

    public double getImc() {
        return imc;
    }
}

package chapters.twoThreeForAndFive.challenges.health;

/*
    Frequencia cardiaca maxima por minuto e 220 - idadeEmAnos.
    Frequencia cardiaca alvo e 50-85% da frequencia cardiaca maxima.
    Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome,
    sobrenome e data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento).
    Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get.
    A classe também deve incluir um método que calcule e retorne a idade (em anos), um que calcule e retorne a frequência
    cardíaca máxima e um que calcule e retorne a frequência cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite
    as informações da pessoa, instancie um objeto da classe HeartRates e
    imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa
    — calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e
    sua frequência cardíaca alvo.
 */
public class HeartRates implements Cloneable {
    private int frequencyMax;
    private double frequencyTarget;

    public HeartRates(int age) {
        this.frequencyMax = calculateFrequencyMax(age);
        this.frequencyTarget = calculateFrequencyTarget();
    }

    private int calculateFrequencyMax(int age) {
        return  220 - age;
    }

    private double calculateFrequencyTarget() {
        return 0.75 * frequencyMax;
    }

    @Override
    public HeartRates clone() {
        try {
            return (HeartRates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public int getFrequencyMax() {
        return frequencyMax;
    }

    public double getFrequencyTarget() {
        return frequencyTarget;
    }
}

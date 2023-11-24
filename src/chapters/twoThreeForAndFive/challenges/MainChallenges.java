package chapters.twoThreeForAndFive.challenges;

import chapters.twoThreeForAndFive.challenges.cryptography.Decode;
import chapters.twoThreeForAndFive.challenges.cryptography.Encode;
import chapters.twoThreeForAndFive.challenges.health.CalculatorImc;
import chapters.twoThreeForAndFive.challenges.health.HealthProfile;
import chapters.twoThreeForAndFive.challenges.health.HeartRates;

import java.util.Scanner;

public class MainChallenges {
    public static void main(String[] args) {
        /*AutoPolicy ap1 = new AutoPolicy(1, "Model 1", "NJ");
        AutoPolicy ap2 = new AutoPolicy(2, "Model 2", "MN");
        AutoPolicy ap3 = new AutoPolicy(3, "Model 3", "NH");
        AutoPolicy ap4 = new AutoPolicy(4, "Model 4", "MA");

        printInformationPolicy(ap1);
        printInformationPolicy(ap2);
        printInformationPolicy(ap3);
        printInformationPolicy(ap4);*/

        /*quadratic(2, 3, 4); // Sem raizes reais
        quadratic(1, 3, 2); // Duas raizes reais distintas
        quadratic(1, 2, 1);*/

        // createImc();

        // createFrequency();

        // createHealtProfile();

        Encode encode = new Encode(7895);
        System.out.printf("O valor criptografado e %d", encode.getValueEncode());

        Decode decode = new Decode(encode.getValueEncode());
        System.out.printf("O valor descriptografo e %d", decode.getValueDecode());
    }

    /*public static void createHealtProfile() {
        Scanner input = new Scanner(System.in);
        String name, lastName;
        int year, month, day;
        double w, h;

        System.out.println("Insira seu primeiro nome: ");
        name = input.next();
        System.out.println("Insira seu ultimo nome: ");
        lastName = input.next();
        System.out.println("Insira seu ano de nascimento: ");
        year = input.nextInt();
        System.out.println("Insira seu mes de nascimento: ");
        month = input.nextInt();
        System.out.println("Insira seu dia de nascimento: ");
        day = input.nextInt();
        System.out.println("Insira seu peso em kg: ");
        w = input.nextDouble();
        System.out.println("Insira a altura em metros");
        h = input.nextDouble();

        HealthProfile profileUser = new HealthProfile(name, lastName, year, month, day, w, h);

        System.out.println("****** Ficha de saude ******");
        System.out.printf("Ola %s %s!%n", profileUser.getName(), profileUser.getLastName());
        System.out.printf("De acordo com nossas conta voce tem %d anos e nasceu em %02d/%02d/%d.%n",
                profileUser.getAge(), profileUser.getDay(), profileUser.getMonth(), profileUser.getYear());
        CalculatorImc imcUser = profileUser.getImc();
        System.out.printf("Calculamos seu imc, que e %.2f e seu status e %s.%n", imcUser.getImc(), imcUser.getStatusImc());
        HeartRates heartRatesUser = profileUser.getHeartRates();
        System.out.printf("Tambem calculamos que sua frequencia cardiaca maxima e de %d. Recomendamos que ela seja de %.2f",
                heartRatesUser.getFrequencyMax(), heartRatesUser.getFrequencyTarget());
    }*/

    /*public static void createFrequency() {
        Scanner input = new Scanner(System.in);
        String name, lastName;
        int year, month, day;

        System.out.println("Insira seu primeiro nome: ");
        name = input.next();
        System.out.println("Insira seu ultimo nome: ");
        lastName = input.next();
        System.out.println("Insira seu ano de nascimento: ");
        year = input.nextInt();
        System.out.println("Insira seu mes de nascimento: ");
        month = input.nextInt();
        System.out.println("Insira seu dia de nascimento: ");
        day = input.nextInt();

        HeartRates user = new HeartRates(name, lastName, year, month, day);

        System.out.printf(
                "Ola %s %s descobrimos que voce tem %d anos. Pelos nossos calculos sua frequencia maxima deve ser %d." +
                        " Foque para atingir uma frequencia perto de %.2f!%n",
                user.getName(), user.getLastName(), user.calculateAge(), user.calculateFrequencyMax(), user.calculateFrequencyTarget()
        );
    }

    public static void createImc() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira seu peso em kg: ");
        double w = input.nextDouble();
        System.out.println("Insira a altura em metros");
        double h = input.nextDouble();

        CalculatorImc imcUser = new CalculatorImc(w, h);
        System.out.printf("O IMC e %.2f e sua classificacao e %s", imcUser.getImc(), imcUser.getStatusImc());
    }

    public static void printInformationPolicy(AutoPolicy ap) {
        System.out.println("****** Informações de seguro******");
        System.out.printf(
                "Numero de Conta é %d referente ao modelo %s e %s um seguro valido no estado de %s",
                ap.getNumberAccount(),
                ap.getModel(),
                (ap.isPolicyValid() ? "possui" : "nao possui"),
                ap.getState()
        );
        System.out.println();
    }

    public static void quadratic(int a, int b, int c) {
        double delta = Math.pow(b, 2) - (4 * a * c);

        if(delta >= 0 ){
            double deltaSqrt = Math.sqrt(delta);

            int negativeB = -b;
            double root1 = (negativeB + deltaSqrt) / (2 * a);

            double root2 = (negativeB - deltaSqrt) / (2 * a);

            System.out.printf("x¹ = %.2f | x² = %.2f", root1, root2);
            System.out.println();
        } else System.out.println("A funcao nao tem raizes reais.");
    }*/
}

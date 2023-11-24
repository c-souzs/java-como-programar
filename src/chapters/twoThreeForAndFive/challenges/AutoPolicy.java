package chapters.twoThreeForAndFive.challenges;

import com.sun.source.tree.ReturnTree;

/*
    Você foi contratado por uma companhia de seguros de automóvel que atende estes estados do nordeste dos Estados
    Unidos — Connecticut, Maine, Massachusetts, New Hampshire, Nova Jersey, Nova York, Pensilvânia, Rhode Island
    e Vermont. A empresa quer que você crie um programa que produz um relatório indicando para cada uma das
    apólices de seguro de automóvel se a apólice é válida em um estado com seguro de automóvel “sem culpa” (modalidade
    de seguro em que o segurado é indenizado independentemente de sua responsabilidade no sinistro) — Massachusetts,
    Nova Jersey, Nova York e Pensilvânia.
 */
public class AutoPolicy {
    private int numberAccount; // Numero da conta
    private String model; // Modelo
    private String state; // Null para estados diferentes de MA, NJ, NY e Pa

    public AutoPolicy(int numberAccount, String model, String state) {
        this.numberAccount = numberAccount;
        this.model = model;
        this.state = state;
    }

    public boolean isPolicyValid() {
        boolean valid;

        switch (state) {
            case "MA": case "NJ": case "NY": case "PA":
                valid = true;
                break;
            default:
                valid = false;
                break;
        }

        return  valid;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getModel() {
        return model;
    }

    public String getState() {
        return state;
    }
}

package it.charaf.thread;

public class Contatore {
    private int valore = 0;
    private final int valoreMassimo;

    public Contatore(int valoreMassimo) {
        this.valoreMassimo = valoreMassimo;
    }

    public synchronized boolean incrementa(String nomeThread) {
        if (valore < valoreMassimo) {
            valore++;

            System.out.println(
                nomeThread + " ha incrementato il contatore a: " + valore
            );

            return true;
        }

        return false;
    }
}


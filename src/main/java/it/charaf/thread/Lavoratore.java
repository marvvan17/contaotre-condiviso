package it.charaf;

import java.util.concurrent.ThreadLocalRandom;

public class Lavoratore implements Runnable {
    private final Contatore contatore;
    private final String nome;

    public Lavoratore(Contatore contatore, String nome) {
        this.contatore = contatore;
        this.nome = nome;
    }

    @Override
    public void run() {
        while (contatore.incrementa(nome)) {
            try {
                int pausa = ThreadLocalRandom.current().nextInt(100, 501);
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}


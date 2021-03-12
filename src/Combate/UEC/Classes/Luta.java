package Combate.UEC.Classes;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    int vencedor;

    //Métodos
    public void marcarluta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (getAprovada()) {
            System.out.println("###DESAFIADO###");
            this.desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            this.desafiante.apresentar();
            Random random = new Random();
            System.out.println("----------------------RESULTADO DA LUTA-----------------------");
            int vencedor=random.nextInt(3); //0 1 2
            switch (vencedor) {
                case 0://empatar
                    if (this.vencedor == 0) {
                        desafiante.empatarLuta();
                        desafiado.empatarLuta();
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("---------------------##ACABOU EM EMPATE##---------------------");
                        System.out.println("--------------------------------------------------------------");
                        this.desafiado.status();
                        this.desafiante.status();

                        break;

                    }
                case 1://ganhou desafiado
                    desafiado.ganharLuta();
                    desafiante.perderLutar();
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("---------------------##GANHOU DESAFIADO##---------------------");
                    System.out.println("--------------------------------------------------------------");
                    this.desafiado.status();
                    break;
                case 2: //ganhou desafiante
                    desafiante.ganharLuta();
                    desafiado.perderLutar();
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("--------------------##GANHOU DESAFIANTE##---------------------");
                    System.out.println("--------------------------------------------------------------");
                    this.desafiante.status();
                    break;

            }
            System.out.println("--------------------------------------------------------------");
        } else {
            System.out.println("Luta não pode acontecer");
        }

    }

    //Métodos especiais


    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

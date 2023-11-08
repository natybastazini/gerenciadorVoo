package br.senai.sp.jandira.model;

import java.time.LocalDate;

abstract class Voo {

    private String origem, destino, companhia, horaPartida, horaChegada;
    private String dataPartida, dataChegada;
    private int capacidadePassageiro, numeroVoo;

    public Voo (String origem, String destino, String companhia, String horaPartida, String horaChegada, String dataPartida, String dataChegada, int capacidadePassageiro, int numeroVoo){
        this.origem = origem;
        this.destino = destino;
        this.companhia = companhia;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.dataPartida = dataPartida;
        this.dataChegada = dataPartida;
        this.capacidadePassageiro = capacidadePassageiro;
        this.numeroVoo = numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public int getCapacidadePassageiro() {
        return capacidadePassageiro;
    }

    public void setCapacidadePassageiro(int capacidadePassageiro) {
        this.capacidadePassageiro = capacidadePassageiro;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }
}

package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class VooDelta extends Voo{

    public VooDelta(String origem, String destino, String companhia, String horaPartida, String horaChegada, String dataPartida, String dataChegada, int capacidadePassageiro, int numeroVoo) {
        super(origem, destino, companhia, horaPartida, horaChegada, dataPartida, dataChegada, capacidadePassageiro, numeroVoo);
    }


}

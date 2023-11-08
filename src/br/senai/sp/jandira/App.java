package br.senai.sp.jandira;

import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooEmirante;
import br.senai.sp.jandira.model.VooGol;

public class App {
    public static void main(String[] args) {

        VooDelta voo1 = new VooDelta("São Paulo", "Grécia", "Delta", "12h00", "16h00", "08-11-2023", "08-11-2023", 100, 1);
        VooGol voo2 = new VooGol("Rio de Janeiro", "Aracjú", "Gol", "13h00", "14h30", "10-11-2023", "10-11-2023", 100, 2);
        VooEmirante voo3 = new VooEmirante("Egito", "África", "Emirante", "14h00", "18h10", "11-11-2023", "11-11-2023", 100, 3);

        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println("    -------------- Companhia " + voo1.getCompanhia() + "--------------    ");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println("Origem do voo: " + voo1.getOrigem());
        System.out.println("Seu voo tem como destino: " + voo1.getDestino());
        System.out.println("--------------------------------------------------------");
        System.out.println("Horário da partida: " + voo1.getHoraPartida());
        System.out.println("Horário da chegada: " + voo1.getHoraChegada());
        System.out.println("--------------------------------------------------------");
        System.out.println("Data da partida: " + voo1.getDataPartida());
        System.out.println("Data da chegada: " + voo1.getDataChegada());
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println();

        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println("    -------------- Companhia " + voo2.getCompanhia() + "--------------    ");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println("Origem do voo: " + voo2.getOrigem());
        System.out.println("Seu voo tem como destino: " + voo2.getDestino());
        System.out.println("--------------------------------------------------------");
        System.out.println("Horário da partida: " + voo2.getHoraPartida());
        System.out.println("Horário da chegada: " + voo2.getHoraChegada());
        System.out.println("--------------------------------------------------------");
        System.out.println("Data da partida: " + voo2.getDataPartida());
        System.out.println("Data da chegada: " + voo2.getDataChegada());
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println();

        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println("    -------------- Companhia " + voo3.getCompanhia() + "--------------    ");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println("Origem do voo: " + voo3.getOrigem());
        System.out.println("Seu voo tem como destino: " + voo3.getDestino());
        System.out.println("--------------------------------------------------------");
        System.out.println("Horário da partida: " + voo3.getHoraPartida());
        System.out.println("Horário da chegada: " + voo3.getHoraChegada());
        System.out.println("--------------------------------------------------------");
        System.out.println("Data da partida: " + voo3.getDataPartida());
        System.out.println("Data da chegada: " + voo3.getDataChegada());
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println();
    }
}

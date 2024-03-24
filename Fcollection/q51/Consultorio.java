package Fcollection.q51;

import java.util.ArrayDeque;

public class Consultorio {
    public static ArrayDeque<Paciente> filaPrioritaria = new ArrayDeque<>();
    public static ArrayDeque<Paciente> filaComum = new ArrayDeque<>();
    public static int quantPacientes = 0;

    public static void main(String[] args) {
        adicionaPacienteAFila();

        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 && quantPacientes < 20) {
                adicionaPacienteAFila();
            }
            if (i % 5 == 0) {
                atendePaciente();
            }
        }
    }

    public static void adicionaPacienteAFila() {
        Paciente paciente = new Paciente();

        if (paciente.getIdade() > 60) {
            filaPrioritaria.add(paciente);
            System.out.println(paciente + " adicionado na fila prioritária!");
            ++quantPacientes;
        } else {
            filaComum.add(paciente);
            System.out.println(paciente + " adicionado na fila comum!");
            ++quantPacientes;
        }
    }

    public static void atendePaciente() {
        if (!filaPrioritaria.isEmpty()) {
            System.out.println("Paciente da fila prioritária atendido! Dados: " + filaPrioritaria.remove());
        } else if (!filaComum.isEmpty()) {
            System.out.println("Paciente da fila comum atendido! Dados: " + filaComum.remove());
        } else {
            System.out.println("Não há pacientes!");
        }
    }
}

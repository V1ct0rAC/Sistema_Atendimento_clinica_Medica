package br.com.logistica;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        GerenciadorConsultorio gerenciador = new GerenciadorConsultorio();
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("Escolha a opção a seguir: " +
                    "\n1 - Adicionar" +
                    "\n2- Atender paciente" +
                    "\n3- Ver próximo paciente" +
                    "\n4- Status da fila" +
                    "\n5- Sair ");
            escolha = scanner.nextInt();


            {
                if (escolha == 1) {
                    System.out.println("Digite o nome do paciente");
                    String nome = scanner.next();
                    Paciente novoPaciente = new Paciente(nome);
                    gerenciador.inserirPaciente(novoPaciente);

                }
                if (escolha == 2) {
                    gerenciador.atender();

                }
                if (escolha == 3) {
                    gerenciador.proximoFila();

                }
                if (escolha == 4) {
                    gerenciador.statusFila();

                }

            }

        }
        while (escolha != 5); {
            System.out.println("Saindo");


        }
    }
}

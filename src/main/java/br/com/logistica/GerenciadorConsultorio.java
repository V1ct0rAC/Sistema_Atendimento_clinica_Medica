package br.com.logistica;

import java.util.LinkedList;
import java.util.Queue;

public class GerenciadorConsultorio {



    Queue<Paciente>filaEspera = new LinkedList<>();

    public GerenciadorConsultorio() {

    }
    public void inserirPaciente(Paciente paciente){
        filaEspera.offer(paciente);
        System.out.println("Paciente "+ paciente.getNome()+" adicionado com sucesso");

    }
    public void atender (){
        if (!filaEspera.isEmpty()){
            Paciente atendido = filaEspera.poll();
            System.out.println("Atendendo pacinte: "+ atendido.getNome());
        }
        else {
            System.out.println("Não há pacientes");

        }

    }
    public void proximoFila(){
        Paciente proximo = filaEspera.peek();
        assert proximo != null;
        System.out.println("Próximo pacinte: "+ proximo.getNome());
    }
    public void statusFila (){
        for (Paciente p : filaEspera){
            System.out.println(p.getNome());

        }
    }
}

🛠️ O Desafio: Sistema de Atendimento de uma Clínica Médica

Imagine que você está desenvolvendo o sistema de gerenciamento de pacientes para uma clínica. Os pacientes chegam, 
pegam uma senha e entram em uma fila de espera. O médico atende sempre quem chegou primeiro.
O que você deve implementar:

Você precisará criar uma classe chamada GerenciadorConsultorio e utilizar a interface Queue do Java 
(recomendo usar a implementação LinkedList).

O seu programa deve ter um menu interativo (usando Scanner no main) que permita as seguintes ações:

   1. Chegada de Paciente (Enqueue): Adicionar um novo paciente pelo nome ao final da fila.

   2. Atender Paciente (Dequeue): Remover e mostrar o nome do paciente que estava no início da fila 
(o próximo a ser atendido). Se a fila estiver vazia, exibir uma mensagem avisando.

   3. Ver Próximo (Peek): Mostrar quem é o próximo paciente a ser atendido, mas sem removê-lo da fila.

   4. Status da Fila: Mostrar a quantidade de pacientes aguardando e, se possível, listar o nome de todos na ordem em que serão atendidos.

   5. Sair: Encerrar o programa.
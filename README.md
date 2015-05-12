##Estados de uma Thread

###Nova 
Quando a thread é instanciada, está disponível para ser executada.

###Executável
Quando a thread é ativada pelo método start(). Pode entrar neste estado por:
* start(): thread inicializada através do start().
* retorno do sleep: o tempo de bloqueio por sleep terminou.
* resume(): desbloqueio do suspend() para continuação do processo – deprecated.
* notify/notifyAll(): desbloqueio do wait() para continuação do processo.
* retorno do I/O: o processo de IO foi finalizado.

###Bloqueada: 
Quando a thread é desativada. Pode entrar neste estado por:
* sleep(): bloqueada por tempo determinado.
* suspend(): bloqueada até que seja reativada pelo resume() – deprecated.
* wait(): bloqueada até que receba uma notificação (notify() / notifyAll()).
* bloqueio por I/O: algum processo de IO está sendo aguardado para continuar o processo.

###Encerrada: 
Quando a thread termina sua execução (final do método run()) o u ométodo stop() é acionado.


##Principais métodos – Threads

###run() 
Deve conter o código que se deseja executar, quando a thread estiver ativa.
###start() 
Inicia a thread, ou seja, efetiva a chamada do método run().
###stop() 
Encerra a thread;
###static sleep(long tempo) 
Deixa thread corrente inativa por no mínimo tempo milisegundos e promove outra thread.
###static yield() 
Deixa a thread em execução temporariamente inativa e, quando possível, promove outra thread de mesma prioridade ou maior;
###suspend() 
Coloca a thread no final da fila de sua prioridade e a deixa inativa (método depreciado);
###resume() 
Habilita novamente a execução da thread (método depreciado);
###wait() 
Interrompe a thread corrente e coloca a mesma na fila de espera (do objeto compartilhado) e aguarda que a mesma seja notificada;
###notify() 
Notifica a próxima thread, aguardando na fila
###notifyAll() 
Notifica todas as threads.
###join()
Aguarda outra thread para encerrar;
###interrupt()
Envia o pedido de interrupção de execução de uma thread;
###static interrupted()
Verifica se a thread atual está interrompida;
###isAlive()
Retorna true caso uma thread estiver no estado executável ou bloqueado, nos demais retorna false;
###setPriority(int prioridade)
Define a prioridade de execução de uma thread (1 a 10).
###getPriority()
Verifica a prioridade de execução de uma thread;

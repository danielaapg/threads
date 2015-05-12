##Estados de uma Thread

###Nova: 
Quando a thread é instanciada, está disponível para ser executada.

###Executável:
Quando a thread é ativada pelo método start(). Pode entrar neste estado por:
* start(): thread inicializada através do start().
* retorno do sleep: o tempo de bloqueio por sleep terminou.
* resume(): desbloqueio do suspend() para continuação do processo – deprecated.
* notify/notifyAll(): desbloqueio do wait() para continuação do processo.
* retorno do I/O: o processo de IO foi finalizado.

###Bloqueada: quando a thread é desativada. Pode entrar neste estado por:
* sleep(): bloqueada por tempo determinado.
* suspend(): bloqueada até que seja reativada pelo resume() – deprecated.
* wait(): bloqueada até que receba uma notificação (notify() / notifyAll()).
* bloqueio por I/O: algum processo de IO está sendo aguardado para continuar o processo.

###Encerrada: quando a thread termina sua execução (final do método run()) o u ométodo stop() é acionado.

package aula.ex03;

public interface IBrClock {
    default void relogio() {
        System.out.println("Fuso Horario - BRASIL\n");
    }
}

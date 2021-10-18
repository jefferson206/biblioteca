package aula.ex03;

public interface IPjClock {
    default void relogio() {
        System.out.println("Fuso Horario - JAPÃO\n");
    }
}

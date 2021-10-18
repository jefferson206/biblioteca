package aula.ex02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataDeNascimento;
    private float altura;

    public Pessoa() { }

    public Pessoa(String nome, Date dataDeNascimento, float altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(dataDeNascimento);
    }

    public void setDataDeNascimento(String dataDeNascimento) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dataDeNascimento = simpleDateFormat.parse(dataDeNascimento);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void imprimirDados() {
        System.out.println("Olá " + getNome());
        System.out.println("Data de nascimento: " + getDataDeNascimento());
        System.out.println("Altura: " + getAltura());
        calcularIdade(getDataDeNascimento());
    }

    private static void calcularIdade(String nascimento) {
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataAtual = LocalDate.now();
        LocalDate nascimentoConvertido = LocalDate.parse(nascimento, dataFormatada);

        Period period = Period.between(nascimentoConvertido, dataAtual);
        System.out.println("Você tem " + period.getYears() + " anos " + period.getMonths() + " meses e " + period.getDays() + " dias.");
    }
}

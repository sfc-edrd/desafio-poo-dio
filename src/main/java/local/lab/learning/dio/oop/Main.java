package local.lab.learning.dio.oop;

import local.lab.learning.dio.oop.entities.Atividade;
import local.lab.learning.dio.oop.entities.Bootcamp;
import local.lab.learning.dio.oop.entities.Dev;
import local.lab.learning.dio.oop.entities.Mentoria;
import local.lab.learning.dio.oop.entities.abstractions.Conteudo;

import java.time.LocalDate;
import java.time.Month;

public class Main
{
    public static void main(String[] args)
    {
        Conteudo    c1, c2, c3, c4, c5;
        Bootcamp    b1;
        Dev         d1;

        System.out.println("Criando os Conteudos...");
        c1 = new Atividade("Java Basico 1", "Curso de Java Basico nivel 1", 6);
        c2 = new Atividade("Java Basico 2", "Curso de Java Basico nivel 2", 4);
        c3 = new Mentoria("Primeiros passos com Java", "Mentoria focada nos primeiros passos com Java", LocalDate.of(2022, Month.NOVEMBER, 22));
        c4 = new Mentoria("Intensivão Spring Boot", "Intensivo de Spring Boot mão na massa", LocalDate.of(2022, Month.NOVEMBER, 29));
        c5 = new Atividade("Spring Security", "Desmistificando o Spring Security", 5);

        System.out.println("Criando o BootCamp...");
        b1 = new Bootcamp("Java: do zero ao herói", "Neste Bootcamp voce sairá como um herói do código em Java independente do seu nível atual");

        System.out.println("Adicionando os Conteúdos ao Bootcamp...");
        b1.addConteudo(c1);
        b1.addConteudo(c2);
        b1.addConteudo(c3);
        b1.addConteudo(c4);
        b1.addConteudo(c5);

        System.out.println("Criando o Dev...");
        d1 = new Dev("Evandro Almeida Sobrinho");
        System.out.println("d1:" + d1);

        System.out.println("Inscrevendo o Dev d1 ao BootCamp");
        d1.inscreverNoBootcamp(b1);
        System.out.println("d1 depois de inscrito no BootCamp: " + d1);

        d1.progredir();
        System.out.println("d1 depois de progredir: " + d1);

        System.out.println("XPs do d1: " + d1.calcularXpTotal());

        System.out.println("Devs incritos no b1: " + b1.getDevs());
    }
}
package local.lab.learning.dio.oop.entities;

import local.lab.learning.dio.oop.entities.abstractions.Conteudo;

import java.util.LinkedHashSet;

public class Dev
{
    /**
     *
     * ATRIBUTOS DA CLASSE
     *
     */
    private String                      nome;
    private LinkedHashSet<Conteudo>     conteudosInscritos;
    private LinkedHashSet<Conteudo>     conteudosConcluidos;

    /**
     *
     * CONSTRUTOR
     *
     */
    public Dev(String nome)
    {
        this.nome = nome.trim();
        this.conteudosInscritos = new LinkedHashSet<>();
        this.conteudosConcluidos = new LinkedHashSet<>();
    }

    /**
     *
     * GETTERS
     *
     */

    public void inscreverNoBootcamp(Bootcamp bootcamp)
    {
        bootcamp.addDev(this);
        conteudosInscritos.addAll(bootcamp.getConteudo());
    }

    public void progredir()
    {
        conteudosInscritos
                .stream()
                .findFirst()
                .ifPresentOrElse(
                        // IF present
                        c -> {
                            conteudosConcluidos.add(c);
                            conteudosInscritos.remove(c);
                        },
                        // Or else
                        () -> System.out.println("Voce nao esta inscrito em nenhum conteúdo"));
    }

    public int calcularXpTotal()
    {
        return (conteudosConcluidos
                .stream()
                .map(Conteudo::calcularXp)
                .reduce(0, (total, xp) -> total + xp));
    }

    public void exibirCursos()
    {
        conteudosInscritos
                .stream()
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return ("Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}');
    }
}

package local.lab.learning.dio.oop.entities;

import java.time.LocalDate;
import java.util.LinkedHashSet;

public class Bootcamp
{
    /**
     *
     * ATRIBUTOS DA CLASSE
     *
     */
    private String                      nome;
    private String                      descricao;
    private LocalDate                   dataInicial;
    private LocalDate                   dataFinal;
    private LinkedHashSet<AbstractConteudo> abstractConteudos;
    private LinkedHashSet<Dev>         devs;

    /**
     *
     * CONSTRUTOR
     *
     */
    public Bootcamp(String nome, String descricao)
    {
        this.nome = nome.trim();
        this.descricao = descricao.trim();
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
        abstractConteudos = new LinkedHashSet<>();
        devs = new LinkedHashSet<>();
    }

    /**
     *
     * GETTERS
     *
     */
    public String getNome()
    {
        return (nome);
    }

    public String getDescricao()
    {
        return (descricao);
    }

    public LocalDate getDataInicial()
    {
        return (dataInicial);
    }

    public LocalDate getDataFinal()
    {
        return (dataFinal);
    }

    public LinkedHashSet<AbstractConteudo> getConteudo()
    {
        return (abstractConteudos);
    }

    public LinkedHashSet<Dev> getDevs()
    {
        return (devs);
    }

    /**
     *
     * SETTERS
     *
     */
    public void addConteudo(AbstractConteudo abstractConteudo)
    {
        abstractConteudos.add(abstractConteudo);
    }

    public void addDev(Dev dev)
    {
        devs.add(dev);
    }
}

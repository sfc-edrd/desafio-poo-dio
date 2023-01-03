package local.lab.learning.dio.oop.entities;

import java.time.LocalDate;

public class Mentoria extends AbstractConteudo
{
    /**
     *
     * ATRIBUTOS DA CLASSE
     *
     */
    private LocalDate   data;

    /**
     *
     * CONSTRUTOR
     *
     */
    public Mentoria(String titulo, String descricao, LocalDate data)
    {
        super(titulo, descricao);
        this.data = data;
    }

    /**
     *
     * GETTERS
     *
     */
    public int calcularXp()
    {
        return (getDefaultXp() * 20);
    }

    @Override
    public String toString()
    {
        return (String.format("Mentoria {\n\ttitulo=%s\n\tdescricao=%s\n\tdata=%s\n}", getTitulo(), getDescricao(), data.toString()));
    }
}

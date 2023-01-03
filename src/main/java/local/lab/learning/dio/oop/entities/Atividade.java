package local.lab.learning.dio.oop.entities;

public class Atividade extends AbstractConteudo
{
    /**
     *
     * ATRIBUTOS DA CLASSE
     *
     */
    private int     cargaHoraria;

    /**
     *
     * CONSTRUTOR
     *
     */
    public Atividade(String titulo, String descricao, int cargaHoraria)
    {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    /**
     *
     * GETTERS
     *
     */

    public int getCargaHoraria()
    {
        return (cargaHoraria);
    }

    @Override
    public int calcularXp()
    {
        return (getDefaultXp() * cargaHoraria);
    }

    @Override
    public String toString()
    {
        return (String.format("Atividade {\n\ttitulo=%s\n\tdescricao=%s\n\tcargaHoraria=%d\n}", getTitulo(), getDescricao(), cargaHoraria));
    }
}

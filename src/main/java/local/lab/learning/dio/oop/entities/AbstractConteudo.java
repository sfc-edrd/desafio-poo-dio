package local.lab.learning.dio.oop.entities;

public abstract class AbstractConteudo
{
    /**
     *
     * ATRIBUTOS DA CLASSE
     *
     */
    private int     defaultXp;
    private String  titulo;
    private String  descricao;

    /**
     *
     * CONSTRUTOR
     *
     */
    protected AbstractConteudo(String titulo, String descricao)
    {
        this.titulo = titulo.trim();
        this.descricao = descricao.trim();
        defaultXp = 10;
    }

    /**
     *
     * GETTERS
     *
     */
    protected String getTitulo()
    {
        return (titulo);
    }

    protected String getDescricao()
    {
        return (descricao);
    }

    protected int getDefaultXp()
    {
        return (defaultXp);
    }

    public abstract int calcularXp();
}

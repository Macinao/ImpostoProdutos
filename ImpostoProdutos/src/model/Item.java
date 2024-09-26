package model;

public abstract class Item {
    private int codigo;
    private String descricao;
    private double valor;
    private double impostoCalculado;
    private double total;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setImpostoCalculado(double impostoCalculado) {
        this.impostoCalculado = impostoCalculado;
    }

    public double getImpostoCalculado() {
        return impostoCalculado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = getValor() + getImpostoCalculado();
    }

    @Override
    public String toString() {
        return String.format(
                "Item{" +
                        "codigo = %d, " +
                        "descricao = '%s', " +
                        "valor = %.2f, " +
                        "impostoCalculado = %.2f, " +
                        "total = %.2f}",
                codigo,
                descricao,
                valor,
                impostoCalculado,
                total
        );
    }

}

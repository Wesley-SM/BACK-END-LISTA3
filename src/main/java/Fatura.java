public class Fatura {
    private String numero;
    private String descricao;
    private Integer quantidade;
    private Double precoPorItem;

    // Construtor
    public Fatura(String numero, String descricao, Integer quantidade, Double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;

        // Regra: se quantidade for negativa, ajusta para 0
        this.quantidade = (quantidade < 0) ? 0 : quantidade;

        // Regra: se preço for negativo, ajusta para 0.0
        this.precoPorItem = (precoPorItem < 0.0) ? 0.0 : precoPorItem;
    }

    // Getters e Setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = (quantidade < 0) ? 0 : quantidade;
    }

    public Double getPrecoPorItem() { return precoPorItem; }
    public void setPrecoPorItem(Double precoPorItem) {
        this.precoPorItem = (precoPorItem < 0.0) ? 0.0 : precoPorItem;
    }

    // Método para calcular o total
    public Double getTotalFatura() {
        return quantidade * precoPorItem;
    }
}

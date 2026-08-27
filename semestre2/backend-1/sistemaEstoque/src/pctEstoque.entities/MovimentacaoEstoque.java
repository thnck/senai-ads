package pctEstoque.entities;

import java.time.LocalDateTime;

public class MovimentacaoEstoque {
    //idProduto, tipoMov, quantidade e data


    private int idProduto;
    private TipoMovimentacao tipo;
    private int quantidade;
    private LocalDateTime datahora;

    public MovimentacaoEstoque(int idProduto, TipoMovimentacao tipo, int quantidade, LocalDateTime datahora){
        this.idProduto = idProduto;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.datahora = datahora;
    }

    //getters

    public int getIdProduto(){
        return idProduto;
    }
    public TipoMovimentacao getTipo(){
        return tipo;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public LocalDateTime getDatahora(){
        return datahora;
    }

    //setters

    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
    public void setTipo(TipoMovimentacao tipo){
        this.tipo = tipo;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setDatahora(LocalDateTime datahora){
        this.datahora = datahora;
    }


    public String  toCSV() {
        return idProduto + "; " + tipo + "; " + quantidade + "; " + datahora.toString();

    }
    public static MovimentacaoEstoque fromCSV(String linha){
        String[] partes= linha.split(";");
        int idProduto = Integer.parseInt(partes[0]);
        TipoMovimentacao tipo = TipoMovimentacao.valueOf(partes[1]);
        int quantidade = Integer.parseInt(partes[2]);
        LocalDateTime datahora = LocalDateTime.parse(partes[3]);
        return new MovimentacaoEstoque(idProduto,tipo,quantidade,datahora);
    }

    @Override
    public String toString(){
        return String.format("ID do Produto: %d || Tipo da Movimentação: %-20s || Qtd: 5d || Data: R$ %s", idProduto, tipo, quantidade, datahora.toString());
    }
}


package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Pedido implements Faturavel{
    private Long id;
    private LocalDate dataPedido;
    private Pedido pedido;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<PedidoItens> itens;

    public Pedido(Long id, LocalDate dataPedido, Pedido pedido, Cliente cliente, Vendedor vendedor, List<PedidoItens> itens) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.pedido = pedido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<PedidoItens> getItens() {
        return itens;
    }

    public void setItens(List<PedidoItens> itens) {
        this.itens = itens;
    }

    @Override
    public LocalDate getDataFatura() {
        return this.dataPedido;
    }

    @Override
    public BigDecimal getValorTotalFaturamento() {
        BigDecimal valorTotal = BigDecimal.ZERO;

        for (int i=0; i<=this.itens.size(); i++){
            valorTotal = valorTotal.add(this.itens.get(i).getValorTotal());
        }
        return valorTotal;
    }

    @Override
    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public Vendedor getVendedor() {
        return this.vendedor;
    }
}

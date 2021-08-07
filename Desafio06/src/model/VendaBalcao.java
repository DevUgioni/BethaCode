package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class VendaBalcao implements Faturavel{
    private Long id;
    private LocalDate dataPedido;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<VendaBalcaoItens> itens;

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

@Entity
@Table(name = "EntregaProduto")
public class EntregaProduto {
    
    @Column(name = "id_produto")
    private Integer id_entregaProduto;
    
    @Column(name = "produto")
    private Produto produto;
    
    @Column(name = "quantidade")
    private Integer quantidade;
}

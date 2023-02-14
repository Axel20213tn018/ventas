package mx.edu.utez.ventas.models.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.ventas.models.transaction.Transaction;
import mx.edu.utez.ventas.models.user.User;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "products")
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false, columnDefinition = "decimal")
    private Double price;
    @Column(nullable = false, columnDefinition = "tinyint default 1")
    private Boolean available;

    @OneToMany(mappedBy = "product")
    private List<Transaction> transactions;
}

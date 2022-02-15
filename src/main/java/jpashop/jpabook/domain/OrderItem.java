package jpashop.jpabook.domain;

import jdk.jfr.Category;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_item_id")
    private Order order;

    private String name;
    private int price;
    private int stockQuantity;


    private List<Category> categories;



}
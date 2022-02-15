package jpashop.jpabook.domain;

import javax.persistence.*;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Order order;

    @Embedded
    private Address address;

    @Enumerated
    private DeliveryStatus status;


}
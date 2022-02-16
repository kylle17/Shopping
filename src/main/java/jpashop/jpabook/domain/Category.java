package jpashop.jpabook.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Category {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private List<Item> items = new ArrayList<>();

    private Category parent;

    private List<Category> child;

}

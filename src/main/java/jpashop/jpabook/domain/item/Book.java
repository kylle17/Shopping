package jpashop.jpabook.domain.item;

import jpashop.jpabook.domain.Item;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Book extends Item {

    private String author;
    private String isbn;
}

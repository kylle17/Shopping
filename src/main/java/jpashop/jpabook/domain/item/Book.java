package jpashop.jpabook.domain.item;

import jpashop.jpabook.domain.Item;

import javax.persistence.Inheritance;

public class Book extends Item {

    private String author;
    private String isbn;
}

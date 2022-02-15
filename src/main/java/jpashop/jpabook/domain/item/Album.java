package jpashop.jpabook.domain.item;


import jpashop.jpabook.domain.Item;
import javax.persistence.Inheritance;

public class Album extends Item {

    private String artist;
    private String etc;

}

package jpashop.jpabook.domain.item;


import jpashop.jpabook.domain.Item;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Album extends Item {

    private String artist;
    private String etc;

}

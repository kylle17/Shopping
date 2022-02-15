package jpashop.jpabook.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class Address {
    String city;
    String street;
    String zipcode;
}
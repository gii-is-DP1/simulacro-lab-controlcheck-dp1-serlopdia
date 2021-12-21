package org.springframework.samples.petclinic.product;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends NamedEntity {
	@Min(0)
    double price;
	@ManyToOne
    ProductType productType;
}

package com.tyss.ecart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customerorder")
public class CustomerOrder implements Serializable {

	private static final long serialVersionUID = -6571020025726257848L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerOrderId;

	@OneToOne
	@JoinColumn(name = "cartId")
	private Cart cart;

	@OneToOne
	@JoinColumn(name = "customerId")
	private Customer customer;

	@OneToOne
	@JoinColumn(name = "shippingAddressId")
	private ShippingAddress shippingAddress;

	@OneToOne
	@JoinColumn(name = "billingAddressId")
	private BillingAddress billingAddress;
}

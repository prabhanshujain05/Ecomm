package com.springboot.mydemo.model.supplier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.springboot.mydemo.model.support.IbSupport;

@Entity
public class Supplier extends IbSupport{
	
	@Id
	@GeneratedValue(generator = "suplier_generator")
	@SequenceGenerator(
			name = "supplier_generator",
			sequenceName = "supplier_sequence",
			initialValue = 100000
			)
	private long id ;
	
	
	String name;
	
	long contactNumber;
	
	String Address;
	
	String
	
	

}

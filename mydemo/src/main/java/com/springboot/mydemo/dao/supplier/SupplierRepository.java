package com.springboot.mydemo.dao.supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.mydemo.model.supplier.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

	public Supplier findBymailIdAndPassword(String mailId, String password);

}

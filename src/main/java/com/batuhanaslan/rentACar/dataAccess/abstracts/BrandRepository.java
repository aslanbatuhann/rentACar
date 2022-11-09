package com.batuhanaslan.rentACar.dataAccess.abstracts;

import com.batuhanaslan.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
}

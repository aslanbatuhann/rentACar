package com.batuhanaslan.rentACar.business.concretes;

import com.batuhanaslan.rentACar.business.abstracts.BrandService;
import com.batuhanaslan.rentACar.business.requests.CreateBrandRequest;
import com.batuhanaslan.rentACar.business.responses.GetAllBrandsResponse;
import com.batuhanaslan.rentACar.dataAccess.abstracts.BrandRepository;
import com.batuhanaslan.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = new ArrayList<GetAllBrandsResponse>();

        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponses.add(responseItem);
        }
        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());

        this.brandRepository.save(brand);
    }
}

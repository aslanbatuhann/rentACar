package com.batuhanaslan.rentACar.business.abstracts;

import com.batuhanaslan.rentACar.business.requests.CreateBrandRequest;
import com.batuhanaslan.rentACar.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {

    List<GetAllBrandsResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);
}

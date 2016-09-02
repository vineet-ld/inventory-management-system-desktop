/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.organization;

import com.neu.phmis.business.inventory.ProductDirectory;
import com.neu.phmis.business.role.ProductManagerRole;
import com.neu.phmis.business.role.Role;

/**
 *
 * @author Vineet
 */
public class ProductOrganization extends Organization {

    private ProductDirectory productDirectory;

    public ProductOrganization() {
        organizationName = ORGANIZATION_PRODUCT;
        productDirectory = new ProductDirectory();
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }

    @Override
    public Role getSupportedRoles() {
        return new ProductManagerRole();
    }

}

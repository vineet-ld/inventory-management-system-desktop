/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.phmis.business.organization;

import com.neu.phmis.business.resource.ResourceDirectory;
import com.neu.phmis.business.role.ResourceManagerRole;
import com.neu.phmis.business.role.Role;

/**
 *
 * @author Vineet
 */
public class ResourceOrganization extends Organization {

    private ResourceDirectory resourceDirectory;

    public ResourceOrganization() {
        organizationName = ORGANIZATION_RESOURCE;
        resourceDirectory = new ResourceDirectory();
    }

    public ResourceDirectory getResourceDirectory() {
        return resourceDirectory;
    }

    public void setResourceDirectory(ResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
    }

    @Override
    public Role getSupportedRoles() {
        return new ResourceManagerRole();
    }

}

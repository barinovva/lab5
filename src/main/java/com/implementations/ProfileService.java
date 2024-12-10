package com.implementations;

import com.annotition.AutoInjectable;
import com.interfaces.Repository;
import com.interfaces.Service;

public class ProfileService implements Service {
    @AutoInjectable
    private Repository repository;

    public ProfileService() {
    }

    public ProfileService(Repository repository) {
        this.repository = repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}

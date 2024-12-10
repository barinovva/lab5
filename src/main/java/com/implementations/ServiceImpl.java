package com.implementations;

import com.annotition.AutoInjectable;
import com.interfaces.Repository;
import com.interfaces.Service;

public class ServiceImpl implements Service {
    @AutoInjectable
    private Repository repository;

    public ServiceImpl() {
    }

    public ServiceImpl(Repository repository) {
        this.repository = repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}

package com.implementations;

import com.annotition.AutoInjectable;
import com.interfaces.Repository;
import com.interfaces.Service;

public class MessengerService implements Service {
    @AutoInjectable
    private Repository repository;

    public MessengerService() {
    }

    public MessengerService(Repository repository) {
        this.repository = repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}

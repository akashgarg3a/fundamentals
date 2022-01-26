package com.pluralsight.fundamentals.resolver;

import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.repository.ApplicationRepository;
import org.springframework.stereotype.Component;

@Component
public class Query {
    private ApplicationRepository applicationRepository;

    public Query(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Iterable<Application> findAllApplications() {
        return applicationRepository.findAll();
    }

    public long countApplications() {
        return applicationRepository.count();
    }
}

package com.hcy308.lombok.service;

import com.hcy308.lombok.ApplicationTests;
import com.hcy308.lombok.model.Domain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DomainServiceTests extends ApplicationTests {

    @Autowired
    private DomainService domainService;

    @Test
    public void listAll() {
        List<Domain> domains = domainService.getAll();
        Assert.assertEquals(domains.size(), 1);
    }

}

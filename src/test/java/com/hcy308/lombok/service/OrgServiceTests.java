package com.hcy308.lombok.service;

import com.hcy308.lombok.ApplicationTests;
import com.hcy308.lombok.model.Org;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrgServiceTests extends ApplicationTests {

    @Autowired
    private OrgService orgService;

    @Test
    public void listAll() {
        List<Org> domains = orgService.getAll();
        Assert.assertEquals(domains.size(), 1);
    }

}

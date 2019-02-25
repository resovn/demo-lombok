package com.hcy308.lombok.service;

import com.hcy308.lombok.model.Org;
import com.hcy308.lombok.repository.OrgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgServiceImpl implements OrgService {

    private final OrgRepository orgRepository;

    @Autowired
    public OrgServiceImpl(OrgRepository orgRepository) {
        this.orgRepository = orgRepository;
    }

    @Override
    public List<Org> getAll() {
        return orgRepository.findAll();
    }
}

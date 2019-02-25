package com.hcy308.lombok.repository;

import com.hcy308.lombok.model.Org;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgRepository extends JpaRepository<Org, Long> {
}

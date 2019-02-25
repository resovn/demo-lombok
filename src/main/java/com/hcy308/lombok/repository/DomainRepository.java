package com.hcy308.lombok.repository;

import com.hcy308.lombok.model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository extends JpaRepository<Domain, Long> {
}

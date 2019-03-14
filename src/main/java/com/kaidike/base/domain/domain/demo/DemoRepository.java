package com.kaidike.base.domain.domain.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Long>, DemoRepositoryCustom {


}

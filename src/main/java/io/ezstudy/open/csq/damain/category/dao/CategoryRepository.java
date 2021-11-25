package io.ezstudy.open.csq.damain.category.dao;

import io.ezstudy.open.csq.damain.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

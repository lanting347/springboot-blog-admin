package com.blog.responsitory;

import com.blog.domain.Category;
import com.blog.dto.CategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Map;

public interface CategoryRepository extends JpaRepository<Category,Long>,JpaSpecificationExecutor<Category>{

    Category findCategoryByCategoryName(String categoryName);

}

package io.ezstudy.open.csq.damain.category.service;

import io.ezstudy.open.csq.damain.category.dao.CategoryMapper;
import io.ezstudy.open.csq.damain.category.dao.CategoryRepository;
import io.ezstudy.open.csq.damain.category.domain.Category;
import io.ezstudy.open.csq.damain.category.dto.CategoryDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    CategoryMapper categoryMapper;

    public CategoryService(CategoryMapper categoryMapper){
        this.categoryMapper = categoryMapper;
    }

    public void save(CategoryDto categoryDto){

        Category category = categoryMapper.toEntity(categoryDto);   //DTO -> Entity

        categoryRepository.save(category);  //entity를 저장
    }

    public List<CategoryDto> selectCategory(){
        List<Category> categoryList =  categoryRepository.findAll();
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        for(Category category : categoryList){
            categoryDtoList.add(categoryMapper.toDto(category));
        }
        return categoryDtoList;
    }
}

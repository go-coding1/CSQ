package io.ezstudy.open.csq.damain.category.controller;

import io.ezstudy.open.csq.damain.category.dto.CategoryDto;
import io.ezstudy.open.csq.damain.category.service.CategoryService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/category")
    public void getCategory(){
        for(CategoryDto categoryDto :categoryService.selectCategory()){
            System.out.println(categoryDto.getName() + " : " + categoryDto.getId());
        }

    }

    @PostMapping("/category")
    public String postCategory(){
        CategoryDto categoryDto = CategoryDto.builder()
                                    .name("test")
                                    .created_at(LocalDateTime.now())
                                    .updated_at(LocalDateTime.now())
                                    .deleted_at(LocalDateTime.now())
                                    .build();
        categoryService.save(categoryDto);

        return "성공했습니다!";
    }
}

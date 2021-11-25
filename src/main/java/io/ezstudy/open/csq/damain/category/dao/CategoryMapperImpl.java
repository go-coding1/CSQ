package io.ezstudy.open.csq.damain.category.dao;

import io.ezstudy.open.csq.damain.category.domain.Category;
import io.ezstudy.open.csq.damain.category.dto.CategoryDto;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-25T17:09:12+0900",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.2.jar, environment: Java 16.0.1 (AdoptOpenJDK)"
)
@Component
@Mapper
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toEntity(CategoryDto dto) {
        if (dto == null) {
            return null;
        }

        long id = 0L;
        String name = dto.getName();
        LocalDateTime created_at = dto.getCreated_at();
        LocalDateTime updated_at = dto.getUpdated_at();
        LocalDateTime deleted_at = dto.getDeleted_at();

        Category category = new Category(id, name, created_at, updated_at, deleted_at);

        return category;
    }

    @Override
    public CategoryDto toDto(Category entity) {
        if (entity == null) {
            return null;
        }

        CategoryDto categoryDto = CategoryDto.builder()
                                    .id(entity.getId())
                                    .name(entity.getName())
                                    .created_at(entity.getCreated_at())
                                    .updated_at(entity.getUpdated_at())
                                    .deleted_at(entity.getDeleted_at()).build();

        return categoryDto;
    }
}

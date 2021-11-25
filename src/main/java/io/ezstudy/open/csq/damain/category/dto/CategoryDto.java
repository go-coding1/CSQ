package io.ezstudy.open.csq.damain.category.dto;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class CategoryDto {

    private String id;

    private String name;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private LocalDateTime deleted_at;
}

package io.ezstudy.open.csq.damain.category.domain;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Entity
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(columnDefinition = "VARCHAR(36)", insertable = false, updatable = false, nullable = false)
    private String id;
    private String name;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private LocalDateTime deleted_at;


    @Builder
    public Category(String id, String name, LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime deleted_at){
        this.id = id;
        this.name = name;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
    }

}

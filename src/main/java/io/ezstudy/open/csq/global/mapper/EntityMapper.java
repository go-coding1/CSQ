package io.ezstudy.open.csq.global.mapper;

public interface EntityMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);

    //list to entity dto

    //update from dto dto로 entity 바꿔주는것
}

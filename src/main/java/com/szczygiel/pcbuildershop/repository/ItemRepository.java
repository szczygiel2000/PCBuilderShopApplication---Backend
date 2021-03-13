package com.szczygiel.pcbuildershop.repository;

import com.szczygiel.pcbuildershop.model.Item;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("SELECT i from Item i where i.category.Id = ?1")
    List<Item> findAllByCategoryId(Long categoryId, PageRequest of);
}

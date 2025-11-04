package com.andaruhp.datajpa.repositories;

import com.andaruhp.datajpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}

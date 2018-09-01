package com.mybooks.repository;

import com.mybooks.domain.Book;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Book entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query(value = "select count(*) from book where jhi_read = true", nativeQuery = true)
    Integer booksReadCount();
}

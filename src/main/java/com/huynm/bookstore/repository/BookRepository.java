package com.huynm.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huynm.bookstore.entities.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface BookRepository extends JpaRepository<Book, Integer>{

    @Query(value = "SELECT * FROM tblBook WHERE id in (SELECT a.BookID FROM TblBook_SubCategory as a WHERE a.SubCategoryID = id)",nativeQuery = true)
    List<Book> getBooksByCategory(@Param("id") int id);

    @Query(value = "SELECT * FROM tblBook a WHERE a.authors like '%author%'",nativeQuery = true)
    Set<Book> searchBookByAuthor(@Param("author") String author);

    @Query(value = "SELECT * FROM tblBook a WHERE a.name like '%name%'",nativeQuery = true)
    Set<Book> searchBookByName(@Param("name") String name);
}

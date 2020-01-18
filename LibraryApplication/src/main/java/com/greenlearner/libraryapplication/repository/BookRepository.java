package com.greenlearner.libraryapplication.repository;

import com.greenlearner.libraryapplication.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    @Transactional
    @Modifying
    @Query("update Book u set u.name=?2 where u.id=?1")
    int updateAddress(long id, String name);
}

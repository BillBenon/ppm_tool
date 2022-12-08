package com.example.Librosys.repository;

import com.example.Librosys.models.Book;
import com.example.Librosys.repositories.BookRepo;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class bookRepoTest {
    @Mock
    private BookRepo bookRepo;

    @Test
    public void findAll_success () {
        List<Book> books = bookRepo.findAll();
        assertEquals(2, books.size());
    }



}

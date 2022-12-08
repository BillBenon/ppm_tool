package com.example.Librosys.models;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static org.testng.AssertJUnit.assertEquals;

public class bookmodelTest {
    Book book = new Book(1243423, "Ugly Love", "Collen Hover", "Hover Collection" );
    @Test
    public void getBookTitle(){

        assertEquals("Ugly Love", book.getTitle());
    }
    @Test
    public void getAuthorTest(){
        String Author = "Collen Hover";
        Book book1 = new Book(137598, "Ugly Love", "Collen Hover","Hover Collection");
        assertEquals(Author, book1.getAuthor());
    }
}

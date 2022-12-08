package com.example.Librosys.models;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class transactionsModelTest {
    @Test
    public void createTransaction_success(){
        Student student = new Student(5,"Larissa", "Teta", "tetalarissa69@gmail.com");
        Book book = new Book(4,415628421, "Ugly love", "Collen Hover", "Collen");
        Transaction transaction = new Transaction(book, student, Status.BORROWED);
        assertEquals("BORROWED", Status.BORROWED.getStatus());
    }
}

package com.example.Librosys.models;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class studentModelTest {
    @Test
    public void getfirstnameTest(){
         Student student= new Student("larissa", "teta", "tetalarissa69@gmail.com");
         assertEquals("teta", student.getLastname());
     }
}

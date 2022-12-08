package com.example.Librosys.repository;

import com.example.Librosys.models.Student;
import com.example.Librosys.repositories.StudentRepo;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class studentRepoTest {
    @Mock
    StudentRepo studentRepo;

    @Test
    public void findAll_success(){
        List<Student> studentList = studentRepo.findAll();
        assertEquals(2, studentList.size());

    }
}

package com.example.Librosys;

import com.example.Librosys.models.Student;
import com.example.Librosys.repositories.StudentRepo;
import com.example.Librosys.services.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class LibrosysApplicationTests {

	@Autowired
	private StudentServiceImpl userService;

	@MockBean
	private StudentRepo userRepo;
	@Test
	public void getUsersTest(){
		when(userRepo.findAll()).thenReturn(Stream.of(new Student("larissa", "teta", "tetalarissa@gmail.com"),
				new Student("hirwa", "Gabriel", "hirwa@gmail.com")).collect(Collectors.toList()));
		assertEquals(2, userService.getAll().size());
	}

	public void getUserByIdTest(){

	}

}

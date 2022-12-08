package com.example.Librosys.controllers;

import com.example.Librosys.models.Book;
import com.example.Librosys.models.Student;
import com.example.Librosys.services.BookServiceImp;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockHttpServletRequestDsl;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class bookControllerTest {

    @InjectMocks
    private BookServiceImp bookServiceImp;

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void getAllSuccess() throws Exception {
        List<Book> asList = Arrays.asList(new Book(19921239, "After", "Anna Todd","Bakame Edition"),
                new Book(12934888, "After we fell","Anna Todd", "Bakame Edition"));
        when(bookServiceImp.getAll()).thenReturn(asList);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get("/books")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = (MvcResult) mockMvc
                .perform(request)
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().json("[{\"title\":\"Ugly\",\"author\":\"Larissa\",\"publishers\":\"coll\"}]"))
                .andReturn();
    }
}

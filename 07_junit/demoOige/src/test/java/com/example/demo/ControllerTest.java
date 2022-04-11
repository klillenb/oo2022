package com.example.demo;

import com.example.demo.api.PersonController;
import com.example.demo.dao.FakePersonDataAccessService;
import com.example.demo.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Optional;
import java.util.UUID;

import static io.restassured.RestAssured.given;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {

    private MockMvc mvc;

    Person person = new Person(UUID.randomUUID(), "James Bond");

    @Mock
    private FakePersonDataAccessService personRepository;

    @InjectMocks
    private PersonController personController

    private JacksonTester<Person> jsonPerson;

    @BeforeEach
    public void setup(){
        JacksonTester.initFields(this, new ObjectMapper());
        mvc = MockMvcBuilders.standaloneSetup(personController).build();
    }

    public void canRetrieveByNameWhenExists() throws Exception {
        given(personRepository.selectPersonByName("James Bond"))
                .willReturn(Optional.of(new Person(UUID.randomUUID(), "James Bond")));

        MockHttpServletResponse response = mvc.perform(get("api/v1/person/"))
    } https://thepracticaldeveloper.com/guide-spring-boot-controller-tests/
}

package com.example.demo.service;

import com.example.demo.dao.FakePersonDataAccessService;
import com.example.demo.model.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

class PersonServiceTest {

    @Mock //jäljendame repot
    private FakePersonDataAccessService personRepo;
    private AutoCloseable autoCloseable;
    private PersonService underTest; //testitav klass

    @BeforeEach
    void setUp() {
        //käivitab jäljendava repo
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new PersonService(personRepo);
    }

    @AfterEach
    void tearDown() throws Exception {
        //sulgeb käivitatud repo
        autoCloseable.close();
    }

    @Test
    void canGetAllPeople(){
        //when
        underTest.getAllPeople();
        //then
        verify(personRepo).selectAllPeople();
    }

    @Test
    void canAddPerson() {
        //given
        Person person = new Person(UUID.randomUUID(), "James Bond");
        //when
        //kutsub välja meetodi
        underTest.addPerson(person);

        //then
        //püüab kinni saadetud väärtuse ja veendub selles
        ArgumentCaptor<Person> personArgumentCaptor = ArgumentCaptor.forClass(Person.class);
        verify(personRepo).insertPerson(personArgumentCaptor.capture());

        //kontrollib et oleksid samad andmed
        Person capturedPerson = personArgumentCaptor.getValue();
        assertThat(capturedPerson).isEqualTo(person);
    }

    @Test
    void canGetPersonByName() {
        //given
        Person person = new Person(UUID.randomUUID(), "Maali Maasikas");
        underTest.addPerson(person);

        //when
        underTest.getPersonByName("Maali Maasikas");

        //then
        //kontrollin et õige meetod kutsutakse
        verify(personRepo).selectPersonByName("Maali Maasikas");
    }
}
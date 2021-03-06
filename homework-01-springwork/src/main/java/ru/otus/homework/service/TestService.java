package ru.otus.homework.service;

import ru.otus.homework.dao.CommunicationDao;
import ru.otus.homework.domain.Person;
import ru.otus.homework.domain.PersonAnswer;
import ru.otus.homework.domain.PersonTest;

public interface TestService {
    PersonAnswer runTest(Person person, PersonTest test, CommunicationDao communicationDao);
    void getResultTest(PersonAnswer personAnswer, CommunicationDao communicationDao);
}

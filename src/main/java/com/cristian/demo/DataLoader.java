package com.cristian.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

@Autowired
CourseRepository repository;

@Override
public void run(String... strings) throws Exception{
        Course course;
        course = new Course(1, "Neil D Tyson", "Just a course on stars", "Just a course on stars", 3);
        repository.save(course);

        course = new Course(2, "Carol Henley", "Rate of Change of the Rate of Change", "Rate of Change of the Rate of Change" , 3);
        repository.save(course);

        course = new Course(3, "Geraldine Pegram", "Learn your language children", "Rate of Change of the Rate of Change" , 3);
        repository.save(course);
    }
}

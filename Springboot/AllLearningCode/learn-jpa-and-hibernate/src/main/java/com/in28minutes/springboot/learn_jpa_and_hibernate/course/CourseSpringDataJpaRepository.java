package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CourseSpringDataJpaRepository extends JpaRepository<Course , Long> {
    List<Course> findByAuthor (String author);
    List<Course> findByName (String name);
}

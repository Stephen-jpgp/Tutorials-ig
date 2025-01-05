package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository jdbcRepository;

    @Autowired
    private CourseJpaRepository jpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository springDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        jdbcRepository.insert(new Course(1,"Learn AWS Now!", "in28minutes"));
        jdbcRepository.insert(new Course(2,"Learn GSP!", "in28minutes"));
        jdbcRepository.insert(new Course(3,"Learn Java!", "in28minutes"));
        jdbcRepository.deleteById(2);
        System.out.println(jdbcRepository.findById(1));

        jpaRepository.insert(new Course(4,"Learn new AWS Now!", "in28minutes"));
        jpaRepository.insert(new Course(5,"Learn new GSP!", "in28minutes"));
        jpaRepository.insert(new Course(6,"Learn new Java!", "in28minutes"));
        jpaRepository.deleteById(4);
        System.out.println(jpaRepository.findById(6));

        springDataJpaRepository.save(new Course(7,"Learn Nihility!", "in28minutes"));
        springDataJpaRepository.save(new Course(8,"Learn Erudition", "in28minutes"));
        springDataJpaRepository.save(new Course(9,"Learn Harmony", "in28minutes"));
        springDataJpaRepository.deleteById(9L);
        System.out.println(springDataJpaRepository.findById(8L));

        System.out.println(springDataJpaRepository.findAll());
        System.out.println(springDataJpaRepository.count());

        System.out.println(springDataJpaRepository.findByAuthor("in28minutes"));
        System.out.println(springDataJpaRepository.findByAuthor("")); //=> errortest

        System.out.println(springDataJpaRepository.findByName("Learn Nihility!"));
        System.out.println(springDataJpaRepository.findByName("in28minutes")); //=>errortest
    }
}

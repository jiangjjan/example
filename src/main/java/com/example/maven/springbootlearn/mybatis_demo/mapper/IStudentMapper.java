package com.example.maven.springbootlearn.mybatis_demo.mapper;

import java.util.List;

import com.example.maven.springbootlearn.mybatis_demo.entity.Student;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IStudentMapper{
    List<Student> selectStudent(Student student);

	int insertStudent(Student s);
}
package com.brightsonmacha.soapwsdlwebservice.endpoints;


import com.brightsonmacha.generated.school.Student;
import com.brightsonmacha.generated.school.StudentDetailsRequest;
import com.brightsonmacha.generated.school.StudentDetailsResponse;
import com.brightsonmacha.soapwsdlwebservice.dto.Student2;
import com.brightsonmacha.soapwsdlwebservice.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class Student2Endpoint {

    private static final String NAMESPACE_URI = "http://brightsonmacha.com/generated/school";

    private StudentRepository studentRepository;

    @Autowired
    public Student2Endpoint(StudentRepository StudentRepository) {
        this.studentRepository = StudentRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
    @ResponsePayload
    public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) {
        StudentDetailsResponse response = new StudentDetailsResponse();
        Student student = new Student();
        Student2 student2 = studentRepository.findStudent(request.getName());
        student.setName(student2.getName());
        student.setAddress(student2.getAddress());
        response.setStudent(student);

        return response;
    }
}

package com.digitalhouse.soap.ws.client.test;

import com.digitalhouse.soap.ws.client.generated.StudentDetailsPort;
import com.digitalhouse.soap.ws.client.generated.StudentDetailsPortService;
import com.digitalhouse.soap.ws.client.generated.StudentDetailsRequest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudentService {

    @Test
    public void getStudentDetailWhenNameDiogenes_thenReturnFive(){
        StudentDetailsPortService service = new StudentDetailsPortService();
        StudentDetailsPort studentService = service.getStudentDetailsPortSoap11();

        StudentDetailsRequest request = new StudentDetailsRequest();
        request.setName("Diogenes");
        assertEquals("5", studentService.studentDetails(request).getStudent().getStandard());
    }


}

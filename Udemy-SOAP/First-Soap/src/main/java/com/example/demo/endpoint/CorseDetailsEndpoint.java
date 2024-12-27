package com.example.demo.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.demo.beans.Course;
import com.example.demo.exception.CourseException;
import com.example.demo.service.CourseDetailsService;
import com.example.demo.service.CourseDetailsService.Status;
import com.udemy.soap.courses.CourseDetails;
import com.udemy.soap.courses.DeleteCourseDetailsRequest;
import com.udemy.soap.courses.DeleteCourseDetailsResponse;
import com.udemy.soap.courses.GetAllCourseDetailsRequest;
import com.udemy.soap.courses.GetAllCourseDetailsResponse;
import com.udemy.soap.courses.GetCourseDetailsRequest;
import com.udemy.soap.courses.GetCourseDetailsResponse;


@Endpoint
public class CorseDetailsEndpoint {
	
	@Autowired
	private CourseDetailsService detailsService;
	
	@PayloadRoot(namespace = "http://soap.udemy.com/courses", localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {

		Course course = detailsService.findById(request.getId());

		if (course == null)
			throw new CourseException("Invalid Course ID " + request.getId());
		else
			return mapCourseDetails(course);
	}

	
	@PayloadRoot(namespace = "http://soap.udemy.com/courses", localPart = "GetAllCourseDetailsRequest")
	@ResponsePayload
	public GetAllCourseDetailsResponse processAllCourseDetailsRequest(@RequestPayload GetAllCourseDetailsRequest request) {

		List<Course> course = detailsService.findAllCourses();
		
		return mapAllCourseDetails(course);
	}
	
	private GetAllCourseDetailsResponse mapAllCourseDetails(List<Course> courses) {
		GetAllCourseDetailsResponse response = new GetAllCourseDetailsResponse();
		for(Course course:courses) {
			CourseDetails mapCourse = mapCorse(course);
			response.getCourseDetails().add(mapCourse);
		}
		
		return response;
	}


	private GetCourseDetailsResponse mapCourseDetails(Course course) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		CourseDetails courseDetails = mapCorse(course);
		response.setCourseDetails(courseDetails);
		
		return response;
	}

	private CourseDetails mapCorse(Course course) {
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(course.getId());
		courseDetails.setName(course.getName());
		courseDetails.setDescription(course.getDescription());
		return courseDetails;
	}
	
	@PayloadRoot(namespace = "http://soap.udemy.com/courses", localPart = "DeleteCourseDetailsRequest")
	@ResponsePayload
	public DeleteCourseDetailsResponse deleteCourseDetailsRequest(@RequestPayload DeleteCourseDetailsRequest request) {

		Status status = detailsService.deleteById(request.getId());

		DeleteCourseDetailsResponse response = new DeleteCourseDetailsResponse();
		
		response.setStatus(mapStatus(status));
		return response;
	}


	private com.udemy.soap.courses.Status mapStatus(Status status) {
		if(status == Status.FAILURE) {
			return com.udemy.soap.courses.Status.FAILURE;
		}else {
			return com.udemy.soap.courses.Status.SUCCESS;
		}
	}
	
}

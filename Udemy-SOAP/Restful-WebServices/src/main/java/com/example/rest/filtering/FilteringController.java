package com.example.rest.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public MappingJacksonValue filtering() {
		FilterBean filterBean = new FilterBean("value1", "value2", "value3");
		
		MappingJacksonValue jacksonValue = new MappingJacksonValue(filterBean);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		jacksonValue.setFilters(filters);
		
		return jacksonValue;
	}
	
	@GetMapping("/filtering-list")
	public MappingJacksonValue filteringList(){
		List<FilterBean> list = Arrays.asList(new FilterBean("value1", "value2", "value3"), new FilterBean("value4", "value5", "value6"));
		
		MappingJacksonValue jacksonValue = new MappingJacksonValue(list);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		jacksonValue.setFilters(filters);
		return jacksonValue;
	}

}

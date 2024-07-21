package com.nt;

import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockWithSpy {
	
	@Test
	public void testList() {
	 List<String> mockList=Mockito.mock(ArrayList.class);	//mock
	// List<String> listSpy=Mockito.spy(new ArrayList<>());  //spy  or
	 List<String> listSpy=Mockito.spy(ArrayList.class);  //spy

	mockList.add("table");
	Mockito.when(mockList.size()).thenReturn(10);  //stub
	listSpy.add("table");
	Mockito.when(listSpy.size()).thenReturn(10); 
	System.out.println("mockito::"+mockList.size()+" Spy:: "+listSpy.size());
	}
}

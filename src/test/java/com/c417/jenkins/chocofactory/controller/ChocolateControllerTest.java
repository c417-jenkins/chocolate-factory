package com.c417.jenkins.chocofactory.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.c417.jenkins.chocofactory.model.ChocolateRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ChocolateControllerTest {

	private MockMvc mockMvc;
	
    @InjectMocks
    private ChocolateController controller;
    
    @Before
    public void setUp() throws JsonProcessingException {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders
                .standaloneSetup(controller)
                .build();
    }
    
    @Test
    public void should_return_success_when_call() throws Exception {
    	ChocolateRequest req =new ChocolateRequest();
    	req.setCacao(100);
    	req.setButter(100);
    	req.setCocoaPawder(50);
    	req.setMilk(10);
    	req.setSuger(250);
    	ObjectMapper mapper = new ObjectMapper();
    	byte[] chocoRequest = mapper.writeValueAsString(req).getBytes();
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("/chocolate")
                .content(chocoRequest)
                .contentType("application/json")
                .accept("application/json");
        
        
        ResultActions result = mockMvc.perform(request);

        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$.resultStatus").value("Success"));
   }
}

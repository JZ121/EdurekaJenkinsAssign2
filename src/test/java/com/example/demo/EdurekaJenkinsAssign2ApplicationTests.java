package com.example.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class EdurekaJenkinsAssign2ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void greetingShouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello")));
	}
}

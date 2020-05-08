package com.example.demo.controllers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PagesController.class)
public class PageControllerTest {

	// Accès aux fichers et aux dépendances
	@Autowired
	MockMvc mockMvc;

	@Test
	public void home() throws Exception {
		this.mockMvc.perform(get("/")).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello World !")));

		this.mockMvc.perform(get("/?name=")).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello World !")));

		this.mockMvc.perform(get("/?name=vdelll")).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello Vdelll !")));
		
		this.mockMvc.perform(get("/?name=Vdelll")).andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello Vdelll !")));
	}

}

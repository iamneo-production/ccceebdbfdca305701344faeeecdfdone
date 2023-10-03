package com.examly.springapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class SpringappApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testAdd() throws Exception {
        // Create a JSON representation of the Medicine
        String st = "{\"laptopId\": 10000, \"laptopBrand\": \"Medicine\", \"laptopPrice\": 10}";

        mockMvc.perform(MockMvcRequestBuilders.post("/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(st))  // Send the JSON representation as content
                .andExpect(status().isOk())
                .andExpect(content().string("true"));
    }

   
// @Test
// void testGetOne() throws Exception {
//     // Assuming the contactId of the contact added in test_case1 is 1000
//     mockMvc.perform(MockMvcRequestBuilders.get("/10000")
//             .accept(MediaType.APPLICATION_JSON))
//             .andExpect(MockMvcResultMatchers.status().isOk())
//             .andExpect(jsonPath("$.laptopBrand").value("Medicine"))
//             .andReturn();
// }

@Test
public void testGetOne() throws Exception {
    // Uncomment the lines below and add your test logic:
    int laptopId = 1000;
    mockMvc.perform(MockMvcRequestBuilders.get("/{laptopId}",laptopId ))
            .andExpect(status().isOk());
}

	@Test
	void testGetAll() throws Exception{	

		 mockMvc.perform(MockMvcRequestBuilders.get("/")
		 				.accept(MediaType.APPLICATION_JSON))
                        .andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$").isArray())
						.andReturn();
	}

    
}

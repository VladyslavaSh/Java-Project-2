package ee.taltech.calculator.controller;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.web.servlet.function.RequestPredicates.contentType;


@AutoConfigureMockMvc
@SpringBootTest
class CalculatorTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("index returns greetings from spring boot")
    void indexTest() throws Exception {
        mvc.perform(get("/"))
                .andExpect(status().is4xxClientError())
                .andExpect(content().string(""));
    }

    @Test
    void calc1Test() throws Exception {
        mvc.perform(get("/calculator/calculate1?input=1,2,3"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    void calc1Test2() throws Exception {
        mvc.perform(get("/calculator/calculate1?input=1,2,3"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("{\"minOdd\":1,\"sumOfEven\":2,\"odds\":[1,3]}"));
    }

 /*   @Test
    void calc1Test() {
        mvc.perform(get("/calculator/calculate1?input=1,2,3"))
                .andExpect(contentType(MediaType.APPLICATION_JSON));
                .andExpect(content().json(
                        {
                        "minOdd":1,
                        "sumOfEven":2,
                        "odds":[1,3]
                        }
                        ));
    }*/

}

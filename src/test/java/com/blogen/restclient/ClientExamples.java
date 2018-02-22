package com.blogen.restclient;

import com.blogen.api.v1.controllers.CategoryRestController;
import com.blogen.api.v1.controllers.PostRestController;
import com.blogen.api.v1.controllers.UserRestController;
import com.blogen.api.v1.model.CategoryDTO;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * Rest Client Examples
 * @author Cliff
 */
public class ClientExamples {

    private static final String ROOT_URL = "http://localhost:8080";
    private static final String POST_URL = PostRestController.BASE_URL;
    private static final String CAT_URL = CategoryRestController.BASE_URL;
    private static final String USER_URL = UserRestController.BASE_URL;

    @Test
    public void getCategories() throws Exception {
        String apiUrl = ROOT_URL + CAT_URL;
        RestTemplate restTemplate = new RestTemplate();

        JsonNode jsonNode = restTemplate.getForObject( apiUrl, JsonNode.class );
        System.out.println("Response");
        System.out.println( jsonNode.toString() );
    }

    @Test
    public void createCategory() throws Exception {
        String apiUrl = ROOT_URL + CAT_URL;
        RestTemplate restTemplate = new RestTemplate();

        //create Java object to
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName( "new category" );

        JsonNode jsonNode = restTemplate.postForObject( apiUrl, categoryDTO, JsonNode.class );
        System.out.println("Response");
        System.out.println( jsonNode.toString() );
    }
}

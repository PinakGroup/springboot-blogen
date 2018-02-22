package com.blogen.restclient;

import com.blogen.api.v1.controllers.CategoryRestController;
import com.blogen.api.v1.controllers.PostRestController;
import com.blogen.api.v1.controllers.UserRestController;
import com.blogen.api.v1.model.CategoryDTO;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Rest Client Examples
 *
 * @author Cliff
 */
@RunWith(SpringRunner.class)
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class ClientExamplesIT {

    private static final String POST_URL = PostRestController.BASE_URL;
    private static final String CAT_URL = CategoryRestController.BASE_URL;
    private static final String USER_URL = UserRestController.BASE_URL;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getCategories() throws Exception {

        JsonNode jsonNode = restTemplate.getForObject( CAT_URL, JsonNode.class );
        System.out.println("Response");
        System.out.println( jsonNode.toString() );
    }

    @Test
    public void createCategory() throws Exception {

        //create Java object to
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName( "new category" );

        JsonNode jsonNode = restTemplate.postForObject( CAT_URL, categoryDTO, JsonNode.class );
        System.out.println("Response");
        System.out.println( jsonNode.toString() );
    }
}

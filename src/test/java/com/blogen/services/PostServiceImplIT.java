package com.blogen.services;

import com.blogen.commands.PostCommand;
import com.blogen.commands.mappers.PostCommandMapper;
import com.blogen.domain.Post;
import com.blogen.domain.User;
import com.blogen.repositories.CategoryRepository;
import com.blogen.repositories.PostRepository;
import com.blogen.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

/**
 * Integration Tests for {@link PostServiceImpl}
 *
 * @author Cliff
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceImplIT {

    @Autowired
    private PostServiceImpl postService;


    @Test
    public void getAllPostsByUser() {
        //this user has 3 parent posts
        Long userId = 3L;
        List<PostCommand> commands = postService.getAllPostsByUser( userId );

        assertThat( commands.size(), is(3) );
    }

    @Test
    public void getAllPosts_shouldReturnAllParentPosts() {

    }

    @Test
    public void getPost() {
    }

    @Test
    public void deletePost() {
    }

    @Test
    public void savePostCommand() {
    }

    @Test
    public void updatePostCommand() {
    }


}
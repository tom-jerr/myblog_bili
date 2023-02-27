package com.uestclzy;

import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.crypto.SecretKey;

import static com.uestclzy.utils.JwtUtil.*;


/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/14 12:08
 */
@SpringBootTest(classes = LzyBlogApplication.class)
public class JwtTest {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Test
    public void JwtTEST() throws Exception{
        String encode = passwordEncoder.encode("123456");
        String jwt = createJWT("123456");
        System.out.println(jwt);
        System.out.println(encode);
        //eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2YjllYzZhNzFlNDM0NzI5OTQ1ZjU0YTEzM2Y0Y2Y1MyIsInN1YiI6IjEyMzQ1NiIsImlzcyI6Imx6eSIsImlhdCI6MTY3NjM0ODM4NCwiZXhwIjoxNjc2MzUxOTg0fQ.O39dvuDIbc4M-wArjRZbJetk2G9AEWOhLjIBCvnFy6U
//        Claims claims = parseJWT("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2YjllYzZhNzFlNDM0NzI5OTQ1ZjU0YTEzM2Y0Y2Y1MyIsInN1YiI6IjEyMzQ1NiIsImlzcyI6Imx6eSIsImlhdCI6MTY3NjM0ODM4NCwiZXhwIjoxNjc2MzUxOTg0fQ.O39dvuDIbc4M-wArjRZbJetk2G9AEWOhLjIBCvnFy6U");
//        System.out.println(claims);

    }
}

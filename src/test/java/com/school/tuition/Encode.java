package com.school.tuition;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encode {
    @Test
    public void encode(){
        System.out.println(new BCryptPasswordEncoder().encode("123"));
    }
}

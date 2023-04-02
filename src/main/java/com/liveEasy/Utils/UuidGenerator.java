package com.liveEasy.Utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UuidGenerator {
    public static String generateUuid() {
    	System.out.println(UUID.randomUUID().getClass());
        return UUID.randomUUID().toString();
    }
}

package com.infotech.java8.intermediateOp;
// Question 16: Extract Domain Names from Email Addresses

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractDomainNames {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
            "user1@example.com",
            "user2@domain.com",
            "user3@test.com");

        List<String> domains = emails.stream()
            .map(email -> email.substring(email.indexOf('@') + 1))
            .collect(Collectors.toList());
        System.out.println(domains);
    }
}

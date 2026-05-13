package com.apigateway.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class ApiKeyFilter extends OncePerRequestFilter {

   
    private static final String VALID_API_KEY = "123456";

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {

        String path = request.getRequestURI();

       
        if (path.startsWith("/h2-console")) {
            filterChain.doFilter(request, response);
            return;
        }

       
        String apiKey = request.getHeader("X-API-KEY");

        if (apiKey == null || apiKey.isEmpty()) {

            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.setContentType("application/json");

            response.getWriter().write(
                    "{ \"status\": 401, " +
                    "\"error\": \"Unauthorized\", " +
                    "\"message\": \"Missing X-API-KEY header\" }"
            );
            return;
        }

       
        if (!VALID_API_KEY.equals(apiKey)) {

            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.setContentType("application/json");

            response.getWriter().write(
                    "{ \"status\": 401, " +
                    "\"error\": \"Unauthorized\", " +
                    "\"message\": \"Invalid API Key\" }"
            );
            return;
        }
        
        filterChain.doFilter(request, response);
        System.out.println("API KEY RECEIVED: " + apiKey);
    }
}
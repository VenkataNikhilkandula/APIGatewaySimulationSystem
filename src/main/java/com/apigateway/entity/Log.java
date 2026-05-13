package com.apigateway.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "request_logs")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String requestPath;

    @Column(nullable = false)
    private String method;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false)
    private int status;

    public Log() {
    }

    public Log(String requestPath, String method,
                      LocalDateTime timestamp, int status) {
        this.requestPath = requestPath;
        this.method = method;
        this.timestamp = timestamp;
        this.status = status;
    }

    
    public Long getId() {
        return id;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
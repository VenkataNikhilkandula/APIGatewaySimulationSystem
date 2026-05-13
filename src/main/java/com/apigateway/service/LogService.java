package com.apigateway.service;

import com.apigateway.entity.Log;
import java.util.List;

public interface LogService {

    List<Log> getAllLogs();

    Log getLogById(Long id);

    Log saveLog(Log log);
}
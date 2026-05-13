package com.apigateway.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apigateway.entity.Log;
import com.apigateway.repository.LogRepository;
import com.apigateway.service.LogService;

@Service
public class LogServiceImpl implements LogService {

	@Autowired
    private LogRepository repository;

    @Override
    public Log saveLog(Log log) {
        return repository.save(log);
    }

	@Override
	public List<Log> getAllLogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Log getLogById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
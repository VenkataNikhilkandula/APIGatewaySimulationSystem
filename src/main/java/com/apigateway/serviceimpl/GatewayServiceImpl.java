package com.apigateway.serviceimpl;

import com.apigateway.service.GatewayService;
import org.springframework.stereotype.Service;

@Service
public class GatewayServiceImpl implements GatewayService {

    public String getGatewayStatus() {
        return "API Gateway is running successfully";
    }
}
package com.example.grpc.client.grpcclient;

public class PingPongEndpoint {
    GrpcClientApplication grpcClientService;
    @Autowired
    public PingPongEndpoint(GrpcClientApplication grpcClientService) {
        this.grpcClientService = grpcClientService;
    }
    @GetMapping("/ping")
    public String ping() {
        return grpcClientService.ping();
    }

}

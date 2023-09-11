package ru.shishkin.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ru.shishkin.grpc.generetedsources.GreetingServiceGrpc;
import ru.shishkin.grpc.generetedsources.GreetingServiceOuterClass;

public class TestClient {
    protected void testGreetingService() {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext().build();

        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);

        GreetingServiceOuterClass.HelloRequest request = GreetingServiceOuterClass.HelloRequest
                .newBuilder().setName("MaximShishkin").build();

        System.out.println("request - " + request);

        GreetingServiceOuterClass.HelloResponse response = stub.greeting(request);

        System.out.println("response - " + response);

        channel.shutdown();
    }
}
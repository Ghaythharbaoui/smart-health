package com.example.labo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Lab.proto")
public final class LabServiceGrpc {

  private LabServiceGrpc() {}

  public static final String SERVICE_NAME = "laboratory.LabService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.labo.grpc.SubmitRequest,
      com.example.labo.grpc.TestResponse> getSubmitTestRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitTestRequest",
      requestType = com.example.labo.grpc.SubmitRequest.class,
      responseType = com.example.labo.grpc.TestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.labo.grpc.SubmitRequest,
      com.example.labo.grpc.TestResponse> getSubmitTestRequestMethod() {
    io.grpc.MethodDescriptor<com.example.labo.grpc.SubmitRequest, com.example.labo.grpc.TestResponse> getSubmitTestRequestMethod;
    if ((getSubmitTestRequestMethod = LabServiceGrpc.getSubmitTestRequestMethod) == null) {
      synchronized (LabServiceGrpc.class) {
        if ((getSubmitTestRequestMethod = LabServiceGrpc.getSubmitTestRequestMethod) == null) {
          LabServiceGrpc.getSubmitTestRequestMethod = getSubmitTestRequestMethod = 
              io.grpc.MethodDescriptor.<com.example.labo.grpc.SubmitRequest, com.example.labo.grpc.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "laboratory.LabService", "SubmitTestRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.labo.grpc.SubmitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.labo.grpc.TestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LabServiceMethodDescriptorSupplier("SubmitTestRequest"))
                  .build();
          }
        }
     }
     return getSubmitTestRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.labo.grpc.GetRequest,
      com.example.labo.grpc.TestResponse> getGetTestResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTestResult",
      requestType = com.example.labo.grpc.GetRequest.class,
      responseType = com.example.labo.grpc.TestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.labo.grpc.GetRequest,
      com.example.labo.grpc.TestResponse> getGetTestResultMethod() {
    io.grpc.MethodDescriptor<com.example.labo.grpc.GetRequest, com.example.labo.grpc.TestResponse> getGetTestResultMethod;
    if ((getGetTestResultMethod = LabServiceGrpc.getGetTestResultMethod) == null) {
      synchronized (LabServiceGrpc.class) {
        if ((getGetTestResultMethod = LabServiceGrpc.getGetTestResultMethod) == null) {
          LabServiceGrpc.getGetTestResultMethod = getGetTestResultMethod = 
              io.grpc.MethodDescriptor.<com.example.labo.grpc.GetRequest, com.example.labo.grpc.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "laboratory.LabService", "GetTestResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.labo.grpc.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.labo.grpc.TestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LabServiceMethodDescriptorSupplier("GetTestResult"))
                  .build();
          }
        }
     }
     return getGetTestResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.labo.grpc.UpdateRequest,
      com.example.labo.grpc.TestResponse> getUpdateTestStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTestStatus",
      requestType = com.example.labo.grpc.UpdateRequest.class,
      responseType = com.example.labo.grpc.TestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.labo.grpc.UpdateRequest,
      com.example.labo.grpc.TestResponse> getUpdateTestStatusMethod() {
    io.grpc.MethodDescriptor<com.example.labo.grpc.UpdateRequest, com.example.labo.grpc.TestResponse> getUpdateTestStatusMethod;
    if ((getUpdateTestStatusMethod = LabServiceGrpc.getUpdateTestStatusMethod) == null) {
      synchronized (LabServiceGrpc.class) {
        if ((getUpdateTestStatusMethod = LabServiceGrpc.getUpdateTestStatusMethod) == null) {
          LabServiceGrpc.getUpdateTestStatusMethod = getUpdateTestStatusMethod = 
              io.grpc.MethodDescriptor.<com.example.labo.grpc.UpdateRequest, com.example.labo.grpc.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "laboratory.LabService", "UpdateTestStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.labo.grpc.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.labo.grpc.TestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LabServiceMethodDescriptorSupplier("UpdateTestStatus"))
                  .build();
          }
        }
     }
     return getUpdateTestStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LabServiceStub newStub(io.grpc.Channel channel) {
    return new LabServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LabServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LabServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LabServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LabServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LabServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 1. Déposer une nouvelle demande de test
     * </pre>
     */
    public void submitTestRequest(com.example.labo.grpc.SubmitRequest request,
        io.grpc.stub.StreamObserver<com.example.labo.grpc.TestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitTestRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * 2. Suivre le statut/résultat d'une demande
     * </pre>
     */
    public void getTestResult(com.example.labo.grpc.GetRequest request,
        io.grpc.stub.StreamObserver<com.example.labo.grpc.TestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTestResultMethod(), responseObserver);
    }

    /**
     * <pre>
     * 3. (Optionnel pour le serveur) Mettre à jour le statut
     * </pre>
     */
    public void updateTestStatus(com.example.labo.grpc.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.labo.grpc.TestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTestStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubmitTestRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.labo.grpc.SubmitRequest,
                com.example.labo.grpc.TestResponse>(
                  this, METHODID_SUBMIT_TEST_REQUEST)))
          .addMethod(
            getGetTestResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.labo.grpc.GetRequest,
                com.example.labo.grpc.TestResponse>(
                  this, METHODID_GET_TEST_RESULT)))
          .addMethod(
            getUpdateTestStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.labo.grpc.UpdateRequest,
                com.example.labo.grpc.TestResponse>(
                  this, METHODID_UPDATE_TEST_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class LabServiceStub extends io.grpc.stub.AbstractStub<LabServiceStub> {
    private LabServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LabServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LabServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 1. Déposer une nouvelle demande de test
     * </pre>
     */
    public void submitTestRequest(com.example.labo.grpc.SubmitRequest request,
        io.grpc.stub.StreamObserver<com.example.labo.grpc.TestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitTestRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 2. Suivre le statut/résultat d'une demande
     * </pre>
     */
    public void getTestResult(com.example.labo.grpc.GetRequest request,
        io.grpc.stub.StreamObserver<com.example.labo.grpc.TestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTestResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 3. (Optionnel pour le serveur) Mettre à jour le statut
     * </pre>
     */
    public void updateTestStatus(com.example.labo.grpc.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.labo.grpc.TestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTestStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LabServiceBlockingStub extends io.grpc.stub.AbstractStub<LabServiceBlockingStub> {
    private LabServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LabServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LabServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 1. Déposer une nouvelle demande de test
     * </pre>
     */
    public com.example.labo.grpc.TestResponse submitTestRequest(com.example.labo.grpc.SubmitRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubmitTestRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 2. Suivre le statut/résultat d'une demande
     * </pre>
     */
    public com.example.labo.grpc.TestResponse getTestResult(com.example.labo.grpc.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTestResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 3. (Optionnel pour le serveur) Mettre à jour le statut
     * </pre>
     */
    public com.example.labo.grpc.TestResponse updateTestStatus(com.example.labo.grpc.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTestStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LabServiceFutureStub extends io.grpc.stub.AbstractStub<LabServiceFutureStub> {
    private LabServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LabServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LabServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 1. Déposer une nouvelle demande de test
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.labo.grpc.TestResponse> submitTestRequest(
        com.example.labo.grpc.SubmitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitTestRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 2. Suivre le statut/résultat d'une demande
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.labo.grpc.TestResponse> getTestResult(
        com.example.labo.grpc.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTestResultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 3. (Optionnel pour le serveur) Mettre à jour le statut
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.labo.grpc.TestResponse> updateTestStatus(
        com.example.labo.grpc.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTestStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_TEST_REQUEST = 0;
  private static final int METHODID_GET_TEST_RESULT = 1;
  private static final int METHODID_UPDATE_TEST_STATUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LabServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LabServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_TEST_REQUEST:
          serviceImpl.submitTestRequest((com.example.labo.grpc.SubmitRequest) request,
              (io.grpc.stub.StreamObserver<com.example.labo.grpc.TestResponse>) responseObserver);
          break;
        case METHODID_GET_TEST_RESULT:
          serviceImpl.getTestResult((com.example.labo.grpc.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.example.labo.grpc.TestResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TEST_STATUS:
          serviceImpl.updateTestStatus((com.example.labo.grpc.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.labo.grpc.TestResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LabServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LabServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.labo.grpc.Lab.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LabService");
    }
  }

  private static final class LabServiceFileDescriptorSupplier
      extends LabServiceBaseDescriptorSupplier {
    LabServiceFileDescriptorSupplier() {}
  }

  private static final class LabServiceMethodDescriptorSupplier
      extends LabServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LabServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LabServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LabServiceFileDescriptorSupplier())
              .addMethod(getSubmitTestRequestMethod())
              .addMethod(getGetTestResultMethod())
              .addMethod(getUpdateTestStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}

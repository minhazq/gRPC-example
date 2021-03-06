// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_world.proto

package com.grpc.example;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 *
 * Protobuf service {@code com.grpc.example.CreateUserService}
 */
public  abstract class CreateUserService
    implements com.google.protobuf.Service {
  protected CreateUserService() {}

  public interface Interface {
    /**
     * <code>rpc CreateUser(.com.grpc.example.UserRequest) returns (.com.grpc.example.UserResponse);</code>
     */
    public abstract void createUser(
        com.google.protobuf.RpcController controller,
        com.grpc.example.UserRequest request,
        com.google.protobuf.RpcCallback<com.grpc.example.UserResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new CreateUserService() {
      @java.lang.Override
      public  void createUser(
          com.google.protobuf.RpcController controller,
          com.grpc.example.UserRequest request,
          com.google.protobuf.RpcCallback<com.grpc.example.UserResponse> done) {
        impl.createUser(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.createUser(controller, (com.grpc.example.UserRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.grpc.example.UserRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.grpc.example.UserResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc CreateUser(.com.grpc.example.UserRequest) returns (.com.grpc.example.UserResponse);</code>
   */
  public abstract void createUser(
      com.google.protobuf.RpcController controller,
      com.grpc.example.UserRequest request,
      com.google.protobuf.RpcCallback<com.grpc.example.UserResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.grpc.example.CreateUser.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.createUser(controller, (com.grpc.example.UserRequest)request,
          com.google.protobuf.RpcUtil.<com.grpc.example.UserResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.grpc.example.UserRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.grpc.example.UserResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.grpc.example.CreateUserService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void createUser(
        com.google.protobuf.RpcController controller,
        com.grpc.example.UserRequest request,
        com.google.protobuf.RpcCallback<com.grpc.example.UserResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.grpc.example.UserResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.grpc.example.UserResponse.class,
          com.grpc.example.UserResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.grpc.example.UserResponse createUser(
        com.google.protobuf.RpcController controller,
        com.grpc.example.UserRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.grpc.example.UserResponse createUser(
        com.google.protobuf.RpcController controller,
        com.grpc.example.UserRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.grpc.example.UserResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.grpc.example.UserResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:com.grpc.example.CreateUserService)
}


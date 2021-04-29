# Request Body

```
{
    "content": {
        "name":"firstname",
        "email":"myemail"
    }
}
```

# Error Message

```
2021-04-29 17:19:44,714 ERROR [org.jbo.res.rea.ser.cor.ExceptionMapping] (vert.x-eventloop-thread-14) Request failed : **java.lang.ClassCastException: class java.util.HashMap cannot be cast to class org.generictype.Item (java.util.HashMap is in module java.base of loader 'bootstrap'; org.generictype.Item is in unnamed module of loader io.quarkus.bootstrap.classloading.QuarkusClassLoader @1e1e0d04)**
	at org.generictype.MyResource.hello(MyResource.java:15)
	at org.generictype.MyResource_Subclass.hello$$superaccessor1(MyResource_Subclass.zig:199)
	at org.generictype.MyResource_Subclass$$function$$1.apply(MyResource_Subclass$$function$$1.zig:33)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.arc.runtime.devconsole.InvocationInterceptor.proceed(InvocationInterceptor.java:63)
	at io.quarkus.arc.runtime.devconsole.InvocationInterceptor.monitor(InvocationInterceptor.java:49)
	at io.quarkus.arc.runtime.devconsole.InvocationInterceptor_Bean.intercept(InvocationInterceptor_Bean.zig:521)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:41)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:32)
	at org.generictype.MyResource_Subclass.hello(MyResource_Subclass.zig:156)
	at org.generictype.MyResource$quarkusrestinvoker$hello_cc66897b1057ea4bce935de8ad1ee70c80eaa264.invoke(MyResource$quarkusrestinvoker$hello_cc66897b1057ea4bce935de8ad1ee70c80eaa264.zig:39)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:7)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:122)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:500)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:989)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:834)

2021-04-29 17:19:44,719 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (vert.x-eventloop-thread-14) HTTP Request to /endpoint failed, error id: b27b402a-2d67-4c00-bc70-58fec59abb14-1: java.lang.ClassCastException: class java.util.HashMap cannot be cast to class org.generictype.Item (java.util.HashMap is in module java.base of loader 'bootstrap'; org.generictype.Item is in unnamed module of loader io.quarkus.bootstrap.classloading.QuarkusClassLoader @1e1e0d04)
	at org.generictype.MyResource.hello(MyResource.java:15)
	at org.generictype.MyResource_Subclass.hello$$superaccessor1(MyResource_Subclass.zig:199)
	at org.generictype.MyResource_Subclass$$function$$1.apply(MyResource_Subclass$$function$$1.zig:33)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.arc.runtime.devconsole.InvocationInterceptor.proceed(InvocationInterceptor.java:63)
	at io.quarkus.arc.runtime.devconsole.InvocationInterceptor.monitor(InvocationInterceptor.java:49)
	at io.quarkus.arc.runtime.devconsole.InvocationInterceptor_Bean.intercept(InvocationInterceptor_Bean.zig:521)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:41)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:32)
	at org.generictype.MyResource_Subclass.hello(MyResource_Subclass.zig:156)
	at org.generictype.MyResource$quarkusrestinvoker$hello_cc66897b1057ea4bce935de8ad1ee70c80eaa264.invoke(MyResource$quarkusrestinvoker$hello_cc66897b1057ea4bce935de8ad1ee70c80eaa264.zig:39)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:7)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:122)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:500)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:989)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:834)

2021-04-29 17:19:44,731 ERROR [org.jbo.res.rea.com.cor.AbstractResteasyReactiveContext] (vert.x-eventloop-thread-14) Request failed: java.lang.ClassCastException: class java.util.HashMap cannot be cast to class org.generictype.Item (java.util.HashMap is in module java.base of loader 'bootstrap'; org.generictype.Item is in unnamed module of loader io.quarkus.bootstrap.classloading.QuarkusClassLoader @1e1e0d04)
	at org.generictype.MyResource.hello(MyResource.java:15)
	at org.generictype.MyResource_Subclass.hello$$superaccessor1(MyResource_Subclass.zig:199)
	at org.generictype.MyResource_Subclass$$function$$1.apply(MyResource_Subclass$$function$$1.zig:33)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.arc.runtime.devconsole.InvocationInterceptor.proceed(InvocationInterceptor.java:63)
	at io.quarkus.arc.runtime.devconsole.InvocationInterceptor.monitor(InvocationInterceptor.java:49)
	at io.quarkus.arc.runtime.devconsole.InvocationInterceptor_Bean.intercept(InvocationInterceptor_Bean.zig:521)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:41)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:32)
	at org.generictype.MyResource_Subclass.hello(MyResource_Subclass.zig:156)
	at org.generictype.MyResource$quarkusrestinvoker$hello_cc66897b1057ea4bce935de8ad1ee70c80eaa264.invoke(MyResource$quarkusrestinvoker$hello_cc66897b1057ea4bce935de8ad1ee70c80eaa264.zig:39)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:7)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:122)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:500)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:989)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:834)


```


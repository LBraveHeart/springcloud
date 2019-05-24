# springcloud

##	目录结构

**springcloud**

- springcloud
   -	spring-cloud-admin-eureka：简单功能实现
     	-	springcloud-customer：服务消费方
     	-	springcloud-eureka：注册中心
     	-	springcloud-hystrix-dashboard：熔断器
     	-	springcloud-producer：服务提供方

   -	springcloud-eureka：注册中心多种结构
     	-	springcloud-eureka：单机注册中心
     	-	springcloud-eureka-two：双机注册中心
     	-	springcloud-eurekeMore：集群注册中心

   -	spring-cloud-Turbine：带有熔断监控实例
     	-	spring-cloud-consumer-node1：服务消费方1
     	-	spring-cloud-customer-node2：服务消费方2
     	-	spring-cloud-eureka：注册中心
     	-	spring-cloud-producer：服务提供方
     	-	spring-cloud-turbine：熔断监控
   -	spring-cloud-config-eureka：配置中心、注册中心结合
      	-	spring-cloud-config-client：配置中心客户端
        -	spring-cloud-config-server：配置中心服务端
        -	spring-cloud-eureka：注册中心

   -	spring-cloud-config-git：基于git的配置中心
   		-	spring-cloud-config-client：配置中心客户端
        -	spring-cloud-config-server：配置中心服务端
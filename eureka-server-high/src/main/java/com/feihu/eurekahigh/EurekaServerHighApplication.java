package com.feihu.eurekahigh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka-eserver peer1 8761,Eureka-eserver peer2 8769相互感应，当有服务注册时，
 * 两个Eureka-eserver是对等的，它们都存有相同的信息，这就是通过服务器的冗余来增加可靠性，
 * 当有一台服务器宕机了，服务并不会终止，因为另一台服务存有相同的数据。
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHighApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerHighApplication.class, args);
    }
}

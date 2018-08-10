package com.feihu.servicefeign.clients.fallback;

import com.feihu.servicefeign.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;


@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, you are fail," + name;
    }
}
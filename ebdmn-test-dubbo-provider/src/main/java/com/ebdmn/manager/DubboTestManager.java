package com.ebdmn.manager;

import com.ebdmn.manager.api.service.IDubboTestManager;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class DubboTestManager implements IDubboTestManager {
    /**
     * @return
     */
    @Override
    public String hello() {
        return "hello";
    }
}

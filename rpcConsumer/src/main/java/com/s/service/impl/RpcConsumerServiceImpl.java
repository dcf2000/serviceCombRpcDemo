package com.s.service.impl;

import com.s.service.RpcService;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.springframework.stereotype.Component;

/**
 * @Author Administrator
 * @Date 2020/6/8 0008 下午 8:21
 * @Version 1.0
 */
@Component
public class RpcConsumerServiceImpl implements RpcService {

    @RpcReference(microserviceName = "start.servicecomb.io:rpc-provider", schemaId = "rpcProvider")
    private RpcService rpcService;

    @Override
    public String msgStr(String msg) {
        return rpcService.msgStr(msg);
    }
}

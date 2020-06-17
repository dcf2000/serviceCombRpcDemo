package com.s.service.impl;

import com.s.service.RpcService;
import org.apache.servicecomb.provider.pojo.RpcSchema;

/**
 * @Author Administrator
 * @Date 2020/6/8 0008 下午 8:06
 * @Version 1.0
 */
@RpcSchema(schemaId = "rpcProvider")
public class RpcProviderServiceImpl implements RpcService {
    @Override
    public String msgStr(String msg) {
        return "msg:" + msg;
    }
}

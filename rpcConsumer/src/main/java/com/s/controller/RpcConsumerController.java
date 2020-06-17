package com.s.controller;

import com.s.service.RpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Date 2020/6/8 0008 下午 8:50
 * @Version 1.0
 */
@RestController
@RequestMapping("/rpc")
public class RpcConsumerController {

    @Autowired
    private RpcService rpcService;

    @GetMapping("/strMsg")
    public String strMsg(String msg){
        return rpcService.msgStr(msg);
    }
}

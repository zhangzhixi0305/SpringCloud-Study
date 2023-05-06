package com.zhixi.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zhixi.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class FlowLimitController {
    @Resource
    private TestService testService;

    @GetMapping("/testA")
    public String testA() {
        testService.common();
        log.info(Thread.currentThread().getName() + "\t" + "...testA");
        return "------testA";
    }


    @GetMapping("/testB")
    public String testB() {
        testService.common();
        log.info(Thread.currentThread().getName() + "\t" + "...testB");
        return "------testB";
    }

    @GetMapping("/testD")
    public String testD() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testD 测试RT");
        return "------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testD 异常比例");
        int age = 10 / 0;
        return "------testE";
    }

    @GetMapping("/testF")
    public String testF() {
        log.info("testF 测试异常数");
        int age = 10 / 0;
        return "------testF 测试异常数";
    }

    /**
     * 测试热点key
     *
     * @param p1 参数1
     * @param p2 参数2
     * @return 返回值
     */
    @GetMapping("/testHotKey/{p1}/{p2}")
    @SentinelResource(value = "testHotKey", blockHandler/*兜底方法*/ = "dealTestHotKey")
    public String testHotKey(@PathVariable(value = "p1", required = false) String p1,
                             @PathVariable(value = "p2", required = false) String p2) {
        return "------testHotKey";
    }

    /**
     * 兜底方法
     *
     * @param p1        参数1
     * @param p2        参数2
     * @param exception 异常
     * @return 返回值
     */
    public String dealTestHotKey(String p1, String p2, BlockException exception) {
        //sentinel系统默认的提示：Blocked by Sentinel (flow limiting)
        return "------deal_testHotKey,o(╥﹏╥)o";
    }
}

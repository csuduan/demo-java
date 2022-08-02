package dq.demo.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class TestTime {
    @PostConstruct
    public void init(){
        this.testSystemNanoTime();
        //this.testStopwatch();
    }
    public void testSystemNanoTime(){
        long startTime=System.nanoTime();   //获取开始时间
        for (int i=0;i<=1000;i++)
            doSomething(i);
            //System.nanoTime();
        long endTime=System.nanoTime(); //获取结束时间
        long cost=endTime-startTime;
        log.info("testSystemNanoTime： "+cost+"ns");

    }
    private void doSomething(int i){
        i++;
    }
}

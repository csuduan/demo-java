package dq.demo.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@Slf4j
public class ParseFile {
    public void  parseFile(String file){
        try(BufferedReader reader=new BufferedReader(
                new InputStreamReader(new FileInputStream(file),"UTF-8"));
        ){
            reader.readLine();//第一行
            String line;
            while (StringUtils.isEmpty(line=reader.readLine())){

            }
        }catch (Exception ex){

        }
    }
    public String processLine(String line){
        return null;
    }

    public static void main(String[] args) {
        log.info("start...");
    }
}

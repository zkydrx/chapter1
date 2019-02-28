package com.dudu.chapter;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class Chapter1Application
{
    @RequestMapping("/")
    public String index()
    {
        return "Hello Spring boot";
    }
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public JSONObject getJson(String a,String b)
    {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a",a);
        jsonObject.put("b",b);
        return jsonObject;
    }



    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public List<String> getList(String a, String b)
    {
        List<String> list= new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add("Java");
        list.add("Python");
        return list;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(Chapter1Application.class, args);
    }

}

package com.breamer.demo.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 * @author zhang.penghao
 * @date 2018/7/11 11:37
 */
@RestController
public class HelloController {
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    private String hello(){
        String str = "{\n" +
                "  'features': [\n" +
                "    {\n" +
                "      'type': 'Feature',\n" +
                "      'properties': {\n" +
                "        'temperature': 12\n" +
                "\n" +
                "      },\n" +
                "      'geometry': {\n" +
                "        'coordinates': [\n" +
                "          116.302804,\n" +
                "          39.982285\n" +
                "        ],\n" +
                "        'type': 'Point'\n" +
                "      },\n" +
                "      'id': '519ae1ae3f487e69dc97186a0feea28a'\n" +
                "    },\n" +
                "    {\n" +
                "      'type': 'Feature',\n" +
                "      'properties': {\n" +
                "        'temperature': 70\n" +
                "      },\n" +
                "      'geometry': {\n" +
                "        'coordinates': [\n" +
                "          116.302735,\n" +
                "          39.983102\n" +
                "        ],\n" +
                "        'type': 'Point'\n" +
                "      },\n" +
                "      'id': '89af7f19578892d10cf52c99f59d2126'\n" +
                "    },\n" +
                "    {\n" +
                "      'type': 'Feature',\n" +
                "      'properties': {\n" +
                "        'temperature': 15\n" +
                "      },\n" +
                "      'geometry': {\n" +
                "        'coordinates': [\n" +
                "          116.302831,\n" +
                "          39.981566\n" +
                "        ],\n" +
                "        'type': 'Point'\n" +
                "      },\n" +
                "      'id': 'a768af90dd878aa2f4fbf422a0b0fc5a'\n" +
                "    }\n" +
                "  ],\n" +
                "  'type': 'FeatureCollection'\n" +
                "}";
        return JSON.parse(str).toString();
    }
}

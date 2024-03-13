/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.springboot.springboot.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.springboot.springboot.entity.Example;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*
*
* Swagger是一种基于注解自动生成api文档的组件。其会自动扫描Controller目录中的controller类，并在服务启动后渲染一个API文档的静态页面。
* 通过访问对应网址即可查看api文档。
*
* 访问方式：http://ip:port/doc.html#
* ip：启动后端服务的ip地址，本地启动为localhost，远程服务器部署待定
* port：application.properties中可查看启动端口，通常为8080
*基于注解：通过@Apixxx 注解的方式完成对接口和表单/响应的描述。大家可以本地启动程序，访问以上地址查看api文档启动效果
*
*
* */
@Api(tags = "1:swagger案例")
@ApiSupport(author = "zhangyn")
@Controller
@RequestMapping("/example")
public class ExampleController {

    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @ApiOperation(value = "Hello world~")
    @PostMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(name = "name", defaultValue = "unknown user") String name) {
        return "Hello " + name;
    }

    @ApiOperationSupport(author = "zhangsan")
    @ApiOperation(value = "获取Example对象")
    @GetMapping("/get")
    @ResponseBody
    public Example getExample(@RequestBody Example example) {
        return example;
    }


}

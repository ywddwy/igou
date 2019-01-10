package cn.itsource.service.controller;

import cn.itsource.interfaces.Employee;
import cn.itsource.util.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){     //@RequestBody前台传的是个对象接受的时候就要加
        if("admin".equals(employee.getUsername()) && "123".equals(employee.getPassword())){
            return new AjaxResult("登录成功");
        }
        return new AjaxResult("登录失败",1000);
    }
}

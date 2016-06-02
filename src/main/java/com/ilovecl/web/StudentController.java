package com.ilovecl.web;

import com.ilovecl._const.StudentConst;
import com.ilovecl.dto.LoginResult;
import com.ilovecl.entity.Repair;
import com.ilovecl.entity.Student;
import com.ilovecl.service.RepairService;
import com.ilovecl.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 用户的web层
 *
 * @author qiuyongchen
 *         email:qiuych3@mail2.sysu.edu.cn
 *         copyRight:The MIT License (MIT)
 *         Copyright (c) 2016 邱永臣
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *         documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 *         the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 *         to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         <p>
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 *         Software.
 *         <p>
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *         WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *         OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 *         OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * @since 2016-05-31 19:21
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService studentService;

    @Autowired
    private RepairService repairService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "student/index";
    }

    /**
     * 注册的GET方法
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {
        return "/student/register";
    }

    /**
     * 登录的GET方法
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "student/login";
    }

    /**
     * 登录的POST方法
     *
     * @param email
     * @param password
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public
    @ResponseBody
    LoginResult login(String email, String password, HttpSession httpSession, HttpServletResponse httpServletResponse) {

        LoginResult loginResult;

        Student student = studentService.getStudentByEmail(email);

        // 密码正确
        if (student.getPassword().equals(password)) {
            loginResult = new LoginResult(true);

            // 登录成功后，为该学生生成session
            httpSession.setAttribute(StudentConst.STUDENT_EMAIL, email);

            httpServletResponse.addCookie(new Cookie(StudentConst.STUDENT_EMAIL, email));
            httpServletResponse.addCookie(new Cookie(StudentConst.STUDENT_NAME, student.getName()));
        } else {
            loginResult = new LoginResult(false);
        }

        logger.info("***************************************************************************");
        logger.info("登录: " + String.valueOf(loginResult.isSuccess()) + "e mail : " + email + " password : " + password);
        logger.info("***************************************************************************");

        return loginResult;
    }

    /**
     * 退出的控制
     *
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    String logout(HttpSession httpSession) {
        httpSession.removeAttribute(StudentConst.STUDENT_EMAIL);
        return "redirect:/index";
    }

    /**
     * 提交报修单的POST方法
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/commit", method = RequestMethod.GET)
    public String commit(Model model) {
        return "/student/commit";
    }

    /**
     * 获取显示的主页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String board(Model model) {
        List<Repair> repairs = repairService.getRepqirByStudentId(1);

        model.addAttribute("list", repairs);

        return "/student/dashboard";
    }
}

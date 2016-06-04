package com.ilovecl.web;

import com.ilovecl._const.RepairEnumCN;
import com.ilovecl.dto.LoginResult;
import com.ilovecl.dto.RepairDisplayer;
import com.ilovecl.entity.Repair;
import com.ilovecl.entity.Student;
import com.ilovecl.service.LoginService;
import com.ilovecl.service.RepairService;
import com.ilovecl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * 系统管理员端的控制器
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
 * @since 2016-06-04 21:27
 */

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private RepairService repairService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        return "/admin/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public
    @ResponseBody
    LoginResult login(String email, String password, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        if (loginService.adminLogin(email, password).isSuccess()) {
            httpServletRequest.getSession().setAttribute("ADMIN_EMAIL", email);
            httpServletResponse.addCookie(new Cookie("ADMIN_EMAIL", email));
        }

        LoginResult loginResult = loginService.adminLogin(email, password);
        if (!loginResult.isSuccess()) {
            loginResult.setReason("invalid password");
        }
        return loginResult;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession httpSession) {
        httpSession.removeAttribute("ADMIN_EMAIL");
        return "redirect:/admin/login";
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String dashboar(Model model, HttpServletRequest httpServletRequest) {
        List<Repair> repairs = repairService.getAllUnFinish();

        List<RepairDisplayer> repairDisplayers = new ArrayList<RepairDisplayer>();

        Student student;
        for (Repair r :
                repairs) {
            student = studentService.getStudentById(r.getStudentId());

            repairDisplayers.add(new RepairDisplayer(r.getId(), r.getStatus(), RepairEnumCN.stateOf(r.getStatus()).toString(),
                    r.getDetail(), r.getPlace(), "/" + r.getPicMD5(), r.getSubmitTime(), r.getStudentId(), student.getName(),
                    student.getEmail(), student));
        }

        model.addAttribute("list", repairDisplayers);

        return "/admin/dashboard";
    }

    @RequestMapping(value = "/repair/{repairId}/detail", method = RequestMethod.GET)
    public String detailRepair(@PathVariable("repairId") int repairId, Model model) {
        Repair repair;

        repair = repairService.getRepairById(repairId);

        repair.setPicMD5("/" + repair.getPicMD5());

        RepairDisplayer repairDisplayer = new RepairDisplayer(repair.getId(), repair.getStatus(), RepairEnumCN.stateOf(repair.getStatus()).toString(),
                repair.getDetail(), repair.getPlace(), repair.getPicMD5(), repair.getSubmitTime());
        model.addAttribute("repair", repairDisplayer);
        return "admin/detail";
    }

    @RequestMapping(value = "/repair/{repairId}/cancel", method = RequestMethod.GET)
    public String cancelRepair(@PathVariable("repairId") int repairId) {
        repairService.cancelRepair(repairId);
        return "redirect:/admin/dashboard";
    }

    @RequestMapping(value = "/repair/{repairId}/confirm", method = RequestMethod.GET)
    public String confirmRepair(@PathVariable("repairId") int repairId) {
        repairService.confirmRepair(repairId);
        return "redirect:/admin/dashboard";
    }

    @RequestMapping(value = "/repair/{repairId}/arrange", method = RequestMethod.GET)
    public String arrangeRepair(@PathVariable("repairId") int repairId) {
        repairService.cancelRepair(repairId);
        return "/admin/arrange";
    }
}

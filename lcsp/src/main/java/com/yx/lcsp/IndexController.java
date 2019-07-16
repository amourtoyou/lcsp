package com.yx.lcsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    //    首页的展示
    @RequestMapping(value = "home/console")
    public String console() {
        return "home/console";
    }

    //     我的申请
    @RequestMapping(value = "html/apply")
    public String apply() {
        return "html/apply";
    }

    //      校园卡相关
    @RequestMapping(value = "html/card")
    public String card() {
        return "html/card";
    }

    //      门禁相关
    @RequestMapping(value = "html/control")
    public String control() {
        return "html/control";
    }

    //      调账相关
    @RequestMapping(value = "html/adjustment")
    public String adjustment() {
        return "html/adjustment";
    }

    //      密码相关
    @RequestMapping(value = "html/password")
    public String password() {
        return "html/password";
    }

    //      服务器相关
    @RequestMapping(value = "html/server")
    public String server() {
        return "html/server";
    }

    //    用户的新申请
    @RequestMapping(value = "html/applyNew")
    public String applyNew(){
        return "html/applyNew";
    }

    //    校园卡的申请
    @RequestMapping(value = "form/cardApply")
    public String cardApply(){
        return "form/cardApply";
    }
    //    门禁卡的申请
    @RequestMapping(value = "form/controlApply")
    public String controlApply(){
        return "form/controlApply";
    }


    //    调账的申请
    @RequestMapping(value = "form/adjustApply")
    public String adjustApply(){
        return "form/adjustApply";
    }

    //    密码的申请
    @RequestMapping(value = "form/pwdApply")
    public String pwdApply(){
        return "form/pwdApply";
    }

    //    服务器的申请
    @RequestMapping(value = "form/serverApply")
    public String serverApply(){
        return "form/serverApply";
    }


    //    申请的详情
    @RequestMapping(value = "html/detail")
    public String detail(){
        return "html/detail";
    }
    //    评价的详情
    @RequestMapping(value = "html/evaluate")
    public String evaluate(){
        return "html/evaluate";
    }



    //    管理员相关
//    登陆页面选择了管理员之后进入不同的主页
    @RequestMapping(value = "/indexAdmin")
    public String indexAdmin() {
        return "indexAdmin";
    }

    //    如同上方的console，做首页的展示
    @RequestMapping(value = "home/admin")
    public String admin() {
        return "home/admin";
    }

    //    管理员端 “所有申请” 的展示
    @RequestMapping(value = "admin/applyList")
    public String applyList() {
        return "admin/applyList";
    }

    //    管理员可以看到所有用户的申请
    @RequestMapping(value = "admin/cardList")
    public String cardList() {
        return "admin/cardList";
    }
//    “门禁相关”
    @RequestMapping(value = "admin/controlList")
    public String controlList() {
        return "admin/controlList";
    }
    //    “调账相关”
    @RequestMapping(value = "admin/adjustmentList")
    public String adjustmentList() {
        return "admin/adjustmentList";
    }
    //    “密码相关”
    @RequestMapping(value = "admin/pwdApplyList")
    public String pwdApplyList() {
        return "admin/pwdApplyList";
    }
    //    “服务器相关”
    @RequestMapping(value = "admin/serverList")
    public String serverList() {
        return "admin/serverList";
    }
    //    管理员以表单的格式展示申请的 “详情”，可以对该申请进行操作
    @RequestMapping(value = "admin/applyDetail")
    public String applyDetail() {
        return "admin/applyDetail";
    }
}

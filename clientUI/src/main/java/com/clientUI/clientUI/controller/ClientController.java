package com.clientUI.clientUI.controller;

import com.clientUI.clientUI.beans.UserBean;
import com.clientUI.clientUI.proxies.MicroserviceUsersProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    MicroserviceUsersProxy mUsersProxy;

    @RequestMapping("/")
    public  String accueil(Model model){

        List<UserBean> usersList =  mUsersProxy.getAllClients();

        model.addAttribute("users",usersList);

        return "Accueil";
    }

}

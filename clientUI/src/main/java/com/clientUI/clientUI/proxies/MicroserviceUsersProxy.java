package com.clientUI.clientUI.proxies;

import com.clientUI.clientUI.beans.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "users", url = "localhost:9090")
public interface MicroserviceUsersProxy {

    // va aller chercher la methode dans le ms users et retourne le resultat dans une List de type Userbean
    @GetMapping(value = "/users")
    List<UserBean> getAllClients();

    @PostMapping(value = "/register")
    ResponseEntity<Void> registration(@RequestBody Users users);
}

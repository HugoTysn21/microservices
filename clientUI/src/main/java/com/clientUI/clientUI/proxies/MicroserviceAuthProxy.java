package com.clientUI.clientUI.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "authentification", url = "localhost")
public class MicroserviceAuthProxy {

    @PostMapping(value = "/login")
    // faire la verification du corps de la requete
    // si c'est valider, je creer un token
    // je persiste ce token en base de données
    // et j'envoie dans le corps de la réponse au client
}

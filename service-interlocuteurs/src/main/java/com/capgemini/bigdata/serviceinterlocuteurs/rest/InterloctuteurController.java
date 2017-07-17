package com.capgemini.bigdata.serviceinterlocuteurs.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nico on 16/07/2017.
 */
@RestController
public class InterloctuteurController {

  @RequestMapping(value="/interlocuteurs", method= RequestMethod.GET)
  @ResponseBody  public String getInterlocuteurs() {
    return "Voila nos interlocuteurs";
  }

  @RequestMapping(
      value="/interlocuteurs/{id}",
      method=GET)
  @ResponseBody  public String getInterlocuteur(@PathVariable long id) {
    return "Voila l'interlocuteur" + id;
  }

}

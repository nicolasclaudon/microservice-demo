package com.capgemini.bigdata.serviceinterlocuteurs.domain;


import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by nico on 16/07/2017.
 */

@Getter @Setter @NoArgsConstructor
public class Interlocuteur implements Serializable {

  private String firstName;
  private String lastName;
  private int age;


}

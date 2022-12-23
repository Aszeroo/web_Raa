package com.webraa.demo.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Answerdata {

    private  String topic_id ;
    private  String topic_name ;
    private  int yes ;
    private  int no ;
    private  int total;
    private float percent;
}

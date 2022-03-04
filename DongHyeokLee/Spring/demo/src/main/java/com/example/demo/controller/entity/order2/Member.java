package com.example.demo.controller.entity.order2;


import lombok.Data;

//Data 붙어서 toString 된게 jason형태로 된건가
//그건 아닌듯
//json viewer 없으니 toString 형태로 처리 되어서 웹페이지에 나옴

@Data
public class Member {

   private String userName = "army";
   private String password = "1q2w3e!";

}

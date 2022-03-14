package entity;

import lombok.Data;

import java.util.Date;

@Data
public class ProductBoard {

   private int productNo;
   private String title;
   private String description;
   private int price;
   private String Writer;
   private Date Date;

}

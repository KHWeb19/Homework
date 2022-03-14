package entity;

import lombok.Data;

@Data
public class ProductBoard {

   private int productNo;
   private String title;
   private String description;
   private int price;
   private String Writer;
   private java.util.Date Date;

}

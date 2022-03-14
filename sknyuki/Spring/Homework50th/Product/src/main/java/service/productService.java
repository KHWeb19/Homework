package service;

import entity.ProductBoard;

import java.util.List;


public interface productService {

    public void register (ProductBoard productBoard);
    public List<ProductBoard> list();
    public ProductBoard read(Integer productNo);
    public void modify(ProductBoard ProductBoard);
    public void remove(Integer ProductNo);
}

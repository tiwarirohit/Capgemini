package rohit.cg.gla.spring.dao;

import java.util.List;

import rohit.cg.gla.spring.entity.Product;
import rohit.cg.gla.spring.entity.ProductOld;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterivev1();
//	public List<ProductOld> reterieve();

}

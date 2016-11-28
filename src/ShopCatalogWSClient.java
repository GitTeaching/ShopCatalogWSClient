import java.util.ArrayList;
import java.util.List;

import org.soa.ws.tp3.CatalogMagasin;
import org.soa.ws.tp3.ShopCatalogImplService;
import org.soa.ws.tp3.Product;


public class ShopCatalogWSClient {

	public static void main(String[] args) {
		
		ShopCatalogImplService service = new ShopCatalogImplService();
		CatalogMagasin catalog = service.getShopCatalogImplPort();
		
		List<Product> products = new ArrayList<Product>();
		products = catalog.tousLesProduits();
		for(int i=0; i<products.size(); i++)
		     System.out.println("id = " + products.get(i).getId() + " Categ = " + products.get(i).getCateg());
	}

}

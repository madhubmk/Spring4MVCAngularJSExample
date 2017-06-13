package com.websystique.springmvc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.websystique.springmvc.model.Products;
import com.websystique.springmvc.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	private static List<Products> products;
	
	static{
		users= populateDummyUsers();
		products = productsList();
	}

	public List<User> findAllUsers() {
		return users;
	}
	
	public List<Products> findAllProducts() {
		return products;
	}
	
	public User findById(long id) {
		for(User user : users){
			if(user.getId() == id){
				return user;
			}
		}
		return null;
	}
	
	public User findByName(String name) {
		for(User user : users){
			if(user.getUsername().equalsIgnoreCase(name)){
				return user;
			}
		}
		return null;
	}
	
	public void saveUser(User user) {
		user.setId(counter.incrementAndGet());
		users.add(user);
	}

	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
	}

	public void deleteUserById(long id) {
		
		for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
		    User user = iterator.next();
		    if (user.getId() == id) {
		        iterator.remove();
		    }
		}
	}

	public boolean isUserExist(User user) {
		return findByName(user.getUsername())!=null;
	}
	
	public void deleteAllUsers(){
		users.clear();
	}

	private static List<User> populateDummyUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(),"Sam", "NY", "sam@abc.com"));
		users.add(new User(counter.incrementAndGet(),"Tomy", "ALBAMA", "tomy@abc.com"));
		users.add(new User(counter.incrementAndGet(),"Kelly", "NEBRASKA", "kelly@abc.com"));
		return users;
	}
	
	//public Products(long uid, String image, String sizes, String name, String colors, String text, String price){
	
	private static List<Products> productsList() {
		// TODO Auto-generated method stub
		List<Products> prodList = new ArrayList<Products>();
		prodList.add(new Products(counter.incrementAndGet(),"http://s7d9.scene7.com/is/image/AmericanApparel/rsa8306_heathergrey?defaultImage=/notavail&$ProductImage$", 
				"L", "Madhu1234 Cotton Spandex Jersey Long Sleeve Turtleneck","White","A sexy take on a classic turtleneck, made from our Cotton Spandex Jersey fabric for a more adjusted feminine fit.",
				"30.00"));
		prodList.add(new Products(counter.incrementAndGet(),"http://s7d9.scene7.com/is/image/AmericanApparel/1403w_black?defaultImage=/notavail&$ProductImage$", 
				"L", "Unisex Thick Knit Baseball Jersey","BLUE","Classic baseball tee constructed from sturdy thick-knit jersey, featuring buttons down front and short sleeves. ","51.00"));
		prodList.add(new Products(counter.incrementAndGet(),"http://s7d9.scene7.com/is/image/AmericanApparel/hj400aww_black?defaultImage=/notavail&$ProductImage$", 
				"S", "Unisex Acid Wash Short Sleeve Hammer T-Shirt","RED","Our heaviest jersey T-Shirt featuring 18 singles carded cotton, double-needle bottom hem and sleeves, and shoulder to shoulder reinforcement tape. Similar to the 2x1 Rib Boy Beater, but with a generous, daring neckline and added length. Offered in bright fluorescent colors.",
				"26.00"));
		prodList.add(new Products(counter.incrementAndGet(),"http://s7d9.scene7.com/is/image/AmericanApparel/tr401burnw_seethrutri-indigo?defaultImage=/notavail&$ProductImage$", 
				"L", "Unisex See Thru Tri-Blend Track Shirt","WHITE","Unisex See Thru Tri-Blend Track Shirt",
				"25.00"));
		prodList.add(new Products(counter.incrementAndGet(),"http://s7d9.scene7.com/is/image/AmericanApparel/tr401burnw_seethrutri-indigo?defaultImage=/notavail&$ProductImage$", 
				"L", "Unisex See Thru Tri-Blend Track Shirt","WHITE","Unisex See Thru Tri-Blend Track Shirt",
				"95.00"));
		
		prodList.add(new Products(counter.incrementAndGet(),"resources/images/1.jpg", 
				"L", "Test","WHITE","Test test test test test test test test test test test test test test",
				"95.00"));
		
		return prodList;
	}

}

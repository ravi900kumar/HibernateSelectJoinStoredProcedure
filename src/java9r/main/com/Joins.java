package java9r.main.com;
 
import java.util.*;

import java9r.dao.com.*;
import java9r.entites.com.*;
public class Joins {

	 
	public static void main(String[] args) {
		
		/////////////////////////////////////// get all records product and  orders /////////////

	JoinDAO spo=new JoinDAO();
	List<OrderDetailsJoin> result=spo.JoinSP();
	for(OrderDetailsJoin p:result){
	System.out.println("Id " + p.getProductId());
	System.out.println("Name " + p.getProductName());
	System.out.println("Price " + p.getPrice());
	System.out.println("quantity " + p.getQuantity());
	System.out.println("orderId " + p.getOrderId());
	System.out.println("orderName " + p.getOrderName());
	System.out.println("===================");
	}

	}
}
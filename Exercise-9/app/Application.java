package app;

import action.Action;
import action.LoginAction;
import action.LogoutAction;

public class Application {
	public static void main(String[] args) {
		Action action = (Action) new LoginAction();

		String result = action.execute("hari", "mypass");

		System.out.println(result);

		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}

		LogoutAction action2 = new LogoutAction();

		result = action2.execute("hari");
		System.out.println();

	}
}


/*
INVOICE_MASTER
invoiceno - pk
date
customerid

CUSTOMER_MASTER
customerid
customername
customeraddress

INVOICE_TRANS
invoiceno - pk
itemno
itemqty

ITEM_MASTER
itemno - pk
itemdescription
itemprice
item unit
*/
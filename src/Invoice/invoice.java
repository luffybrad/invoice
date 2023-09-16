package Invoice;
public class invoice {
	public static void main(String[] args) {
		String sold_to="C026-01-0903/2022";
		String address="Collins Waweru";
		String date="28/04/2020";
		String contact_num="0100100100";
		int quantity1=4, quantity2=10, quantity3=9, quantity4=10;
		String item_description1="Pencil", item_description2="Duster", item_description3="Pens", item_description4="crayon";
		int unit_price1=20, unit_price2=50, unit_price3=30, unit_price4=80;
		float amount1=quantity1*unit_price1, amount2=quantity2*unit_price2, amount3=quantity3*unit_price3, amount4=quantity4*unit_price4;
		float subtotal_amount=amount1+amount2+amount3+amount4;
		double vat= 0.16*subtotal_amount;
		double total_amount=vat+subtotal_amount;
		System.out.println("**************************Adamson Computers Ltd*************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City  *  Tel. No:123-4567");
		System.out.println("                 VAT REG. TIN 098-765-4321-0000");
		System.out.println("                         SALES INVOICE\n\n");
		System.out.println("Sold to:"+sold_to+"                             Date:"+date);
		System.out.println("Address:"+address+"                                Contact Number:"+contact_num+"\n\n");
		System.out.println("=========================================================================");
		System.out.println("Qty     |     Item Description     |     Unit Price     |Amount");
		System.out.println("=========================================================================");
		System.out.println(quantity1+"       |          "+item_description1+"          |         "+unit_price1+"         |"+String.format("%.2f",amount1));
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(quantity2+"      |          "+item_description2+"          |         "+unit_price2+"         |"+String.format("%.2f",amount2));
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(quantity3+"       |           "+item_description3+"           |         "+unit_price3+"         |"+String.format("%.2f",amount3));
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(quantity4+"      |          "+item_description4+"          |         "+unit_price4+"         |"+String.format("%.2f",amount4));
		System.out.println("=========================================================================");
		System.out.println("                                          |Sub Total    |"+String.format("%.2f",subtotal_amount));
		System.out.println("                                          ===============================");
		System.out.println("                                          |VAT(16%)     |"+String.format("%.2f",vat));
		System.out.println("                                          ===============================");
		System.out.println("                                          |Total Amount |"+String.format("%.2f",total_amount));
		System.out.println("                                          ===============================");
	}

}

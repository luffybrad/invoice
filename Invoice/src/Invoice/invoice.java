package Invoice;

public class invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declarations
		String sold_to="C026-01-0917/2022", address="Bradley Kahoro";
		String date="28/04/2020";
		String contact_num="0100100100";
		int qty1=4, qty2=10, qty3=9, qty4=10;
		String item_desc1="Pencil", item_desc2="Duster", item_desc3="Pens", item_desc4="crayon";
		int unit_price1=20, unit_price2=50, unit_price3=30, unit_price4=80;
		float amt1=qty1*unit_price1, amt2=qty2*unit_price2, amt3=qty3*unit_price3, amt4=qty4*unit_price4;
		float subttl_amt=amt1+amt2+amt3+amt4;
		double vat_tax= 0.16*subttl_amt;
		double total_amt=vat_tax+subttl_amt;
		
		System.out.println("**************************Adamson Computers Ltd*************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City  *  Tel. No:123-4567");
		System.out.println("                 VAT REG. TIN 098-765-4321-0000");
		System.out.println("                         SALES INVOICE\n\n");
		System.out.println("Sold to:"+sold_to+"                             Date:"+date);
		System.out.println("Address:"+address+"                                Contact Number:"+contact_num+"\n\n");
		System.out.println("=========================================================================");
		System.out.println("Qty     |     Item Description     |     Unit Price     |Amount");
		System.out.println("=========================================================================");
		System.out.println(qty1+"       |          "+item_desc1+"          |         "+unit_price1+"         |"+String.format("%.2f",amt1));
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(qty2+"      |          "+item_desc2+"          |         "+unit_price2+"         |"+String.format("%.2f",amt2));
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(qty3+"       |           "+item_desc3+"           |         "+unit_price3+"         |"+String.format("%.2f",amt3));
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(qty4+"      |          "+item_desc4+"          |         "+unit_price4+"         |"+String.format("%.2f",amt4));
		System.out.println("=========================================================================");
		System.out.println("                                          |Sub Total    |"+String.format("%.2f",subttl_amt));
		System.out.println("                                          ===============================");
		System.out.println("                                          |VAT(16%)     |"+String.format("%.2f",vat_tax));
		System.out.println("                                          ===============================");
		System.out.println("                                          |Total Amount |"+String.format("%.2f",total_amt));
		System.out.println("                                          ===============================");


	}

}

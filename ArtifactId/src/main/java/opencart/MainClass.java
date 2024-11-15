package opencart;

public class MainClass 
{
    public static void main(String[] args) throws Exception
    {
    	OpencartURL obj1 = new OpencartURL();
    	obj1.openUrlOfopencart();
    	System.out.println("Opencart open successfully");
    	
    	Register obj2 = new Register();
    	obj2.register();
    	System.out.println("Susseccfully clicked on Register Option");
    	
    	AddProductToMyCart obj3 = new AddProductToMyCart();
    	obj3.addToCart();
    	System.out.println("Item added successfully");
    	
    	BillingDetails obj4 = new BillingDetails();
    	obj4.billing_method();
    	System.out.println("Billing details added succeefully");
    	
    	DeliveryDetails obj5 = new DeliveryDetails();
    	obj5.delivery_Meth();
    	System.out.println("Delivery details added succeefully");
    	
    	DeliveryMethod obj6 = new DeliveryMethod();
    	obj6.deliveryMethod();
    	System.out.println("Delivery Method added succeefully");
    	
    	PaymentMethod obj7 = new PaymentMethod();
    	obj7.payment_Meth();
    	System.out.println("Payment Method  added succeefully");
    	
    	ConfirmOrder obj8 = new ConfirmOrder();
    	obj8.confirmOrder();
    	System.out.println("Order confirmed succeefully");
    	
    	TrackOrder obj9 = new TrackOrder();
    	obj9.trackOrder();
    	System.out.println("Order Tracked succeefully");
	}
}

import java.util.*;

class Customer
{
  private String cust_name;
  private int cust_productid;
  private int cust_quantity;
  Scanner pc=new Scanner (System.in);
  Customer(ArrayList<Menu> menu)
  {
   System.out.println("Enter Your name:");
   cust_name=pc.next()+pc.nextLine();
   System.out.println("Enter the Productid:");
   cust_productid=pc.nextInt();
   System.out.println("Enter the quantity:");
   cust_quantity=pc.nextInt();
   
  boolean productfound=false;
  for(Menu m:menu)
  {
    if(m.getMenuId()==cust_productid)
    {
      productfound=true;
      if(m.getMenuQuantity()>=cust_quantity)
      {
          System.out.println("Your Order is successfull");
          System.out.println("Your Product name "+m.getMenuName()+" And Price is "+m.getMenuPrice());
          System.out.println("And your bill amount is "+(cust_quantity*m.getMenuPrice()));
         
          m.updateQuantity(m.getMenuQuantity()-cust_quantity);
          System.out.println();
          //System.out.println(m);
          
          
      }
      else
      {
         System.out.println("Insuffient stock");
      }
    }
    
  }
  if(!productfound)
  {
      System.out.println("Product Not there");
  }
  }
  
}

class Menu
{
  private int menu_id;
  private String menu_name;
  private int menu_price;
  private int menu_quantity;
  public Menu(int menu_id, String menu_name, int menu_price,int menu_quantity)
  {
    this.menu_id=menu_id;
    this.menu_name=menu_name;
    this.menu_price=menu_price;
    this.menu_quantity=menu_quantity;
  }
  
  public int getMenuId()
  {
    return menu_id;
  }
  public String getMenuName()
  {
    return menu_name;
  }
  public int getMenuPrice()
  {
    return menu_price;
  }
  public int getMenuQuantity()
  {
    return menu_quantity;
  }
  public void updateQuantity(int newQuantity)
  {
    this.menu_quantity=newQuantity;
  }

   @Override
   public String toString() {
        return "Menu ID: " + menu_id + ", Name: " + menu_name + ", Price: " + menu_price + ", Quantity: " + menu_quantity;
   }

   

}

class Rest
{
 public static void main(String argu[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Are you an admin or customer (1/2): ");
  int op=sc.nextInt();
  ArrayList<Menu> menu=new ArrayList<>(); 
  if(op==1)
  {
    
    while(true)
   { 
    System.out.println("if you want to enter menu item press 1 or else press 0");
    int opt=sc.nextInt();
    if(opt==0) break;
    System.out.println("Enter Menu items such as menu_id/name/price/quantity");
    int menu_id=sc.nextInt();
    String menu_name=sc.next()+sc.nextLine();
    int menu_price=sc.nextInt();
    int menu_quantity=sc.nextInt();
    menu.add(new Menu(menu_id,menu_name,menu_price,menu_quantity));
   }
   
   System.out.println("Products added Successfully");
   for(Menu me:menu)
   {
     System.out.println(me);
   }
   
   System.out.println("If you want to continue as a customer give your id: ");
   int cust=sc.nextInt();
   if(cust==2)
   {
     Customer c=new Customer(menu);
     System.out.println("Are you want to place another order?:");
     int until=sc.nextInt();
     while(until!=0)
     {
       
       Customer cu=new Customer(menu);
       for(Menu me:menu)
       {
       System.out.println(me);
       }
       System.out.println("Are you want to place another order?:");
       until=sc.nextInt();
     }
     
   }
   else
   {
     System.out.println("Sorry id not found");
   }
  }

  

 }

}
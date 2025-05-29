public class Product{
    private int id;
    private String name;
    private String description;
    private double price;
    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public void setid(int i){
        this.id=i;
    
    }
    public void setName(String n){
        this.name=n;
    }
    public void setDescription(String d){
        this.description=d;

    }
    public void setPrice(double p){
        this.price=p;
    }
    public Product(int id,String name,String description,double price){
        this.id =id;
        this.name=name;
        this.description=description;
        this.price=price;

    }
    public Product(){}
    public static void main(String[] args) {
        Product p=new Product(1,"mobile","cheapest mobile phone available",200000);
        System.out.println("id is :"+p.getid());
        System.out.println("name is "+p.getName());
        System.out.println("description is "+p.getDescription());
        System.out.println("price is "+p.getPrice());
    }
}
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
}
package coffeebar;

public abstract class Drink {
    //名字
    public String description = "";
    //价格
    public float price = 0f;

    public String getDescription() {
        return description+"-"+this.getPrice();
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public abstract  float cost();  //抽象方法 具体cost在单品内设置消费金额

}

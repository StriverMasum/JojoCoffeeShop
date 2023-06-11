public class CustomerOrder implements Item_Prices
{
    private int itemCode;
    private int itemQuantity;
    
    public CustomerOrder(){
        itemCode = 0;
        itemQuantity = 0;
    }
    public CustomerOrder(int itemCode, int itemQuantity){
        this.itemCode = itemCode;
        this.itemQuantity = itemQuantity;
    }
    public double processOrder(){
        double totalAmount = 0;
        
        switch(itemCode){
            case 1 :totalAmount = C_R_PRICE * itemQuantity;
                    break;    
            case 2 :totalAmount = C_L_PRICE * itemQuantity;
                    break;
            case 3 :totalAmount = DONUT_PRICE * itemQuantity;
                    break;        
            case 4 :totalAmount = WATER_PRICE * itemQuantity;
                    break;
            case 5 :totalAmount = PACK1_PRICE * itemQuantity;
                    break;
            case 6 :totalAmount = PACK2_PRICE * itemQuantity;
                    break;
        }
        return totalAmount;
    }
}
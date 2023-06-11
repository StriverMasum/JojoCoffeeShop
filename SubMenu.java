public class SubMenu extends Menu
{
    public void showMenu(){
        System.out.println("------------------------------------------");
        System.out.println("WHAT WOULD U LIKE TO ORDER : ");
        System.out.println("------------------------------------------");
        System.out.println("ITEM            PRICE");
        System.out.println("------------------------------------------");
        System.out.println("COFFEE REGULAR ($"+C_R_PRICE+")   - PRESS 1");
        System.out.println("COFFEE LARGE   ($"+C_L_PRICE+")   - PRESS 2");
        System.out.println("DONUT          ($"+DONUT_PRICE+")    - PRESS 3");
        System.out.println("GLASS O'WATER  ($"+WATER_PRICE+")    - PRESS 4");
        System.out.println("------------------------------------------");
        System.out.println("PACKS           PRICE");
        System.out.println("------------------------------------------");
        System.out.println("PACK 1         ($"+PACK1_PRICE+")    - PRESS 5");
        System.out.println("(CONTAINS 1 COFFEE LARGE AND 2 DONUTS)");
        System.out.println("PACK 2         ($"+PACK2_PRICE+")    - PRESS 6");
        System.out.println("(CONTAINS 2 COFFEE REGULAR AND 4 DONUTS)");
        System.out.println("\n#EXIT# - PRESS 7");
    }
}

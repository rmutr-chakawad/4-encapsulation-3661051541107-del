public class Pizza1107 {
    private static final int MAX_TOPPING = 10;
    private final String[] toppings;
    private int toppingCount;

    public Pizza1107() {
        toppings = new String[MAX_TOPPING];
        toppingCount = 0;
    }

    public void addTopping(String topping) {
        if (toppingCount >= MAX_TOPPING) {
            System.out.println("ขอโทษครับ เพิ่มเครื่องปรุงไม่ได้แล้ว เต็มที่แค่ " + MAX_TOPPING + " อย่างเท่านั้น!");
            return;
        }

        if (isDuplicate(topping)) {
            System.out.println("ใส่ \"" + topping + "\" ไปแล้ว อย่าใส่ซ้ำซิครับ 😅");
            return;
        }

        toppings[toppingCount++] = topping;
        System.out.println("เพิ่ม \"" + topping + "\" เรียบร้อยครับ 🍕");
    }

    private boolean isDuplicate(String topping) {
        for (int i = 0; i < toppingCount; i++) {
            if (toppings[i].equalsIgnoreCase(topping)) {
                return true;
            }
        }
        return false;
    }

    public int getToppingCount() {
        return toppingCount;
    }

    public int calculatePrice() {
        int basePrice = 100;
        int toppingPrice = 15; // เปลี่ยนราคาต่อเครื่องปรุง
        return basePrice + (toppingCount * toppingPrice);
    }

    public void showToppings() {
        if (toppingCount == 0) {
            System.out.println("ไม่มีเครื่องปรุงเลยครับ รับพิซซ่าแป้งล้วนไปก่อนนะ 😅");
        } else {
            System.out.println("รายการเครื่องปรุงของคุณ:");
            for (int i = 0; i < toppingCount; i++) {
                System.out.println("• " + toppings[i]);
            }
        }
    }
}

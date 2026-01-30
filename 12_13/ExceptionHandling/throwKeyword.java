class CouponMismatchedException extends Exception{
    CouponMismatchedException(String message){
        super(message);
    }
}

class Shopping{
    public static void applyDiscount(String coupon){
        if(coupon == "IILM50"){
            System.out.println("Congratulations.., 50% discount Applied");
        }else{
           try{
             throw new CouponMismatchedException("Invalid Coupon code");
           }catch(CouponMismatchedException e){
                e.printStackTrace();
           }
        }
    }
    public static void main(String[] args) {
        applyDiscount("IILM70");
    }
}

class typeConversion{
    public static void main(String[] args){
        {
            byte b = 127;
            //System.out.println(b);

            //TypeConversion
            int a = b;
            System.out.println("Th op is = " + a);// bcoz byte is less than int

            int c = 12;
            //TypeConversion
            byte by = (byte) c;
            System.out.println(by);
        }

        {
            float f = 5.6f;
            int i = (int) f;
            System.out.println(i);
        }

        {
            byte b1 = 10;
            byte b2 = 30;
            int b3 = b1*b2;
            System.out.println(b3);

        }
    }

}
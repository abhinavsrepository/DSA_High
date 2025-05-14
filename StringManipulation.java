public class StringManipulation {

    public static void main(String[] args) {
        String str = "The preparation of java Success Strarted";
        System.out.println(str.length());

        System.out.println(str.charAt(5));

        System.out.println(str.indexOf('s',20));
        System.out.println(str.indexOf('s',str.indexOf('s')+1));


    }

}

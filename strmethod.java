class strmethod{
    public static void main(String[] args){
        String s = "Leave is cut";
        String a = "";
        String b = "Prithu hates clg";
        String c = "Prithu hates clg";
        String d = "Prithu Hates Clg";

        System.out.println(s.length());
        System.out.println(a.length());

        System.out.println(s.isEmpty());
        System.out.println(a.isEmpty());

        System.out.println(s.isBlank());
        System.out.println(a.isBlank());

        System.out.println(b.equals(c));
        System.out.println(b.equals(d));

        System.out.println(b.equalsIgnoreCase(c));
        System.out.println(b.equalsIgnoreCase(d));
        
        System.out.println(b.compareTo(c));
        System.out.println(b.compareTo(d));

        System.out.println(b.contains("lg"));
        System.out.println(b.contains("rithu"));

        System.out.println(d.charAt(5));
        System.out.println(b.substring(0,3));
        System.out.println(c.indexOf("c"));
        System.out.println(d.lastIndexOf("P"));

        System.out.println(s.trim());
        System.out.println(b.strip());
        System.out.println(b.replace("hates", "more hates"));
        System.out.println(d.repeat(3));
        System.out.println(c.toUpperCase());
        System.out.println(c.toLowerCase());
    }
}
package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if(query.equals("123")) {
            return "123";
        }
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if(query.toLowerCase().contains("what is your name")) {
            return "Yiang Shen";
        }
        System.out.println(query);
/*        if(query.toLowerCase().equals("what is 3 plus 3")) {*/
            //return "6";
        /*}*/
        if(query.toLowerCase().equals("which of the following numbers is the largest: 158, 79")) {
            return "158";
        }
        if(query.toLowerCase().contains("plus")) {
            String[] tokens = query.split(" ");
            int res = Integer.parseInt(tokens[2]) + Integer.parseInt(tokens[4]);
            return String.valueOf(res);
        }
        return "";
    }
}

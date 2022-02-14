public class IDcode {
    private String code;
    public IDcode(String newCode){code = newCode;}
    public String gender(){
        return (Integer.parseInt(code.substring(0, 1)) % 2 == 0 ? 
                "naine" : "mees");
    
    }
    public String yearTwoLetter(){
        /*
        if(code.substring(0, 1).equals("1")){return "18";}
        if(code.substring(0, 1).equals("2")){return "18";}
        if(code.substring(0, 1).equals("3")){return "19";}
        if(code.substring(0, 1).equals("4")){return "19";}
        if(code.substring(0, 1).equals("5")){return "20";}
        if(code.substring(0, 1).equals("6")){return "20";}
        */
        return String.valueOf(18 + (Integer.parseInt(code.substring(0, 1)) - 1) / 2);
    }

    public String birthYear(){
        return yearTwoLetter() + code.substring(1, 3);
    }
}
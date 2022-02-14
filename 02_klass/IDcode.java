public class IDcode {
    private String code;
    public IDcode(String newCode){code = newCode;}
    public String gender(){
        return (Integer.parseInt(code.substring(0, 1)) % 2 == 0 ? 
                "naine" : "mees");
    
    }
}
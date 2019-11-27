public class TestDemo1 {
    public boolean func(String args) {
        String str = "123456";
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i) > '9'||str.charAt(i)<'0'){
                return true;
            }
        }
        return false;
    }

    public void main(String[] args) {
        String str = "123456";
        System.out.println(func(str));
    }
}

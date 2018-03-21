package controller;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author medo_zy
 * @Desciption:
 * @Date 2018-3-21 15:57
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username,String password){
        try {
            usernameRef = username;
            if(username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef=password;
            System.out.println("username = "+usernameRef+"\n password = "+passwordRef);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        
    }
}

public class Main {
    public static void main(String[] args) {

        //Синглетон
        assert Singleton.INSTANCE != null;


        //Билдер
        Account account = Account.newBuilder()
                .setToken("hello")
                .setUserId("world")
                .build();

        assert account != null && account.getToken().equals("hello") && account.getUserId().equals("world");
    }
}

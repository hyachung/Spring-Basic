package hello.core.singleton;

public class SingletonService {

    //자바가 뜰 때, static이라 객체 생성해서 넣음
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }
    //객체를 새로 생성하는 것을 막기 위해 private
    private  SingletonService(){

    }

    public  void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}

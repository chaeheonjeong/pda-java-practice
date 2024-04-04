package day02;
//
//// 우리는 상점에서 핸드폰을 구매합니다
//// 쏘니가 핸드폰을 샀습니다.
//// 베컴도 핸드폰을 샀습니다.
//
//// 쏘니가 핸드폰을 켰습니다.
//// "야 내가 핸드폰을 켜볼게"
//// "삐비빅"
//

// 베컴도 핸드폰을 켰습니다.
// "turn on"
// "bbeep"
public class EX02_2 {
    public static void main(String[] args) {
        Store store = new Store();
        Person sony = new Person("sony");
        Person beckham = new Person("beckham");


        sony.setPhone(store.getSamsungPhone());
        beckham.setPhone(store.getApplePhone());

        sony.turnOn("야 내가 핸드폰을 켜볼게");
        beckham.turnOn("turn on");
    }
}

class Store{
    Phone getApplePhone(){
        return new ApplePhone();
    }

    Phone getSamsungPhone(){
        return new SamsungPhone();
    }
}

class Person{
    private String name;
    private Phone phone;

    Person(String name){
        this.name = name;
    }

    void setPhone(Phone phone){
        this.phone = phone;
    }

    void turnOn(String talking){
        System.out.println(this.name + " : " + talking);
        phone.turnOn();
    }

}

class SamsungPhone extends Phone{
    void turnOn(){
        System.out.println("삐비빅");
    }
}

class ApplePhone extends Phone{
    void turnOn(){
        System.out.println("bbeep");
    }
}

class Phone{
    void turnOn(){
        System.out.println("삐릭삐릭");
    }
}

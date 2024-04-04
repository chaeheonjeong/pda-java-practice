# pda-java-practice

- 객체 : Store, Person, Phone
- 상속: Phone -> SamsungPhone, ApplePhone
```java
class Phone{
    void turnOn(){
        System.out.println("삐릭삐릭");
    }
}
```
```java
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
```
- 동작 방식: 
1. Person에서 새로 생성된 Phone 객체를 받아서 사용
  ```java
class Store{
    Phone getApplePhone(){
        return new ApplePhone();
    }

    Phone getSamsungPhone(){
        return new SamsungPhone();
    }
}
```

```java
sony.setPhone(store.getSamsungPhone());
beckham.setPhone(store.getApplePhone());
```

 2. Person에서 Phone의 turnOn 메서드 사용
```java
sony.turnOn("야 내가 핸드폰을 켜볼게");
beckham.turnOn("turn on");
```
```java
void turnOn(String talking){
        System.out.println(this.name + " : " + talking);
        phone.turnOn();
}
```

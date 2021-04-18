TreeSet 예제3



- 객체(참조형) TreeSet



class User {
    private String name;
    private int point;
 
    public User(String name, int point) {
        this.name = name;
        this.point = point;
 
    }
 
    @Override
    public String toString() {
 
        return String.format("%s(%d)", this.name, this.point);
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getPoint() {
        return point;
    }
 
    public void setPoint(int point) {
        this.point = point;
    }
 
}



이러한 User 클래스가 있을 때



TreeSet 생성자 안에 compare 메소드를 오버라이딩한 Comparator<> 익명객체를 삽입하는 방법



public class Example{
    public static void main(String[] args) {
        TreeSet<User> set = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User a, User b) {
                //포인트 순으로 정렬할 경우
                return a.getPoint()-b.getPoint();
                
                // 이름순으로 정렬할 경우
                //return a.getName().compareTo(b.getName());
            }
        });
        set.add(new User("홍길동", 100));
        set.add(new User("아무개", 10));
        set.add(new User("하하하", 55));
        set.add(new User("호호호", 90));
        set.add(new User("테스트", 42));
 
        System.out.println(set);
    }
}



출력 결과 : [아무개(10), 테스트(42), 하하하(55), 호호호(90), 홍길동(100)] (포인트순 오름차순 - 저거 더하기빼기 b.getPoint - a.getPoint 일캐 해주면 내림차순됩니다. )



- TreeSet 생성자의 ( ) 안에 TreeSet의 데이터형으로 제네릭형 Comparator 익명객체를 생성하여 넣어준다. 그리고 그안의 compare 메소드를 오버라이딩 해주면 이런식으로 TreeSet에 있는 참조형 객체데이터에 대한 정렬도 가능하다.



Comparable 인터페이스를 구현하여 정렬하는 방법

class Unit implements Comparable<Unit>{
    private String name;
    private int point;
    
    public Unit(String name, int point) {
        this.name = name;
        this.point = point;
    }
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
    @Override
    public int compareTo(Unit o) {
        return this.point - o.point;
    }
    @Override
    public String toString() {
        return "["+this.name+this.point+"]";
    }
}


Comparable 인터페이스를 구현하는 Unit 클래스가 있다고 할때, 이 Unit 클래스는 compareTo 메소드를 오버라이딩 해줍니다. 그렇게 되면 TreeSet에 값이 삽입될때 오버라이딩된 compareTo 메소드를 이용하여 정렬을 진행하게 됩니다.



TreeSet<Unit> uset = new TreeSet<Unit>();		

uset.add(new Unit("A",100));

uset.add(new Unit("B",120));

uset.add(new Unit("C",130));

uset.add(new Unit("D",140));

uset.add(new Unit("E",110));

System.out.println("uset"+uset); 



출력 결과 : uset[[A100], [E110], [B120], [C130], [D140]]

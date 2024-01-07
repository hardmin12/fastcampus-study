package fc.java.course2.part1;

import fc.java.model2.BookArray;
import fc.java.model2.Book;

public class MyBookArrayTest {
    public static void main(String[] args) {
        //책 3권의 데이터를 배열에 저장하고 출력하세요
        BookArray list = new BookArray(); //책, 길이 5
        list.add(new Book("자바", 15000, "한빛", "홍길동" ));
        list.add(new Book("C++", 17000, "대림", "이길동" ));
        list.add(new Book("python", 16000, "정보", "나길동" ));

        //Book vo=list.get(0);
        System.out.println(list.get(0)); //vo.toString()

        //vo=list.get(1);
        System.out.println(list.get(1)); //vo.toString()

        //vo=list.get(2);
        System.out.println(list.get(2)); //vo.toString()

        for(int i =0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}

package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;
public class GsonfromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@empas.com\"}";
        //JSON -> object(Member) Json 문자열을 오브젝트로 변환
        Gson gson = new Gson();
        Member mvo = gson.fromJson(json, Member.class);
        System.out.println("mvo = " + mvo); //mvo.toString() : Member{name='홍길동', age=30, email = 'bit@empas.com'}
    }
}

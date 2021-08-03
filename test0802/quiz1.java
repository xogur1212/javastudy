package test0802;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//student 클래스 ->id/tell

//이름을 키로하고 student 객체를 값으로 하는 해시맵

//검색햇을떄 번호만나오게

class Student{
	String id;
	String tell;
	public Student(String id ,String tell) {
		this.id=id;
		this.tell=tell;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	
	
	
}
public class quiz1 {

	
	public static void main(String[] args) {
		
		
		Student s1= new Student("1","100000");
		Student s2= new Student("2","200000");
		Student s3= new Student("3","300000");
		Student s4= new Student("4","400000");
		Student s5= new Student("5","500000");
		
		HashMap<String,String> h1=new HashMap<String,String>();
		h1.put(s1.id, s1.tell);
		h1.put(s2.id, s2.tell);
		h1.put(s3.id, s3.tell);
		h1.put(s4.id, s4.tell);
		h1.put(s5.id, s5.tell);
		
		
		Set<String> keys =h1.keySet();
		Iterator<String> it =keys.iterator();
		
		
		while(it.hasNext()) {
			String id= it.next();
			String tell =h1.get(id);
			
			System.out.println(id +"의 번호는" + tell +"입니다");
		}
		
	}
	
}

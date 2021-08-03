package test0802;


import java.util.ArrayList;
import java.util.Scanner;


class Student2{
	String name;
	String subject;
	String ID;
	String averageScore;
	public Student2(String name,String subject,String ID,String averageScore) {
		this.name=name;
		this.subject=subject;
		this.ID=ID;
		this.averageScore=averageScore;
	}
}
public class test05 {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("학생 이름, 학과,학번,학점평균을 입력하세요. 각 사이에 쉼표를 넣으세요  ex) 황기태, 모바일, 1, 4.1 뛰어쓰기도해야됨");
	
		String a;
		String b[]=new String[4];
		ArrayList<Student2> a1=new ArrayList<Student2>();
		ArrayList<Student2> name2=new ArrayList<Student2>();
		
		
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			a=sc.nextLine();
			b=a.split(",");
			a1.add(new Student2(b[0],b[1],b[2],b[3]));
			 
		}
		System.out.println("------------------------");
		for(int i=0;i<4;i++) {
			String name=a1.get(i).name;
			String subject=a1.get(i).subject;
			String ID=a1.get(i).ID;
			String averageScore=a1.get(i).averageScore;
		
			System.out.println("이름 "+ name);
			System.out.println("학과 "+ subject);
			System.out.println("학번 "+ ID);
			System.out.println("학점평균 "+ averageScore);	
			System.out.println("------------------------");
		}
		System.out.print("학생이름 >> ");
		String findname=sc.next();
		for(Student2 obj : a1)
        {
            if(obj.name == findname)
            {
                name2.add(obj);
            }
        }
	//	Student2 name=name2.get(i);
	//	String name2=name2.get(2);
	}
}

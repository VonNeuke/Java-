package p2;
//test2.java
public class test2 {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		st1.setName("����");
		st1.setAge(21);
		st2.setName("�����");
		st2.setAge(22);
		System.out.println("�޸ĺ�");
		System.out.println(st1.getName()+"��"+st1.getAge());
		System.out.println(st2.getName()+"��"+st2.getAge());
		System.out.println("�����ģ�");
		if(st1.getAge()>st2.getAge()){
			System.out.println(st1.toString());
		}else{
			System.out.println(st2.toString());
		}
	}
}

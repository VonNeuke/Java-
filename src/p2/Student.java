package p2;
//Student.java
public class Student {
	private String id;
	private String cid;
	private String name;
	private String sex;
	private int age;
	Student(){
		id = "B14090501";
		cid = "B140905";
		name = "Jack";
		sex = "Male";
		age = 18;
	}
	public String getId(){
		return id;
	}
	public String getCid(){
		return cid;
	}
	public String getName(){
		return name;
	}
	public String getSex(){
		return sex;
	}
	public int getAge(){
		return age;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setCid(String cid){
		this.cid = cid;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String toString(){
		return "ѧ�ţ�"+id+"\n��ţ�"+cid+"\n������"+name+"\n�Ա�"+sex+"\n���䣺"+age;
	}
}

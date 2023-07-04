package opm.construct;

public class mytest {

	public static void main(String[] args){

		tuna tunaEX = new tunaEX("tt",12);

		System.out.println(tunaEX.age);

	}
}

class tuna {
	public String name;
	public int age;

	protected tuna(){}

	public tuna(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class tunaEX extends tuna {

	public tunaEX(String name, int age){
		this.name = name;
		this.age = age;
	}
}
